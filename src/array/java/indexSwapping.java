package array.java;

public class indexSwapping {

    static void indexSwapping(int[] arr, int i, int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;

    }
    static void reverseArray(int[] arr) {

        int i=0 , j= arr.length-1; // agey ar pechon theke initialise kora eta

        while (i < j){ //jotokhon eta ek jayega te dhakka na khaye era swap hbe tai eta index a banano
            indexSwapping(arr, i, j);
            i++;   // 0 theke ego te thkbee
            j--;   // pechon thekee aste thkbe jmn n-1 theke 0

        }
    }


    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};

        reverseArray(arr);

        for (int i = 0; i < arr.length ; i++) {
            System.out.print(arr[i] + " ");
        }
    }

}
      //OUTPUT
//6 5 4 3 2 1
