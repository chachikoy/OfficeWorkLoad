package GroovyExercises

/**
 * Created by cnapoles on 6/13/17.
 */

//initializing multiLineString List variable that contains multiple line of strings
def multiLineString = """Hello, how are you today? 
                                 I hope that you are doing good."""

List list = multiLineString.readLines().findAll(){!(it.equals(""))}.collect(){it.trim()}
String data = list.join(',')
println(data)

//by using findAll(pattern),
// the function of this is to find all the vowels in the declared multiLineString varibale
// and put the collected vowels in a list
// the size() method is to get the total number of element in the list of vowels
println multiLineString.findAll('[aeiou]').size()
