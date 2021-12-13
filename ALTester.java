public class ALTester {
    public static void main(String[] args) {
        OrderedArrayList list = new OrderedArrayList();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(84);
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(8);
        list.add(9);
        list.add(75);
        list.add(12);
        list.add(66);
        list.add(23);
        list.add(24);
        list.add(25);
        list.add(26);
        list.add(28);
        list.add(29);
        list.add(30);
        list.add(32);
        list.add(35);
        list.add(39);
        list.add(37);
        System.out.println(list.toString());
        list.remove(12);
        System.out.println(list.toString());
        list.remove(20);
        System.out.println(list.toString());
        list.set(3, 39);
        System.out.println(list.toString());
        list.set(5, 18);
        System.out.println(list.toString());
    }
}
