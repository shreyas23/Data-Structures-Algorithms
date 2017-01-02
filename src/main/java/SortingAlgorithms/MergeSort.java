package SortingAlgorithms;

public class MergeSort {
    private static int[] init_array = {9, 7, 5, 3, 1, 2, 4, 6, 8, 10};

    public static void main(String[] args) {

        for (int i : mergeSort(init_array, 0, init_array.length - 1)) {
            System.out.print(i + " ");
        }
    }

    //recursive method that continuously splits the array until it's just one value (which is a sorted array)
    public static int[] mergeSort(int[] array, int lBound, int hBound) {
        //to make sure that you're getting a value
        if (lBound < hBound) {
            int mBound = (lBound + hBound) / 2;
            mergeSort(array, lBound, mBound);
            mergeSort(array, mBound + 1, hBound);
            return merge(array, lBound, mBound, hBound);
        } else {
            return array;
        }
    }

    private static int[] merge(int[] array, int lBound, int mBound, int hBound) {
        //the length of the left array + 2 to cover the index and the infinity
        int left_length = mBound - lBound + 2;
        int[] left_arr = new int[left_length];
        int right_length = hBound - (mBound) + 1;
        int[] right_arr = new int[right_length];

        //let the last value equal infinity so that it can add the rest of the values

        left_arr[left_length - 1] = Integer.MAX_VALUE;
        right_arr[right_length - 1] = Integer.MAX_VALUE;

        //copy array values into temp arrays -- could use System.arraycopy();
        for (int i = 0; i < left_length - 1; i++) {
            left_arr[i] = array[i + lBound];
        }
        for (int j = 0; j < right_length - 1; j++) {
            right_arr[j] = array[j + mBound + 1];
        }
        //integers l and r to keep count of temp array values
        int l = 0;
        int r = 0;
        //for loop to go through every single value of original array
        for (int k = lBound; k <= hBound; k++) {
            if (left_arr[l] == Integer.MAX_VALUE) {
                //for loop to add the rest of the values from one sorted array
                // once the other sorted array has been completely added to original array
                for (int i = r; i < right_length - 1; i++) {
                    array[k++] = right_arr[r++];
                }
            } else if (right_arr[r] == Integer.MAX_VALUE) {
                for (int i = l; i < left_length - 1; i++) {
                    array[k++] = left_arr[l++];
                }
                //compare values and sort the unsorted array
            } else if (left_arr[l] <= right_arr[r]) {
                array[k] = left_arr[l++];
            } else {
                array[k] = right_arr[r++];
            }
        }
        return array;
    }


}