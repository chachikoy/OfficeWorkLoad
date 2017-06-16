package June6
/**
 * Created by cnapoles on 6/6/17.
 */

List num = [3,1,4,1,5,9]
num.each { n ->
    print " $n"
}
println()
//the n or the first declared value is the list value inside the num List
//while the idx or the 2nd declared value is represent the index
num.eachWithIndex{ n, idx ->
    println "num[$idx] == $n"
}
//iteratiion
Map m = [a:1, b:2, c:3]
for(String key : m.keySet()) {
    def val = m[key]
    println "mp[$key] = $val"
}

//factorial
def getFactorial = {num2 -> (num2 <= 1 ? 1 : num2 * call(num2 - 1))}
println("Enter number:" )
BufferedReader br = new BufferedReader(new InputStreamReader(System.in))
def numInputted = br.readLine().toInteger()
println("Factorial of $numInputted is ${getFactorial(numInputted)} ")

m.each {k,v -> println "m[$k] == $v"}

10.downto(5) {println( it)}