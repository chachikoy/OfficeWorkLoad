package June82017

import java.util.stream.IntStream

/**
 * Created by cnapoles on 6/8/17.
 */
class ManipulationOfData {

   static void main(String[] aaa){

     InTheList()
//    IteratitiveWithNum()
//    Sorting()
//       Dating()
//       Streaming()
  //     Emptymap()
   }

    static void InTheList(){
        List nums = [3, 1, 4, 1, 5, 9]
        println """using collect ${nums.collect{ it * 2}
                .findAll{it % 3 == 0}
                .sum()   }"""

        println nums << [5, 6, 9]
        println nums
        // creating newList
        println nums.flatten()
        println nums * 2



        nums = nums.flatten()
        println nums * 2
        //in methos is to check the value
        println 9 in nums
        println 7 in nums

        println "using combinitations ${[[1,2,3], ['a','b',]].combinations()}"

        println("using permutations ${['a','b','c'].permutations()}")
    }

    static void IteratitiveWithNum(){
        5.times {println "Times + $it "}
        1.upto(3) {println "Up + $it "}
        4.downto(1) {print "Down + $it "}
        println()
        def sum = 0
        1.upto(100) {sum += it}
        print sum
        println()
        (1..6).each {print "Range $it"}
    }
    private String name;
    private int priority;
    private Date startDate;
    private Date endDate;
    private boolean completed;


    static void Sorting(){
        def List strings = "this is a long sentence".split()
        strings.sort({s1, s2 -> s1.size() <=> s2.size()})
        println strings


    }

    static void Dating(){
        Date now = new Date()
        Date then = now + 3

        for(Date d: (now..then)){println "Now then $d" }
        for (d in (now..then)){println "Now then using in $d" }
        //One-arg closure with default arg (it)
        (now..then).each {println it}
        //one-arg closure with default arg (d) with format
        (now..then).each {d -> println d.format('yyyy-MMM-dd')}

        (now..then).eachWithIndex{val, idx ->
            println "Index $idx assigned to $val"
        }
    }

    static void Streaming(){
      println  IntStream.of(3,1,4,1,5,9)
                .map{ it * 2}
                .filter{ it % 3 == 0}
        .sum()
    }
    static void Emptymap(){
        def map = [:]

        map.k1 = 'v1'
        map['k2'] = 'v2'
        map.put('k3', 'v3')
        println map.keySet()

        map.each {println "${it.key} maps to ${it.value}"}

        map.each {k,v -> println "$k associated with $v"}
    }


}



