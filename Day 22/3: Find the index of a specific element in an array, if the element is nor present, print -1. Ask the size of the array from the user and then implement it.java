// Find the index of a specific element in an array, if the element
// is nor present, print -1. Ask the size of the array from the user and
// then implement it.

import java.util.*;
public class Index_of_Array{
    public static void main(String [] args){
        Scanner sc= new Scanner(System.in);

        System.out.println("Enter size of Array:");
        int size= sc.nextInt();

        int [] arr= new int[size];

        // Enter no in the Array
        System.out.println("Enter the no in the Array");
        for(int i=0; i<size; i++){
            arr[i]= sc.nextInt();
        }
         
        System.out.println("Enter the no to find the Index:");
        int num= sc.nextInt();

        boolean found= true;

        for(int i=0; i<size; i++){
            if(arr[i]==num){
                System.out.println("Index of "+ num + " Is "+ i);
                found= true;
                break;
            }
        }
         if(!found){
              System.out.println("-1");
        }
        
    }
}