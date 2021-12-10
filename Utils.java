public class Utils {
    // average of two integers
    public static int average(int a, int b) {
        return (int) Math.round(((double) a + b) / 2);
    }

    public static int binarySearch (ArrayList<integer> arr, int value) {
        int low = 0;
        int high = arr.size() - 1;
        while (low <= high) {
            if (value == arr.get(average(low, high))) {
                return average(low, high);
            }
            if (value < arr.get(average(low, high))) {
                high = average(low, high) - 1;
            }

        }
    }
}