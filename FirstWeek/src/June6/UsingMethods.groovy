package June6
/**
 * Created by cnapoles on 6/6/17.
 */
class MethodTutorial{

    static void main(String[] args){

//        userInput()
//        println getSum(87.32, 54.321)
//        println factorial(8)

// factorial using Closure
        def getFactorial = {num ->
            (num <= 1 ? 1
                    : num * call(num - 1))
        }
        println("Factorial of 8 using Closure ${getFactorial(8)}" )


        def greeting ="good bye"
        def sayGodbye = {theName -> println("$greeting $theName")}
        sayGodbye("Cha")
  println palindrome('cha')
    }

    static def userInput(){
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in))
        print("what is your name? ")
        def name = br.readLine();
        println("Your name is ${name}")
    }

    static def getSum(num1,num2){
        return num1 + num2
    }

    static def factorial(num){
        if (num <= 1)
            return 1
        else
            return (num * factorial(num - 1))
    }
    static def palindrome(word){
        def reversed = word.reverse()
        if (word.equals(reversed))
            return 'it is palindrome'
        else
            return 'not palindrome'
    }

}