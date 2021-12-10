import java.util.ArrayList;

public class Utils {
    // average of two integers
    public static int average(int a, int b) {
        return (int) Math.round((a + b) / 2.0);
    }

    public static int binarySearch (ArrayList<Integer> arr, int value) {
        int low = 0;
        int high = arr.size() - 1;
        while (low <= high) {
            System.out.println(low + " " + high);
            if (value > arr.get(average(low, high))) {
                low = average(low, high);
            }
            if (value < arr.get(average(low, high))) {
                high = average(low, high) - 1;
            }
            else if (average(low, high) == value) {
                return average(low, high);
            }
        }
        return -1;
    }
    
    // binary search for an integer in an array
    public static int binarySearch (int[] arr, int value) {
        int low = 0;
        int high = arr.length - 1;
        while (low <= high) {
            if (value > arr[average(low, high)]) {
                low = average(low, high);
            }
            if (value < arr[average(low, high)]) {
                high = average(low, high);
            }
            else {
                return average(low, high);
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<Integer>();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        arr.add(5);
        arr.add(6);
        arr.add(7);
        arr.add(8);
        arr.add(9);
        arr.add(10);
        arr.add(11);
        arr.add(12);
        arr.add(13);
        arr.add(14);
        arr.add(15);
        arr.add(16);
        arr.add(17);
        arr.add(18);
        arr.add(19);
        arr.add(20);
        arr.add(21);
        arr.add(22);
        arr.add(23);
        arr.add(24);
        arr.add(25);
        arr.add(26);
        arr.add(27);
        arr.add(28);
        arr.add(29);
        arr.add(30);
        arr.add(31);
        arr.add(32);
        arr.add(33);
        arr.add(34);
        arr.add(35);
        arr.add(36);
        arr.add(37);
        arr.add(38);
        arr.add(39);
        arr.add(40);
        arr.add(41);
        arr.add(42);
        arr.add(43);
        arr.add(44);
        arr.add(45);
        arr.add(46);
        arr.add(47);
        arr.add(48);
        arr.add(49);
        arr.add(50);
        arr.add(51);
        arr.add(52);
        arr.add(53);
        arr.add(54);
        arr.add(55);
        arr.add(56);
        arr.add(57);
        arr.add(58);
        arr.add(59);
        System.out.println(binarySearch(arr, 50));
    }
}