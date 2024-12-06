/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package selectionsort;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Acer
 */
public class DeleteItem {
    
     public static void main(String[] args) {
        //Array declaration
        int[] arr = {20, 40, 4, 55, 30};
        

        Scanner input = new Scanner(System.in);
        
         System.out.println("Array: " + Arrays.toString(arr));
        
        System.out.println("Enter element to delete: ");
        int n = input.nextInt();
        
        int count = 0;
        for(int num : arr){
            if(num != n){
                count++;
            }
        }
        
        //modified array
        int[] mordified = new int[count];
        int index = 0;
        
        for(int num : arr){
            if(num != n){
                mordified[index++] = num;
            }
        }
        
         System.out.println("Mordified Array: " + Arrays.toString(mordified));
        

    }
    
  
    
    
    
}
