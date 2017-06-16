package MoreGroovyExercises

/**
 * Created by cnapoles on 6/13/17.
 */

class EnDeCODE{
    static void main(String[] xxxx){

        //Declaration of String variable
        String username = 'chanapoles'
        String password = 'pword'

//declaring & printing combination variable that contains the concatinated username and password that is separated by a colon
        def combination = username + ':' + password
        println "Concatinated username & password -> $combination"

//using bytes method from String Class of Java to convert the total string into byte array
        def byteArray = combination.bytes
        println "Total string into byte array -> $byteArray"

//encodeBase64() method Produce a Writable object which writes the Base64 encoding of the byte array.
        def base64EncodedVar = combination.bytes.encodeBase64().toString()
        println "Using Base 64 encoded -> $base64EncodedVar"

        byte[] base64decodedVar = base64EncodedVar.decodeBase64()
        String decoded = new String(base64decodedVar)
        println "Using base 64 decoded -> $decoded"

        println decoded.split()

        assert combination.split() == decoded.split()


    }


}