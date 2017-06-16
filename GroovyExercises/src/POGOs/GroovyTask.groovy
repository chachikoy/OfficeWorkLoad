package POGOs
/**
 * Created by cnapoles on 6/13/17.
 */

/*
>> This file is changed from being a java class to groovy
>> INSTRUCTIONS:
1. removing the import statement
- to show that the Date package is already included in Groovy
2. removing the constructors
3. removing the keyword private from all the properties
- it shows that by default to groovy the attributes is already private
4. delete all the getter and setter
- by default groovy has the getters and setters method.
- if you want to have getters only put a "final keyword"
5. removing the keyword public from the class
- In groovy, the method and class are public by default
6. removing semicolon
- In groovy, semicolons is not necessary
7. Rewriting the toString method by using interpolation
 */

/*
>> the purpose of this example is to show, how short to code the POJO in groovy
>> from 70+ lines in POJO to almost quarter number of lines in POGO
*/
 class Task {

     String name
     int priority
     Date startDate
     Date endDate
     boolean completed


    public String toString() {
        return "Task [name= $name , priority= $priority , startDate= $startDate , endDate= $endDate , completed= $completed]"

    }
}
