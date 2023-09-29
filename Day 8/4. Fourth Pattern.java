// F G H I J K
// F G H I J K
// F G H I J K
// F G H I J K
// F G H I J K


import java.util.*;
public class Pattern{
    public static void main(String [] args){

        int rows= 5;
        int cols= 6;

        for(int i=1; i<=rows; i++){
            for(char c='F'; c<='K'; c++){
                
                System.out.print(c+ " ");
            }
            System.out.println(' ');

        }
    }
}
