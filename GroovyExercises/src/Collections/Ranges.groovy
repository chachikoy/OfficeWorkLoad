package Collections

/**
 * Created by cnapoles on 6/13/17.
 */

//initilized a variable that has a value using a range of numbers
def nums = -3..3
println nums
// assert is to check or test the value of the variable
assert nums.contains(-3)
assert nums.contains(3)
assert nums.from == -3
assert nums.to == 3
//initializing another variable, with the use of range and conditional operators
def num2 = -3..<3
println num2
//the ranging can use in the date also
Date now = new Date()
Date then = now + 5
(now..then).each {
    println it.format('MMM dd, yyyy')
}
