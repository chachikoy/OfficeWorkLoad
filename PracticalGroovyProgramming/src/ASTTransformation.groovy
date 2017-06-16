import groovy.transform.ToString

/**
 * Created by cnapoles on 6/14/17.
 */

/*
@ToString
class Person{
    String fname
    String lname
}

Person p = new Person(fname: 'cha', lname: 'napoles')
println p.toString()
*/

class Phone {
    String dial (String num){
        "Dialing $num"
    }
}

class Camera{
    String takePicture(){
        'Taking picture...'
    }
}

class SmartPhone{
    @Delegate Phone phone = new Phone()
    @Delegate Camera camera = new Camera()
}

SmartPhone sp = new SmartPhone()
assert sp.dial('555-1234') == 'Dialing 555-1234'
assert sp.takePicture() == 'Taking picture...'
