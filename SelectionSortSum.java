
package selectionsort;

import java.util.Arrays;
import java.util.Scanner;


public class SelectionSortSum {
    
    public static void main(String[] args) {
        // Take user input
        Scanner input = new Scanner(System.in);
        System.out.println("Size of array : ");
        int n = input.nextInt();
        int[] arr = new int[n];
        int sum = 0;
        
        for(int k = 0; k < n; k++){
            System.out.println("Enter value " + k + " : ");
            arr[k] = input.nextInt();
        }
        
        System.out.println("values : " + Arrays.toString(arr));
        
        //Selection sort
        int i,j;
        for(i = 0; i < arr.length; i++){
           int min_id = i;
           for(j = i + 1; j < arr.length; j++){
               if(arr[j] < arr[min_id]){
                   min_id = j;
               }
           }
            int temp = arr[i];
            arr[i] = arr[min_id];
            arr[min_id] = temp;
        }
        
        System.out.println("\n");
        System.out.println("Sorted Array: " + Arrays.toString(arr));
        
        for(int l = 0; l < n; l++){
             sum = sum + arr[l];
        }
        System.out.println("Sum of values: " + sum);
        
    }
    
}
