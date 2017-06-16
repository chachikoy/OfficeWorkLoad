package June6
/**
 * Created by cnapoles on 6/6/17.
 */

class IOSampleProg{
    static void main(String[] args){
        new File("sampText.txt").readLines() {
            line -> println("$line")
        }
       // new File("sampText.txt").withWriter {}
    }
}

