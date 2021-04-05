package sortAlgs;

public class ShellSort {
    public static void main(String[] args) {
        int[] list = { -12, 56, 2, -542, 53, 44, 457, 4, -23, 0, 12, 234, 234, 2354, 36, -457, -312, -345, 23 };
        for (int gap = list.length / 2; gap > 0; gap /= 2) {
            for (int i = gap; i < list.length; i++) {
                int nextElement = list[i];
                int j = i;
                while (j >= gap && list[j - gap] > nextElement) {
                    list[j] = list[j - gap];
                    j -= gap;
                }
                list[j] = nextElement;
            }
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
