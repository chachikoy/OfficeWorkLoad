package Collections

/**
 * Created by cnapoles on 6/13/17.
 */

// Declaration of EMPTY MAP
def map = [:]
// different way of inputting KEYS and VALUES in the MAP
map.firstname = 'Charlotte'
map['middlename'] = 'Penano'
map.put('lastname', 'Napoles')

// checking of values
assert map.firstname == 'Charlotte'
assert map['middlename'] == 'Penano'
assert map.get('lastname') == 'Napoles'

//printing specific value part of MAPs
println map.keySet()
println map.keySet().class.name
assert map.keySet() == ['firstname', 'middlename', 'lastname'] as Set
println map.entrySet()
println map.values()
assert map.values() as List == ['Charlotte', 'Penano', 'Napoles']

//printing size
println "Size of keySet = ${map.keySet().size()}"
println "Size of entrySet = ${map.entrySet().size()}"
println "Size of map = ${map.size()}"

assert map.keySet().size() == 3
assert map.entrySet().size() == 3
assert map.size() == 3

//getting specific part of MAP and using join method
println "Map using collect and printing the VALUES only = ${map.collect {it.value}.join(' , ')}"
println "Map using collect and printing the KEYS only = ${map.collect {it.key}.join(' , ')}"
println "Map using collect : ${map.collect{ k,v -> "$k = $v" }.join(' & ')}"
assert map.collect { k,v -> "$k=$v" }.join(' & ') == 'firstname=Charlotte & middlename=Penano & lastname=Napoles'

/*      def info = [name : 'allan', age : 21,
                  name : 'mark', age : 30,
                  name : 'cha', age : 18,
                  name : 'kaps', age : 25]

      println info.findAll{it.value <= 18}.collect{it.value}.join(',')

*/