// 10
// 10 11
// 10 11 12
// 10 11 12 13
// 10 11 12 13 14
// 10 11 12 13 14 15

import java.util.*;
public class Pattern{
    public static void main(String [] args){

        for(int i=10; i<=15; i++){
          for(int j=10; j<=i; j++){
             System.out.print(j+ " ");
          }   


          System.out.println(" ");
        }
    }
}