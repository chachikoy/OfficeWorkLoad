package June92017

/**
 * Created by cnapoles on 6/9/17.
 */
class DiffOperators{
    static void main(String[] args){
   // usingSpaceShip()
        spreadDotOperator()
   //     usingSafeNavigation()
    }

    static void usingSafeNavigation(){
       //it uses elvis operators
        String name = 'RR kkk'

       def n = name ? 'hi' : ''
       println "Hello $n"
    }
    static void usingSpaceShip(){
// Spaceship explains by the following result
//        assert 2 <=> 4 == -1
//        assert 4 <=> 4 == 0
//        assert 6 <=> 4 == 1

        def x=1
        def y=4
        def z =6

        println x <=> y //-1
        println z<=>y //1
        println y<=>y //0
    }
    static void spreadDotOperator(){
        // it is convinient to use the spread dot operator if you need simple output
        // or your code has simple function
        def strings = ['this', 'is', 'a', 'list', 'of', 'strings']
        assert strings.size() == 6  // apply size() to the list
        assert strings*.size() == [4, 2, 1, 4, 2, 7] // apply size() to each element
        assert collect{it.size()} == [4,2,1,4,2,7]
    }

}


