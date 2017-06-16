package June82017

/**
 * Created by cnapoles on 6/8/17.
 */

url = 'http://weather.yahooapis.com/forecastrss?w=2480318'
def root = new XmlSlurper().parse(url)
println (root.channel.location.@city)

