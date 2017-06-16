package GroovyExercises

/**
 * Created by cnapoles on 6/13/17.
 */

//Initializing list nums variable
def nums = [5, 51, 8, 23, 11, 20, 16]

println "Printing number list = $nums"
//using sum() method, it will generate the total of all the elements
println "Sum of all the elements = ${nums.sum()}"
// muliply() method is one of the operator overloading that the groovy offere
println "double each # = ${nums.multiply(2)}"

println "double each # and add together = ${nums.multiply(2).sum()}"
//getting the average of the list
println "double each # and add together = ${(nums.multiply(2).sum() / 14)}"