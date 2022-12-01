import java.util.ArrayList;
import java.util.Arrays;

public class Test {

    static ArrayList<Boolean> results = new ArrayList<Boolean>();
    static ArrayList<String> testnames = new ArrayList<String>();
    static ArrayList<ArrayList<Integer>> returnvalues = new ArrayList<ArrayList<Integer>>();
    static int indent_size = 32;

    public static void main(String[] args) {
        System.out.println((test_driver()) ? "all test passed!" : "some test(s) failed");
    }

    public static boolean test_driver() {

        System.out.println("running tests...\n");

        // run test cases

        // testnames.add("test_two_arrays_same_length");
        // results.add(test_two_arrays_same_length());

        // testnames.add("test_two_arrays_short_normal");
        // results.add(test_two_arrays_short_normal());

        // testnames.add("test_two_arrays_normal_short");
        // results.add(test_two_arrays_normal_short());

        // testnames.add("test_two_arrays_short_short");
        // results.add(test_two_arrays_short_short());

        testnames.add("test_two_arrays_same_length_casted");
        results.add(test_two_arrays_same_length_casted());

        System.out.println("#: TEST_NAME.......................PASSED?...OUTPUT");

        boolean result = true;
        for (int i = 0; i < results.size(); i++) {
            boolean r = results.get(i);
            result = result && r;
            String testname = testnames.get(i);
            String output = "" + i + ": " + testname;
            for (int j = 0; j < indent_size - testname.length(); j++) {
                output += ".";
            }
            output += (r + ".....result: " + arraylist_string(returnvalues.get(i)));
            System.out.println(output);
        }
        System.out.println();
        return result;
    }

    // public static boolean test_two_arrays_same_length() {
    //     ArrayList<Integer> a = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5));
    //     ArrayList<Integer> b = new ArrayList<Integer>(Arrays.asList(6, 7, 8, 9, 10));
    //     ArrayList<Integer> c = a *** b;
    //     returnvalues.add(c);

    //     return are_arrays_equal(null, new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)));
    // }

    // public static boolean test_two_arrays_short_normal() {
    //     ArrayList<Integer> a = new ArrayList<Integer>(Arrays.asList(1));
    //     ArrayList<Integer> b = new ArrayList<Integer>(Arrays.asList(2, 3, 4, 5));
    //     ArrayList<Integer> c = a *** b;
    //     returnvalues.add(c);

    //     return are_arrays_equal(c, new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5)));
    // }

    // public static boolean test_two_arrays_normal_short() {
    //     ArrayList<Integer> a = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4));
    //     ArrayList<Integer> b = new ArrayList<Integer>(Arrays.asList(5));
    //     ArrayList<Integer> c = a *** b;
    //     returnvalues.add(c);

    //     return are_arrays_equal(c, new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5)));
    // }

    // public static boolean test_two_arrays_short_short() {
    //     ArrayList<Integer> a = new ArrayList<Integer>(Arrays.asList(1));
    //     ArrayList<Integer> b = new ArrayList<Integer>(Arrays.asList(2));
    //     ArrayList<Integer> c = a *** b;
    //     returnvalues.add(c);

    //     return are_arrays_equal(c, new ArrayList<Integer>(Arrays.asList(1, 2)));
    // }

    public static boolean are_arrays_equal(ArrayList<?> a, ArrayList<?> b) {
        if (a == null && b == null) {
            return true;
        }
        if (a == null || b == null) {
            return false;
        }
        if (a.size() != b.size()) {
            return false;
        }
        for (int i = 0; i < a.size(); i++) {
            if (!a.get(i).equals(b.get(i))) {
                return false;
            }
        }
        return true;
    }

    public static boolean test_two_arrays_same_length_casted() {
        ArrayList<Integer> a = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5));
        ArrayList<Integer> b = new ArrayList<Integer>(Arrays.asList(6, 7, 8, 9, 10));
        Object c = a *** b;
        returnvalues.add((ArrayList<Integer>) c);

        return are_arrays_equal((ArrayList<Integer>) c, new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)));
    }


    static String arraylist_string(ArrayList<?> a) {
        if (a == null) {
            return "null";
        }
        String output = "[" + a.get(0);
        for (int i = 1; i < a.size(); i++) {
            output += (", " + a.get(i));
        }
        output += "]";
        return output;
    }

}

// public static boolean test_two_arrays_same_length() {
// ArrayList<Integer> a = new ArrayList<Integer>(Arrays.asList());
// ArrayList<Integer> b = new ArrayList<Integer>(Arrays.asList());
// ArrayList<Integer> c = null; // a *** b;

// return are_arrays_equal(c, new ArrayList<Integer>(Arrays.asList()));
// }