// 2: Calculate the average of elements in an array of size 18

import java.util.*;
public class Array{
    public static void main(String [] args){
        Scanner sc= new Scanner(System.in);

        System.out.println("Enter the size of an Array:");
        int size= sc.nextInt();
        
        int [] arr= new int[size];
        
        System.out.println("Enter the no in the Array:");
        for(int i=0; i<size; i++){
             arr[i]= sc.nextInt();   
        }
        int sum=0;
        for(int i=0; i<size; i++){
            sum+= arr[i];   
        }  
        int average_of_arr= sum/size;
        System.out.println("Average of "+ size + " Element are: " + average_of_arr); 
    }
}