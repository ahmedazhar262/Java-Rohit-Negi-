//  1
//  1 2
//  1 2 3
//  1 2 3 4
//  1 2 3 4 5
//  1 2 3 4 5 6
//  1 2 3 4 5 6

import java.util.*;
public class Pattern{
    public static void main(String [] args){

        int rows= 6;

        for(int i=1; i<=rows; i++){
          for(int j=1; j<=i; j++){
             System.out.print(j+ " ");
             
             if(j==6){
                 for(int k=1; k<=j; k++)
                     System.out.print("\n"+k+ " ");
                 
             }
          }

          System.out.println(" ");
        }
    }
}