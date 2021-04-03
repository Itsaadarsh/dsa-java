package sortAlgs;

/** BubbleSort */

public class BubbleSort {
    public static void main(String[] args) {
        int[] list = { 20, 35, -15, 7, 55, 1, -22 };
        for (int i = 0; i < list.length; i++) {
            for (int j = 1; j < (list.length - i); j++) {
                if (list[j - 1] > list[j]) {
                    swap(list, j - 1, j);
                }
            }
        }
        display(list);
    }

    public static void display(int[] array) {
        for (int i : array) {
            System.out.print(i + "  ");
        }
    }

    public static void swap(int[] array, int i, int j) {
        if (i == j) {
            return;
        }

        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}