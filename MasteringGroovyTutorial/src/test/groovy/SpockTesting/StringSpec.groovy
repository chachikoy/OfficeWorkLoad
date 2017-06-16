package SpockTesting

import spock.lang.FailsWith
import spock.lang.Specification

/**
 * Created by cnapoles on 6/15/17.
 */

class StingSpec extends Specification{
    String llap = "Live Long and Prosper"

    def "llap has 21 characters"(){
        expect: llap.size() == 21
    }
    def "llap has 4 words"(){
        expect: llap.split(/\W/).size() == 4
    }

    def "llap has 6 vowels"(){
        expect:
        llap.findAll(/[aeiou]/).size() == 6
    }
    def "Access inside the string doesn't throw an exception"(){
        when:
        llap[0..-1] //forward
        llap[-1..0] // backward

        then:
        notThrown(IndexOutOfBoundsException)
        //notThrown -
    }

    @FailsWith(NullPointerException)
    def "Access inside null string throws exception"(){
        given:
        llap = null

        expect:
        llap[0]
    }

    def "Access beyond the end of the string throws exception"(){
        when:
        llap[llap.size()]

        then:
        IndexOutOfBoundsException e = thrown()
        //thrown() - one of the parent classes of specification
        e.message == "String index out of range: 22"
    }


}