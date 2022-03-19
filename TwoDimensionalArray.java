package isep.com;

import java.util.Random;
import java.util.Scanner;

public class TwoDimensionalArray {
    public static void main(String[] args ) {


        Scanner sc= new Scanner(System.in);
        System.out.print("Enter a number ");
        int x = sc.nextInt();


        Scanner sca= new Scanner(System.in);
        System.out.print("Enter a number ");
        int y= sca.nextInt();


        int maxi = 0;
        int mini = 100;
        int z;
        double sum = 0;
        double average;


        Random rand = new Random();
        int[][] tableau = new int [x][y];
        for (int j = 0; j<x; j++ ) {
            tableau[j][j] = rand.nextInt(100);


            for (int i = 0; i<y; i++) {
                tableau[i][i] = rand.nextInt(100);
                sum = sum + tableau[i][j];


                System.out.print(tableau[j][i]+" ");
            }
            System.out.println();
            average = sum/(y);
            sum = 0;
            System.out.println("La moyenne est " + average);
        }

    }
}