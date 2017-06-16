package June92017

/**
 * Created by cnapoles on 6/9/17.
 */

class Department{
    Manager boss
}
class Manager{
    String name
}

Department d = new Department(boss: new Manager(name: 'Mr Slate'))
println d.boss.name

//?. (safely navigation) is to check the value if it's null or not, if it see that the looking value is
d = new Department()
println d?.boss?.name