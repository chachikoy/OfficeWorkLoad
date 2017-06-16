package GroovyExercises

/**
 * Created by cnapoles on 6/13/17.
 */

// declatation of list variable
// the default class of list in Groovy is ArrayList
def nums = [-1, 51, 8, -2, 11, -8, 16]

//using findAll{closure}, can filter the list by having a condition on it
//it is a default name of any arguments in using closure
println "${nums.findAll {it > 0 }}"
