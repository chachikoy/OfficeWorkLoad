package GroovyExercises

/**
 * Created by cnapoles on 6/13/17.
 */

String webURL = "https://facebook.com"
// in Using toURL() method, the compiler will know that the given string or value in text is a URL
def text = { URL -> URL.toURL().getText()}
//Printing source code of the home page of facebook.com
println text(webURL)