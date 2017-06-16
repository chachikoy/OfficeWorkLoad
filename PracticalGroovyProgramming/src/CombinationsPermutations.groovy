/**
 * Created by cnapoles on 6/14/17.
 */

println "${[['a','b','c'],[1,2],['X', 'Y']].permutations()}"
println "${[['a','b','c'],[1,2],['X', 'Y']].combinations()}"

[1,2,3].eachPermutation {println "permutation $it"}
[1,2,3].eachCombination { println "combination $it"}