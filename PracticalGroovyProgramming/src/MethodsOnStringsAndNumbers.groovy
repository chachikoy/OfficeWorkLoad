/**
 * Created by cnapoles on 6/14/17.
 */

println Math.abs(-4)
int x = -4
println x.abs()
println ((-4).abs())
4.times {println it}

println 'abcde'.bytes
String encoded = 'abcde'.bytes.encodeBase64()
println encoded
println new String(encoded.decodeBase64())

String s = 'this is a string'
println s.capitalize()
println s.split()
println s.split()*.capitalize()
println s.split()*.capitalize().join(' ')
