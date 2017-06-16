package June82017

/**
 * Created by cnapoles on 6/8/17.
 */

class mapsSets{
    static void main(String[] args){

      // maps()
       // sets()
       // StringList()
      //  ClosureIteration()
     // Collectionsss()
     //   println Factorial().call(5)
        mapToList()

    }

    static void maps(){
        def map = [a:1, b:2, c:3, d:4]
        println map.getClass().name
        map.put('e', 5)
        map.f = 6
        println map
        print map.findAll {k,v ->
           if(k == 'c')
                "[$k] = $v"}
    }
    static void sets(){
        def nums = [3,1,4,2,6,7,5,1] as LinkedList


        println nums.findAll{ it % 2 == 0}
        println nums.sort()
        println nums.class.name
    }
    static void StringList(){
        def word = 'this is a string as you can see'.split()
        println word

  //      println word.capitalize()
    //    println word.previous()

        word = word.findAll(){it[0].contentEquals('s')}


        println word
    }
    static void ClosureIteration(){
        def nums = [3,1,4,2,6,7,5,1]
        nums.each { n ->
            println n}
        nums.eachWithIndex{ n, idx ->
            println "[$idx] : $n"}

        def m = [a:1, b:2, c:3, d:4]
        for (String key : m.keySet()) {
            def val = m[key]
            println "map[$key] = $val"
        }
        m.each {e ->
            println "m[${e.key}] == ${e.value}"
        }
        m.each {k,v ->
            println "map[$k] == $v"
        }

        10.downto(7, {println it} ) //groovy with a java accent
        10.downto(7) {println it} // idiomatic groovy
    }
    static void Collectionsss(){
        List nums = [3,1,4,2,6,7,5,1]

          println nums.collect {it * 2}
        println nums.findAll{it % 2 == 0}
        println()

        def m = [a:1, b:2, c:3, d:4]
        println m.collect {k,v -> "$k=$v"}.join("**")
    }
    static def Factorial(m){
        { num ->
            if(num <= 1)
                return 1
            else
            return num * call(num -1)
        }
    }

    static def mapToList(){
        def words = ['Ubuntu', 'Android', 'Mac OS X', 'Windows']

// simple conversion
        def result = words.collectEntries {
            [(it):0]
        }
        println result

        assert result.size() == 4
        assert result.Ubuntu == 0

// now calculate value with a closure, true if word contains "n"
        def map = words.collectEntries {
            [(it): it.contains('n')]
        }

        println map
    }
}