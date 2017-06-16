package June7at4pm

/**
 * Created by cnapoles on 6/7/17.
 */
class Methods{
    static void main(String[] args){

       println factorial().call(5)
        println palindrome("Cha")
    }
     static def factorial(n){
         {num ->
              if (num <= 1)
                  return 1
             else
                  return num * call(num - 1)
         }
     }
    static def palindrome(word){
        def Olength = word.length()
        def reversed = ""
        for (int n= Olength-1;  n >= 0; Olength--){
            reversed = reversed + word.charAt(n)
        }
        if (reversed.equals(word))
            return "Palindrome"
        else
            return "Not"

    }

}


