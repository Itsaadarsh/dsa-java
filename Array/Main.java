package Array;

public class Main {
    public static void main(String[] args) {
        Array numbers = new Array(1);
        for (int i = 0; i < 5; i++) {
            numbers.insert(i + 1);
        }
        // System.out.println(numbers.max());
        // numbers.reverse();
        numbers.insertAt(3, 0);
        numbers.print();
    }
}