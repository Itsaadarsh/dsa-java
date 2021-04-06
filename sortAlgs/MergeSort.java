package sortAlgs;

public class MergeSort {
    public static void main(String[] args) {
        int[] list = { 20, 35, -15, 7, 55, 1, -22 };

    }

    public static void splitting(int[] inputList, int start, int end) {
        if (end - start < 2) {
            return;
        }

        int mid = (start + end) / 2;

        splitting(inputList, start, mid);
        splitting(inputList, mid, end);
        merge(inputList, start, mid, end);
    }

    public static void merge(int[] inputList, int start, int mid, int end) {
    }

    public static void display(int[] array) {
        for (int i : array) {
            System.out.print(i + "  ");
        }
        System.out.println("");
    }
}
