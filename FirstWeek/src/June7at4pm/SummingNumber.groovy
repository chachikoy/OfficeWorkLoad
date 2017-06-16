package June7at4pm
/**
 * Created by cnapoles on 6/7/17.
 */


/**
 * Created by cnapoles on 6/7/17.
 */

class Summing{
    static void main(String[] args){
        List nums = [3,1,4,1,5,9,2,6,5]

        //Java approach
        int total = 0
        for (int n : nums)
            total+= 2 * n
        println(total)
        assert total == 72

        //groovy using collect
        assert nums.collect {it * 2}.sum() == 72

        //Reduce to a problem already solved
        assert 72 == nums.sum() * 2

        //Sum with closure
        assert 72 == nums.sum {it * 2}

        // Sum with spread dot
        println "${nums*.multiply(2).sum()}"
        nums.inject(0) {acc, val -> acc val}
    }

}