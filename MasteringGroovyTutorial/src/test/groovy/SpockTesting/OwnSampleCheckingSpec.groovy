package SpockTesting

import spock.lang.Specification
import spock.lang.Unroll

/**
 * Created by cnapoles on 6/16/17.
 */

class OwnSampleCheckingSpec extends Specification{

    List strings = "This is a list of strings again".split()

    def "not changing the size of a list"(){
        given:
        String s1 = "String s1"
        String s2 = "String s2"

        when: 'add the s1 and s2 in the list'
        def newList = strings + s1 + s2

        then: 'this will be the result'
        assert strings.size() == old(strings.size())
        println strings.size()
        assert newList.size() == old(strings.size()) + 2
        println newList

        when:
        newList << 'String s3'
        newList << 'String s4'

        then:
        assert newList.size() == old(newList.size()) + 2
        println newList

    }

    def "NPE if I don't instantiate the list"() {
        when:
        List empty
        empty << 'data'

        then:
        def e = thrown(NullPointerException)
        // NullPointerException e = thrown()
        e.message == 'Cannot invoke method leftShift() on null object'
    }

    def "length of Kirk and rnative syntax his friend's names"() {
        expect:
        name.size() == length


        where: //where block defines variables that are assigned by Spock as it iterates over data
        [name,length] << [["Spock", 5], ["Kirk", 4], ["Scotty", 6]]
    }

    @Unroll
    def "#name is #length characters"() {
        expect: name.size() == length

        where:
        [name,length] << [["Spock", 5], ["Kirk", 4], ["Scotty", 6],
                          ["Spock2", 6], ["Kirk2", 5], ["Scotty2", 7]]

    }

}