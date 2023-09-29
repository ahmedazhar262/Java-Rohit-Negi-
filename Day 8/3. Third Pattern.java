// 1 8 27 64 125 216
// 1 8 27 64 125 216
// 1 8 27 64 125 216
// 1 8 27 64 125 216
// 1 8 27 64 125 216

import java.util.*;
public class Pattern{
    public static void main(String [] args){

        int rows= 5;
        int cols= 6;

        for(int i=1; i<=rows; i++){
            for(int j=1; j<=cols; j++){
                int value= j*j*j;
                System.out.print(value+ " ");
            }
            System.out.println(' ');

        }
    }
}
