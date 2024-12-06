/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package selectionsort;

import java.util.Arrays;

/**
 *
 * @author Acer
 */
public class SortDesc {
    
    public static void main(String[] args) {
        int[] arr = {54, 28, 64, 22, 11, 8};
        int i,j;
        for(i = 0; i < arr.length; i++){
           int min_id = i;
           for(j = i + 1; j < arr.length; j++){
               if(arr[j] > arr[min_id]){
                   min_id = j;
               }
           }
            int temp = arr[i];
            arr[i] = arr[min_id];
            arr[min_id] = temp;
        }
         System.out.println("Sorted Array using Selection Sort (Descending): " + Arrays.toString(arr));
    }
    
    
}
