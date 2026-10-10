public class InsertionSort {
    public void insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int current = arr[i];
            int j = i - 1;

        while (j >= 0 && arr[j] > current) {
            arr[j + 1] = arr[j];
            j--;
        }   
        arr[j + 1] = current;
    }
}

    public static void main(String[] args) {
        int[] array = {5, 2, 9, 1, 5, 6};
        InsertionSort sorter = new InsertionSort();
        sorter.insertionSort(array);
        System.out.println(java.util.Arrays.toString(array));
    }
}