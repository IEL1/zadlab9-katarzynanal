
package pl.edu.ur.oopl9;

import java.util.*;
import java.util.Arrays;
import java.util.Random;
public class Main {

    private static int i;

    
    public static void main(String[] args)   {
       int tab[ ]=new int[100];
    System.out.println("Losowanie:");
        Random r = new Random();
        for(int i=0;i<100;i++)
        {
            tab[i]=r.nextInt();
            System.out.println(tab[i]);
        }
    System.out.println("Sortowanie:");
      Arrays.sort(tab);
        for(int i=0;i<100;i++)
        {
            tab[i]=r.nextInt();
            System.out.println(tab[i]);
        }
    }
    
}