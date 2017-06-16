package forObjects

/**
 * Created by cnapoles on 6/6/17.
 */

class MainGroovy{
    static void main(String[] args){

        def king = new Animal('jungle king', 'roar')
        println("$king.name says $king.sound")
        king.setSound('owoOOOowowo')
        println("$king.name says $king.sound")
        king.run()

        println(king.toString())

        def groover = new Dog('Groover', 'awAwaW', 'sofia')
        king.makeSound()
        groover.makeSound()
    }
}
