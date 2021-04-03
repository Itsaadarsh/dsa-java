class Arrays {
    public static void main(String[] args) {
        int[] list = new int[10];
        for (int i = 0; i < list.length; i++) {
            list[i] = i + 1;
        }
        for (int i : list) {
            System.out.print(i);
        }
    }
}