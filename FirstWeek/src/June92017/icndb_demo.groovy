package June92017

import groovy.json.JsonOutput
import groovy.json.JsonSlurper

/**
 * Created by cnapoles on 6/9/17.
 */


String base = 'http://api.icndb.com/jokes/random?'
def qs = [firstname: 'Lindsay', lastname : 'Ventimiglia',
              limitTo: '[nerdy]'].collect { k,v -> "$k=$v"}.join('&')

String JokeText = "$base$qs".toURL().text
//JsonOutput is to generate a json
//prettyprint always has a parameter
println JsonOutput.prettyPrint(JokeText)
println()
//jsonslurper - it will automatically give the output not the json itself
def json = new JsonSlurper().parseText(JokeText)
println json.value.joke