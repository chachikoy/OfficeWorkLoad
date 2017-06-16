package June82017

/**
 * Created by cnapoles on 6/8/17.
 */

class AllAboutClosure {
    static void main(String[] args) {

        List scores = [72, 43, 29, 96, 93, 33, 49]
        def s = 'this is a string'
        println s.class.name
        println s.findAll('st')
        s.eachWithIndex{ let, idx -> println "$idx = $let" }

        println scores.class.name
        println scores.intersect([72,43])
        println scores.pop()
        scores.putAt(5, 3)
        scores.leftShift(1)
        scores << 6
        def num = 5

        println scores

        //scores.eachWithIndex {num, idx -> println "$idx = $num" }
        //println(scores.add(5))




    }


}