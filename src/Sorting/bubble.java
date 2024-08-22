package Sorting;

public class bubble {

    static void Bubblesort(int[] arr){
        int n = arr.length;

        for (int i = 0; i < n-1; i++) {
            boolean flag = false; // has any swap happening
            for (int j = 0; j < n-i-1; j++) { // moving the loop till the array is unsorted

                //check if the former number is greater than the later one if so then snap
                // their position is order to sort them out
                if (arr[j] > arr[j+1]) {

                    //the numbers are unsorted so swap-
                     int temp = arr[j];
                     arr[j] = arr[j+1];
                     arr[j+1] = temp;
                flag=true; //swap happen
                }
            }
            if (!flag){ // Have any swap happen?
                return;
            }
        }

    }

    public static void main(String[] args) {
           int[] arr = {5, 4, 3, 1, 2};
           Bubblesort(arr);
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
//OUTPUT
// 1 2 3 4 5
