// 1 4 9 16 25
// 1 4 9 16 25
// 1 4 9 16 25
// 1 4 9 16 25
// 1 4 9 16 25
// 1 4 9 16 25

import java.util.*;
public class Pattern{
    public static void main(String [] args){

        int rows= 6;
        int cols= 5;

        for(int i=1; i<=rows; i++){
            for(int j=1; j<=cols; j++){
                int value= j*j;
                System.out.print(value+ " ");
            }
            System.out.println(' ');

        }
    }
}
