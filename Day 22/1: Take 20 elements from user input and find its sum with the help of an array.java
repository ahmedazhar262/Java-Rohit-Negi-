// 1: Take 20 elements from user input and find its sum with the help of an array.

import java.util.*;
public class Array{
    public static void main(String [] args){
        Scanner sc= new Scanner(System.in);

        System.out.println("Enter the size of an Array:");
        int size= sc.nextInt();
        
        int [] arr= new int[size];

        for(int i=0; i<size; i++){
             arr[i]= sc.nextInt();   
        }
        int sum=0;
        for(int i=0; i<size; i++){
            sum+= arr[i];   
        }  
        System.out.println("Sum of "+ size + " are: " + sum); 
    }
}