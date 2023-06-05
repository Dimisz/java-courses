import java.util.ArrayList;
import java.util.Collections;

public class SortedSet {
    public static ArrayList<String> getSortedSet(String ...args){
        ArrayList<String> result = new ArrayList<String>();
        for(String s: args){
            if(!result.contains(new String(s))){
                result.add(s);
            }
        }
        Collections.sort(result);
        return result;
    }
}
