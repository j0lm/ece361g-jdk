public class ALHelper {
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
