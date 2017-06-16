/**
 * Created by cnapoles on 6/16/17.
 */
 Expando e = new Expando()

BufferedReader br = new BufferedReader(new InputStreamReader(System.in))
println "Enter name please: "
e.name = br.readLine()

e.greet = {String msg -> "Hi $name this is my message $msg"}

println "Enter greetings: "
def greeting = br.readLine()
println e.greet(greeting)
