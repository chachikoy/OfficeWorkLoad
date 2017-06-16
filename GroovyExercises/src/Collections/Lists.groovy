package Collections

/**
 * Created by cnapoles on 6/13/17.
 */

def strings = ['Red Sox', 'Yankees']
// the purpose of this assert is to test if the class of strings list variable is default ArrayList
assert strings.class == java.util.ArrayList
// Orioles & Blue Jays added to a strings by using concatination or plus operator
println strings + ['Orioles', 'Blue Jays']
//it is a testing or checking the equality of strings variable with the concatinated list of values
assert strings + ['Orioles', 'Blue Jays'] ==
        ['Red Sox', 'Yankees', 'Orioles', 'Blue Jays']
//this simply test, if the original list of strings variable initiated was not affected by the concatinated values
//simply, by using concatination the originial lists will not affect
assert strings == ['Red Sox', 'Yankees']
println strings

//In this part, it uses the left shift operator,
//the values added by using the left shift operator will effect the original lists
strings << ['Orioles', 'Blue Jays']
println strings
//NOTE: the list added will include a box bracket [] to identify the added lists
assert strings == ['Red Sox', 'Yankees', ['Orioles', 'Blue Jays']]

//By using, minus operator, it is not just used in numbers only but also in string,
//specially in List w/o using the indices but specifying the element
// like the + operator for concatination, this reducing of element doesn't effect the list variable
println strings - 'Yankees'
assert strings - 'Yankees' ==   ['Red Sox', ['Orioles', 'Blue Jays']]

//Ranges for indices
// -->0 1 2 ........... -3 -2 -1 <--
// [(-3)<- Red Sox (->0), (-2)<- Yankees (->1), (-1)<- [Orioles, Blue Jays] (->2)]
println "Strings [0..2] = ${strings[0..2]}"
println "Strings [-3..-1] = ${strings[-3..-1]}"
println "Strings [1..-1] = ${strings[1..-1]}"
println "Strings [0,2] = ${strings[0, 2]}"

//using flatten method
//flatten method is to remove the box bracket,
// and make the list as a single list without having another group of list inside one list
strings = strings.flatten()
println("In using Flatten = $strings")
println "Strings [0..2] = ${strings[0..2]}"
println "Strings [-3..-1] = ${strings[-3..-1]}"
println "Strings [1..-1] = ${strings[1..-1]}"
println "Strings [0,2] = ${strings[0, 2]}"
assert strings == ['Red Sox', 'Yankees', 'Orioles', 'Blue Jays']
def nums = [3, [1, [4, [1, 5], 9], 2], 6]
println "withot using Flatten = $nums"
println "With using Flatten ${nums.flatten()}"
assert nums.flatten() == [3, 1, 4, 1, 5, 9, 2, 6]

//spread dot is a shortcut for collect to invoke a method on EACH element
println "Using spread Dot operator = ${strings*.size()}"
assert strings*.size() == [7, 7, 7, 9]
//using collect (closure) to get the first 3 chars. of each element
println "Collect the first 3 characters of EACH element = ${strings.collect {it[0..2].toLowerCase()}}"
assert strings.collect {it[0..2].toLowerCase()} == ['red', 'yan', 'ori', 'blu']

//in using join
nums = nums.flatten()
println "Using join = ${nums.join(',')}"
println "Using join = ${nums.join('***')}"
assert nums.join(',') == '3,1,4,1,5,9,2,6'
assert nums.join('***') == '3***1***4***1***5***9***2***6'