// 4: Create an array of char types and store ‘a’ to ‘z’ in it. Then print the element of the arrays.

import java.util.*;
public class Array{
    public static void main(String [] args){
        Scanner sc= new Scanner(System.in);

        System.out.println("Enter the size of an Array:");
        int size= sc.nextInt();
        
        char [] arr= new char[size];

        for(char i='a'; i<='z'; i++){
             arr[i]= sc.nextChar();   
        }
        for(char i=0; i<size; i++){
            System.out.println(i);   
        }  
    }
}