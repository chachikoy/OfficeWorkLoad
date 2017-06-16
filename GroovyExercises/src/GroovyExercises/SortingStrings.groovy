package GroovyExercises

/**
 * Created by cnapoles on 6/13/17.
 */

//declration of list variable
def stringsList = ['watermelon', 'apple', 'grapes', 'pineapple', 'lemonade']

println "Printing string list = $stringsList"
//in using sort() method the arrangement of the list will be arrange alphabetically
// if you add false as a parameter of .sort(false), the arrangement will not take effect once the list called again

println "Sorted Alphabetically = ${stringsList.sort()}"
// since there's no false parameter in the sort() method. The list still is in alphabetical arrangement
println "Sorted them by length ${stringsList*.size()}"

//the purpose of the -it.size is to arrange the list of string in descending or from highest size to shortest
println "Sorted by length in descending order = ${stringsList.sort {-it.size()}}"

//reverse() method is self explanatory which arranging the list oppositely
println "Sorted by length, reverse = ${stringsList.reverse()}"