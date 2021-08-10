package LinkedList;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        var list = new LinkedList();

        list.addLast(10);
        list.addLast(20);
        list.addLast(30);
        list.addLast(40);
        list.addLast(50);
        list.addFirst(0);
        list.removeFirst();
        list.removeLast();

        System.out.println();
        System.out.println(list.indexOf(20));
        System.out.println("--------------");
        System.out.println(list.contains(0));
        System.out.println("--------------");
        list.print();
        System.out.println("--------------");
        System.out.println(list.size());
        System.out.println("--------------");
        list.reverse();
        System.out.println(Arrays.toString(list.toArray()));

    }
}
