package LinkedList;

public class Main {
    public static void main(String[] args) {
        var list = new LinkedList();

        list.addLast(10);
        list.addLast(20);
        list.addLast(30);
        list.addFirst(0);
        list.removeFirst();

        System.out.println();
        System.out.println(list.indexOf(20));
        System.out.println("--------------");
        System.out.println(list.contains(0));
        System.out.println("--------------");
        list.print();
    }
}
