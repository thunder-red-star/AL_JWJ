import java.util.ArrayList;

public class Utils {
    // average of two integers
    public static int average(int a, int b) {
        return (int) Math.round((a + b) / 2);
    }

    public static int binarySearchInsert (ArrayList<Integer> arr, int value) {
        int low = 0;
        int high = arr.size() - 1;
        while (low <= high) {
            System.out.println(arr.toString());
            System.out.println("value: " + value + " average: " + arr.get(average(low, high)) + " low: " + low + " high: " + high);
            if (value > arr.get(average(low, high))) {
                low = average(low, high);
            }
            if (value <= arr.get(average(low, high))) {
                high = average(low, high);
            }
            else if (high<low+2) {
                return high;
            }
        }
        return 0;
    }

    public static int binarySearchFind (ArrayList<Integer> arr, int value) {
        int low = 0;
        int high = arr.size() - 1;
        while (low <= high) {
            if (value > arr.get(average(low, high))) {
                low = average(low, high)+1;
            }
            if (value < arr.get(average(low, high))) {
                high = average(low, high)-1;
            }
            else if (value == arr.get(average(low, high))) {
                return average(low,high);
            }
        }
        return -1;
    }
}
