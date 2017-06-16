/**
 * Created by cnapoles on 6/14/17.
 */

class sampleIO{
    static void main(String[] args){

            withLooping()
    }

    static void noLooping(){
        println 'Please enter some number to sum'
        int total = 0
        System.in.withReader { br ->
            total = br.readLine().tokenize()*.toInteger().sum()
        }
        println "The total is $total"
    }

    static void withLooping(){
        println 'Sum numbers with looping'
        System.in.eachLine {
                line -> if(!line) System.exit(0)
                    println line.split()*.toBigDecimal().sum()
        }
    }
}