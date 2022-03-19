package TSI.lv;

import java.util.Random;
import java.util.Scanner;

public class OneDimensionalArray {

    public static void main(String[] args ) {

        Scanner sc= new Scanner(System.in); //System.in is a standard input stream.
        System.out.print("Enter a number ");
        int x = sc.nextInt();

        Scanner sca= new Scanner(System.in); //System.in is a standard input stream.
        System.out.print("Enter a number ");
        int y= sca.nextInt();

        int maxi = 0;
        int mini = 100;
        int z;
        double sum = 0;
        double average;

        Random rand = new Random();
        int[][] tableau = new int [x][y];
        for (int i = 0; i<x; i++ ) {
            tableau[i][i] = rand.nextInt(100);

            for (int j = 0; j<y; j++) {
                tableau[i][j] = rand.nextInt(100);
                sum = sum + tableau[i][j];

                System.out.print(tableau[i][j]+" ");

                z = tableau[i][j];
                if (z > maxi){
                    maxi = z;
                }
                if (z<mini){
                    mini = z;
                }

            }
            System.out.println();

        }
        System.out.println("The maximum is " + maxi);
        System.out.println("The minimum is " + mini);
        average = sum/(x*y);
        System.out.println("The average is " + average);
    }
}