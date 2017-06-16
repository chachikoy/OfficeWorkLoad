package June7at4pm

/**
 * Created by cnapoles on 6/7/17.
 */

class SortingForString{
    static void main(String[] args){
        List sampString = 'hello i am charlotte napoles at your sevice'.split()
        println(sampString)

    //java Natural Sort
        Collections.sort(sampString)
        println(sampString)

    //Java sort by length
        Collections.sort(sampString, new Comparator<String>() {
            @Override
            int compare(String o1, String o2) {
                o1.size() <=> o2.size()

            }
        })
        println(sampString)



        assert sampString*.size() == [1,2,2,4,5,6,7,9]
//hfjfjd
    //Groovy natural sort
        println 'check'
        println(sampString.sort())
        println(sampString.sort())
    //groovy lenth sort with comparator
        println(sampString.sort(false, new Comparator<String>() {
            @Override
            int compare(String o1, String o2) {
               o1.size() <=> o2.size()
            }
        }))

    // groovy reverse length sort with closure
        println sampString.sort(false){
            s1, s2 -> s1.size() <=> s2.size()
        }
    // groovy length sort with 1-param closure
        println sampString.sort(true){it.size()}
    }
}