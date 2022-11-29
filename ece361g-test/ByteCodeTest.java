import java.util.ArrayList;

public class ByteCodeTest {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<Integer>();
        al.add(1);
        al.add(2);
        ArrayList<Integer> al2 = new ArrayList<Integer>();
        al2.add(3);
        al2.add(4);
        System.out.println(concat(al, al2));
    }

    public static <T> ArrayList<T> concat(ArrayList<T> al1, ArrayList<T> al2) {
        ArrayList<T> result = new ArrayList<T>();
        for (T item : al1) {
            result.add(item);
        }
        for (T item : al2) {
            result.add(item);
        }
        return result;
    }
}
