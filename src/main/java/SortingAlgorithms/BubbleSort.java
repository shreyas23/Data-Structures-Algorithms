package SortingAlgorithms;

public class BubbleSort {
    private static int[] init_array = {9, 7, 5, 3, 1, 2, 4, 6, 8, 10};

    public static void main(String[] args) {
        for (int i : bubbleSort(init_array)) {
            System.out.print(i + " ");
        }
    }

    public static int[] bubbleSort(int[] array) {
        //narrows down like a pyramid sorting each linearly
        for (int i = 0; i < array.length; i++) {
            for (int j = array.length - 1; j > i; j--) {
                if (array[j] < array[j - 1]) {
                    //need temp var to hold old val. so that it doesn't keep repeating values
                    int temp = array[j - 1];
                    array[j - 1] = array[j];
                    array[j] = temp;
                }
            }
        }
        return array;
    }

}
