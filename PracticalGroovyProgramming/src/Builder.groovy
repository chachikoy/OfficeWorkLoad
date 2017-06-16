import groovy.json.JsonBuilder
import groovy.swing.SwingBuilder
import groovy.xml.MarkupBuilder

import javax.swing.BoxLayout
import javax.swing.WindowConstants

/**
 * Created by cnapoles on 6/14/17.
 */

class generatingPeople {

    static void main(String[] xxxx) {

    swing()

    }

    static void xml() {

        def builder = new MarkupBuilder()
        builder.people {
            person(id: 1) {
                name 'Buffy'
            }
            person(id: 2) {
                name 'Willow'
            }
        }
    }

    static void json() {

        def builder = new JsonBuilder()
        //builder in using a MAP
        builder([name: 'Bluffy', role: 'slayer'], [name: 'Willow', role: 'witch'])
        println builder
    }
    static void html(){
        def writer = new FileWriter('department.html')
        def builder = new MarkupBuilder(writer)
            builder.html{
                head{
                    title "IT Employees"
                }

                body{
                    h2 "IT"
                    table (border:1)
                    (0..3).each {num ->
                        tr{
                            td num
                            td "Employee $num"
                        }
                    }
                }
            }
        println new File('department.html').text

    }

    static void swing(){

        //swing builder - basic swing interface
        // edt - building GUI
        //frame - jframe
        new SwingBuilder().edt {
            frame(title: 'Hello, Groovy!', visible:true,
                    size: [200, 100], defaultCloseOperation: WindowConstants.EXIT_ON_CLOSE){
                panel(layout: new BoxLayout()){
                    def txt = textField(constraints: BoxLayout.NORTH, 'Enter text here' )
                    def lab = label(constraints: BoxLayout.CENTER, 'Text')
                    button(constraints: BoxLayout.SOUTH, 'Move Text',
                            actionPerformed: {lab.text = txt.text})
                    txt.actionPerformed = {lab.text = txt.text}
                }
            }
        }
    }


}
