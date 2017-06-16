package SpockTesting

import spock.lang.*

/**
 * Created by cnapoles on 6/15/17.
 */



class MyFirstSpec extends Specification{
    def "max of two numbers"(){
        expect:
        Math.max (1,2) == 2
    }
    def "max method on a list of works"(){
        expect:
        [3,1,4,1,5,9].max() == 9
        [3,-1,4,-5].min() == 5
    }


}