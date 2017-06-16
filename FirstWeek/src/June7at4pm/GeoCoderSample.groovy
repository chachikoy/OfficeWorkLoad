package June7at4pm

import groovy.json.JsonSlurper

/**
 * Created by cnapoles on 6/7/17.
 */

class geoCoder {

    static void main(String[] args){
      //GeoCode();
      // ElvisOperator()
        Joker()
    }

    static void Joker(){
        String base = 'http://api.icndb.com/jokes/random?'
        def qs = [limitTo: '[nerdy]', firstName: 'Gillaume',
                  lastName: 'larforge'].collect {k, v ->
            "$k=$v"}.join('&')
    String jSonTxt = "$base$qs".toURL().text
        def json = new JsonSlurper().parseText(jSonTxt)
        println(json.value.joke)

    }


    static void GeoCode(){
        String base = 'https://maps.googleapis.com/maps/api/geocode/xml?'

        def encoded = ['10 Fawcett Street', 'Cambridge', 'MA'].collect {
            URLEncoder.encode(it,'UTF-8')
        }.join(',')

        def qs = "address=$encoded"
        def sample=  "$base$qs".toURL().text

        println(sample)

        def root = new XmlSlurper().parse("$base$qs")
        def loc = root.result[0].geometry.location
        println "(${loc.lat}, ${loc.lng})"
    }

    static void ElvisOperator(){
        String name = ""
        String n = (name != null && name.size() > 0 ? name : "Cha")
        println("Hello, $n")
    }
}