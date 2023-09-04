//sort the fruits name in lexicographic using selection sort
package Sorting;

public class problem2 {

    static void fruitSort(String[] fruits ){
        int n= fruits.length;
        for (int i = 0; i < n-1; i++) {

        int min_index=i;
            for (int j = i+1; j < n; j++) {
                if (fruits[j].compareTo(fruits[min_index])<0 ) {  //fruit[j] choto ki na ota dekha hoche
                    min_index=j;
                }
            }
            //swap fruit[min-index],fruit[i]
            String temp= fruits[i];
            fruits[i]=fruits[min_index];
            fruits[min_index]=temp;
        }
    }

    public static void main(String[] args) {
        String[] fruits={"kiwi", "mango", "apple", "amla"};
        fruitSort(fruits);
        for (String val: fruits) {
            System.out.print(val+" ");
        }
    }
}
//amla apple kiwi mango
