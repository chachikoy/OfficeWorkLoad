package SpockTesting

import Checking.PalindromeChecker
import spock.lang.Specification
import spock.lang.Unroll

/**
 * Created by cnapoles on 6/15/17.
 */

class PalindromeCheckerSpec extends Specification{
    PalindromeChecker checker = new PalindromeChecker()

    def palindromes = [
            'racecar',
            'Sex at noon taxes',
            'Do geese see God?',
            'Flee to me, remote elf',
            "Madam, in Eden, I'm Adam",
            "Go hang a salami; I'm a lasagna hog!"
    ]

    def "all the listed are strings are palindromes"(){
//        given:
//        palindromes << 'this is NOT a palindrome'

        expect:
        palindromes.every {str ->checker.isPalidrome(str)}
//        palindromes.each {p ->
//              assert   checker.isPalidrome(p)
 //     }
    }

    def "this is not a palindrome"(){
        expect:
        !checker.isPalidrome('this is NOT a palindrome')
    }
}