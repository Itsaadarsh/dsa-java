package sortAlgs;

public class InsertionSort {
    public static void main(String[] args) {
        int[] list = { -12, 56, 2, -542, 53, 44, 457, 4, -23, 0, 12, 234, 234, 2354, 36, -457, -312, -345, 23 };
        for (int i = 1; i < list.length; i++) {
            int nextElement = list[i];
            int j;
            for (j = i; j > 0 && list[j - 1] > nextElement; j--) {
                list[j] = list[j - 1];
            }
            list[j] = nextElement;
        }
        display(list);
    }

    public static void display(int[] array) {
        for (int i : array) {
            System.out.print(i + "  ");
        }
        System.out.println("");
    }

}
