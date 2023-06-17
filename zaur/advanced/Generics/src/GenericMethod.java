import java.util.ArrayList;

public class GenericMethod {
    public static <T> T getSecondElement(ArrayList<T> al){
        return al.get(1);
    }
}
