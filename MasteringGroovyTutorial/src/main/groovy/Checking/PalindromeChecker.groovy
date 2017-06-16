package Checking

/**
 * Created by cnapoles on 6/15/17.
 */

class PalindromeChecker{
    boolean isPalidrome(String s){
        String testString = s.replaceAll(/\W/, '').toLowerCase()
        return testString == testString.reverse()
    }
}