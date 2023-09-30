// A B C D
// A B C
// A B
// A


import java.util.*;
public class Pattern{
    public static void main(String [] args){

        int rows= 5;

        for(char a='D'; a>='A'; a--){
          for(char c='A'; c<=a; c++){
             System.out.print(c+ " ");
             
          }

          System.out.println(" ");
        }
    }
}