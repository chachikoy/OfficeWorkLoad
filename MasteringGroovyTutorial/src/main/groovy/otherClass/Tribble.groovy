package otherClass

/**
 * Created by cnapoles on 6/15/17.
 */

class Tribble{
    String react(Klingon klingon){
        klingon.annoy()
        "wheep! wheep!"
    }

    String react(Vulcan vulcan){
        vulcan.soothe()
        "purr, purr"
    }

    def feed(){
        def tribbles = [this]
        10.times {tribbles << new Tribble()}
        return tribbles
    }
}