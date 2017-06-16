import groovy.transform.EqualsAndHashCode
import groovy.transform.ToString

/**
 * Created by cnapoles on 6/14/17.
 */
//Expando - no properties and no methods


Expando e = new Expando()
e.name = 'Fido'
e.speak = { "$name says wooof!"}
println e.speak()


class Dog{ }
Dog.metaClass.name = 'Phydeaux'
Dog.metaClass.speak = {"$name say woof!"}
Dog.metaClass.gender = {sex -> "$name is a $sex"}

//Dog.metaClass.speak = {msg ->"$name say $msg!"}

Dog d = new Dog()
println d.gender('Male')
println d.speak()
d.name = 'Rover'
println d.speak()

@ToString(includeNames = true)
@EqualsAndHashCode
class Person {
    String firstName
    String lastName
}

Person p = new Person(firstName: 'Guillaume', lastName: 'Laforge')
println p.toString()
assert p.toString() == 'Person(Guillaume, Laforge)'

Person p1 = new Person(firstName: 'Guillaume', lastName: 'Laforge')
Person p2 = new Person(firstName: 'Guillaume', lastName: 'Laforge')

assert p1 == p2
println p1.hashCode()
println p2.hashCode()
assert p1.hashCode() == p2.hashCode()