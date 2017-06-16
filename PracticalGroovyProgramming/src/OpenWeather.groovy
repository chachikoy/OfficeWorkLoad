import groovy.json.JsonOutput

/**
 * Created by cnapoles on 6/14/17.
 */

def url = "https://google.com.ph"
def jsonTxt = url.toURL().text
println JsonOutput.prettyPrint(jsonTxt)