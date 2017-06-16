package SpockTesting

import spock.lang.Specification

/**
 * Created by cnapoles on 6/15/17.
 */

class ListSpec extends Specification{
    List strings

    def setup(){
        // you don't need to add data types or even default data types here
            strings = ['light', 'light', 'light', 'light']

    }

    def "there are four lights"(){
        expect:
            strings.size() == 4
    }

    def "add two strings string"(){
        when:
            strings << "plus"
            strings << "two"

        then:
            strings.size() == old(strings.size()) + 2
        // the old method evaluates what is in parenthesis before the WHEN block take effect/executed
    }

    def "NPE if I don't instantiate the List"(){
        when:
        List empty
        empty << 'data'

        then:
        def e = thrown(NullPointerException)
        //NullPointerexception e = thrown() //another way
        println e.message
    }

    def 'no exception using the getAt method'(){
        when:
        (0..5).each {strings[it]}
        strings[6]

        then:
        notThrown()
    }
    def "There are four lights!"(){
        expect:
        strings.findAll {it ==~ /light/}.size() == 4
    }
}