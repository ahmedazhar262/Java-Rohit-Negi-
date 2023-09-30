// A
// A B
// A B C
// A B C D
// A B C D E


import java.util.*;
public class Pattern{
    public static void main(String [] args){

        int rows= 5;

        for(char a='A'; a<='E'; a++){
          for(char c='A'; c<=a; c++){
             System.out.print(c+ " ");
             
          }

          System.out.println(" ");
        }
    }
}