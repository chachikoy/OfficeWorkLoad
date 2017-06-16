package June6
/**
 * Created by cnapoles on 6/6/17.
 */
class RangeLists{
    static void main(String[] args){

        def range = [32,24,36,14,5,7,8,4,11,10]
        println(range)
        println range.class.name
       println range.drop(4)
        println()
        range.eachWithIndex{ num, idx -> println "using eachWithIndex $idx: $num" }
        println()
        range.each {num2 -> println("using each $num2")}
        println "using Drop ${range.drop(5)}"
        println "using class ${range.class}"
        println "using pop ${range.pop()}"
        println "using sort ${range.sort()}"
        println "using reverse ${range.reverse()}"
        println "using intersect ${range.intersect([4,5,12])}"

        println()
        Collection strings = 'this is a list of strings'.split()

        println(strings)

        Date date = new Date()
        println(date - 1)

        def map = [a:'one', b:'two', c:'three', d:'four', e:'five']
        map.collect {f,g -> println "using collect in map $f=$g"}
        println "getting class ${map.getClass()}"
    }
}