package MoreGroovyExercises

import groovy.transform.Sortable

/**
 * Created by cnapoles on 6/13/17.
 */

@Sortable(includes = ['days', 'name'])
class Course{

    String name
    int days

    String toString(){"$name: $days"}

}
def courses = [ new Course(name: 'Menudo', days: 2),
                new Course(name: 'Adobo', days: 1),
                new Course(name: 'Chicken Curry', days: 2),
                new Course(name: 'Igado', days: 3)]
courses.sort().each {println it}







