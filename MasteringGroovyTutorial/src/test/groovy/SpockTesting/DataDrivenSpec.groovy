package SpockTesting

import spock.lang.Specification
import spock.lang.Unroll

/**
 * Created by cnapoles on 6/15/17.
 */

//OBJECTIVE: Way of creating an object and checking it's property
@Unroll
class DataDrivenSpec extends Specification{
    def "maximum of two numbers"(){
        expect:
        Math.max(a,b) == c

        where:
        a << [3,5,9]
        b << [7,4,9]
        c << [7,5,9]

    }

    def "minimum of #a and #b is #c"(){
        expect:
        Math.min(a,b) == c

        where:
        a | b || c
        3 | 7 || 3
        5 | 4 || 4
        9 | 9 || 9
    }

    def "#person.name is a #sex.toLowerCase() person"(){
        expect:
        person.sex == sex
       // meaning person.sex(getSex) == sex

        where:
        person                      || sex
        new Person (name: "Fred")   || "Male"
        new Person (name: "Wilma")  || "Female"
        //instantiating Person
    }

    static class Person{
        String name
        String getSex(){
            // if the name is Fred return sex if male or female
            name == "Fred" ? "Male" : "Female"
        }
    }
}