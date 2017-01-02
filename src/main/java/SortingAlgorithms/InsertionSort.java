package SortingAlgorithms;

public class InsertionSort {
    private static int[] init_array = {9, 7, 5, 3, 1, 2, 4, 6, 8, 10};

    public static void main(String[] args) {
        insertionSort(init_array);
    }

    public static int[] insertionSort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int key = array[i];
            int j = i - 1;
            while (j >= 0 && array[j] > key) {
                array[j + 1] = array[j];
                j--;
                array[j + 1] = key;
            }
        }
        for (int i : array) {
            System.out.println(i);
        }
        return array;
    }
}
