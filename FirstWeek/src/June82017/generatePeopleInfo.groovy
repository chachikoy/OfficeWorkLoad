package June82017

import groovy.xml.MarkupBuilder
import org.testng.xml.XMLParser

/**
 * Created by cnapoles on 6/8/17.
 */
class GeneratingXML{
    static void main(String[] args){

  //      geocoder_demo()
        practiceGeneratingXML()

    }

    static void generatingXMLtoFile(){

//generating xml
        def strWriter = new StringWriter()
        def builder = new MarkupBuilder(strWriter)

        println builder.getClass().name
        builder.people{
            person(id:1){
                name 'Bluffy'
            }
            person(id:2){
                name 'Willow'
            }
        }

        File file = new File("/home/cnapoles/projects/cnapoles/groovy/peopleInfo.xml")
        file.write(strWriter.toString())
    }

    static void geocoder_demo(){
        String base = 'https://maps.googleapis.com/maps/api/geocode/xml?'
        String encoded = ['724 Gravenstein Hwy N','Sebastopol', 'CA'].collect {
            URLEncoder.encode(it, 'UTF-8')
        }.join(',')
        String qs = "address=$encoded"
        def root = new XmlSlurper().parse("$base$qs")
    //it can be GPathResult
        def loc = root.result[0].geometry.location
        println "${loc.lat}, ${loc.lng}"
    }

    static void practiceGeneratingXML(){
        def strWriter = new StringWriter()
        def builder = new MarkupBuilder(strWriter)

        builder.people{
            person(id:1){
                fname :'cha'
                lname : 'napoles'
            }
            person(id:2){
                fname : 'Charlotte'
                lname : 'Napoles'A
            }
        }


    }
}