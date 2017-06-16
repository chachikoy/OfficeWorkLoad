package June7at4pm

import groovy.transform.*
//AST -
/**
 * Created by cnapoles on 6/7/17.
 */
@Canonical
//@Canonical includes equals method, toString Method, HashCodde Method, Tuple constructor method
class Person{
    String first
    String last

}
//new Person() is what you called instances
Person p1 = new Person(first: 'Larry', last: 'Bird')
Person p2 = new Person(first: 'kevin', last: 'Mchel')
Person p3 = new Person( 'robert',  'parrish')
List people = [p1, p2, p3]
Set people2 = [p1, p2, p3]
println people2
println people
//in using spread
println people*.last
println people.collect {"$it.first $it.last"}
                .findAll{it.size() > 10}
                .join(', ')

