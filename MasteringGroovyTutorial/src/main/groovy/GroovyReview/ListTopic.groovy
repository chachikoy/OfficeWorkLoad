package GroovyReview

/**
 * Created by cnapoles on 6/15/17.
 */

List strings = 'this is a list of strings'.split()

println('using closure')

for (String s : strings){println s}
println()
for (s in strings){println s}
println()
strings.each {println it}
println()
strings.each {s -> println s}

println 'using collect'

strings.collect { it.size() }
            .findAll {it > 1}
            .sum()
println()
println 'Meta Programming'
Map params = [a:1, b:2, c:3]
params.collect {k,v -> "$k = $v"}.join(' & ')

println('using meta class')
Map.metaClass.toQS = {delegate.collect {k,v -> "$k=$v"}.join(' & ')}
println params.toQS()

println()
println()
List cities = ['Cambridge', 'Sebastol', "King's Landing"]
cities.collect {
    URLEncoder.encode(it, 'UTF-8')
}.join(',')