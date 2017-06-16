package GroovyExercises

/**
 * Created by cnapoles on 6/13/17.
 */

//for-in loop with the ranging condition is to generate the numbers from 0 to 15
for (number in 0..15)
    println number + ' = ' +Integer.toBinaryString(number)
// the Integer.toBinaryString() method is from the java.lang.String
// the purpose of it is to convert the Integer into binary