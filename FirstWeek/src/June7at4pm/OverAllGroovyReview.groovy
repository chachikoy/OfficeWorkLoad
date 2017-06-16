package June7at4pm

/**
 * Created by cnapoles on 6/7/17.
 */

class Review {
 static void main(String[] args){

 //   dataTypes()
//    Collectionsss()
//   ClosureTopic()

//     test = test.toLowerCase().replaceAll(/\W/, '')
//     def length = test.length()
//     def redLength = --length
//     def reverse = test[redLength..0]
//     reverse = reverse.toLowerCase().replaceAll(/\W/, '')
//     println isPalindrome("tapat")

     lastFriday()




 }
    static void dataTypes(){
        // def is dynamic type
        def x = 1
        println x.class.name
        x = 'abc'
        println x.class.name
        x = new Date()
        println x.class.name
        x = 1.0000
        println x.class.name
        println()
    }

    static void Collectionsss(){
        println("For collections method")
        List nums = [3,1,4,1,5,9]
        /*List can be
        LinkedList nums = [.....]
        List nums = [...] as SortedList
        */
        println nums
        println nums.class.name

        //using map
        println()
        println("using map")
        def map = [a:1, b:2, c:3]
        println map
        println "Key Set  : ${map.keySet()}"
        println "Entry Set : ${map.entrySet()}"
        println "Map Values : ${map.values()}"

        // in map of groovy can use dot operator (.) to assign value, using array  acces, and get method
        println map
        println "adding using dot operator e.g.(map.d = 3)${map.d = 3}"
        println "addng values using array e.g. (map['e'] = 2)${map['e'] = 2}"
        println "adding values using java declaration e.g. map.put('f', 1) ${map.put('f', 1)}"
        println map

        println()
    }
    static void ClosureTopic(){
        println "Closure Topic"
        List sampString = 'hello i am charlotte napoles at your sevice'.split()
        //the output of .split() method will be an array
        println sampString
        println sampString.class.name

        //closure
        //iterate over collection ; the closure defines between the curly braces
        //the purpose of the .each method is to takes all the element of the collection and feed it to the closure 1 by 1, you cannot giv two arguments
        // s or any variable that you put at the beginning of the closure is what can call 'dummy data type' using the arrow notation ;
        // you  can also put specific datatype as the declaration of what type of data you are looking in the dummy variable
        sampString.each { s ->
            println "checking the list w/o index $s"
        }
        println()
        println("with index")
        sampString.eachWithIndex{ spec, idx ->
            println "list with index sampString[$idx] = $spec"
        }

    }
    static def isPalindrome(s){
        // the small \w --> is a-zA-Z0-9_
        //the capital \W is opposite od the \w e.g. special characters(,.<>?/ etc) and spaces
        String test = s.toLowerCase().replaceAll(/\W/, '')
        def length = test.length()
        def redLength = --length
        def reverse = test[redLength..0]
        reverse = reverse.toLowerCase().replaceAll(/\W/, '')
        println reverse
        println test

        if(test.equals(reverse))
            return "it is palindrome"
        else
            return "it is not palindrome"



        println()
    }
    static void lastFriday(){
        def info = [name : 'allan', age : 17,
                    name : 'mark', age : 30,
                    name : 'cha', age : 18,
                    name : 'kaps', age : 25]

        println info.collect {"$it.value"}
                    .findAll {it.values <=18}
                    .join(',')

    }




}