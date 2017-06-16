/**
 * Created by cnapoles on 6/14/17.
 */


def nums = [3, 1, 4, 1, 5, 9]
int total = nums.inject(0) { acc, n ->
    acc + n
}
println total
assert total == 23

List strings = "This is a list of strings".split()
println strings.size()
println strings.find {it.size() == 2}
println strings.findAll {it.size() == 2}
println strings.any {it.size() == 2}
println strings.every {it.size() == 2}
println strings.collate(2)
println strings.containsAll(['is', 'of','strings'])
println strings.count {it ==~ /\w{4}/} //count the number of element that has 4 characters

for (s in strings) {println s}

// finding index of each e
List list = ["aaa", "aab", "bbb", "bbc", "bba"]
println list.findIndexValues { it =~ 'a'}
