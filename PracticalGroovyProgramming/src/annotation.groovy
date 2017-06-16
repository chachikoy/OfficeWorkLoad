import groovy.transform.TypeChecked

/**
 * Created by cnapoles on 6/16/17.
 */

List demo() {
    List<Integer> nums = [3, 1, 4, 1, 5, 9, 'abc']
    nums << new Date()

}
println demo()