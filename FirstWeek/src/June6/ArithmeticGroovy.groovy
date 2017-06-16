package June6
/**
 * Created by cnapoles on 6/6/17.
 */
class Arithmetic{
    static void main(String[] args){
        def num1 = 8
        def num2 = 8

        println("${num1} + ${num2} = " + (num1.plus(num2)))
        println("${num1} * ${num2} = " + (num1.multiply(num2)))
//Strings
        def firstString = "charlotte Napoles"
        def multistring = """hello,
                    I am Charlotte
                    Napoles"""
        println multistring.stripIndent(20)
        println(firstString)
                println("third index "+ firstString[3])
                println("index of o is "+ firstString.indexOf('o'))
                println("Substring at 4 "+ firstString.substring(4))
                println("Substring at 4 to 12 "+ firstString.substring(4, 12))
                println('spliting string '+ firstString.split(' '))
                println('to List String '+ firstString.toList())
                println('replacing '+ firstString.replaceAll('a', '*'))
                println "drop ${firstString.drop(5)}"


        println()
        println("User Input....")

//User Input
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in))
        print("what is your name? ")
        def fname = br.readLine()
        println("Hello "+ fname)
        print("Enter 2 numbers : ")
        def num4 = br.readLine().toDouble()
        def num5 = br.readLine().toDouble()
        printf("%.2f + %.2f = %.2f \n", [num4, num5, (num4+num5)])

//numbers
        def primes = [7,3,5,2,13,11]
        println("matches "+ primes.intersect([5,4,7]))
        println("Reverse: "+ primes.reverse())
        println("Sort: "+ primes.sort())
        println("Last "+ primes.pop())

//Mapping

        println("\nMapping Topic")
        def chaMap = ['name' : 'Charlotte',
                        'age' : 20,
                        'address' : 'Valenzuela City'
                    ]


        println("Name "+chaMap['name'])
        println("Age " + chaMap['age'])
    }
}