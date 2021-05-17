package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] pole = new int[19][19];
        int x1 = 9, y1 = 9, a = 0;
        boolean t = false;
        pole[x1][y1] = 2;
        pole[9][10] = 1;
        while (a != 5) {
            a = sc.nextInt();
            if (a == 1 && (pole[x1][y1 - 1]) == 0) {//вверх
                pole[x1][y1] = 0;
                y1 = y1 - 2;
                pole[x1][y1] = 2;
                t = true;
            }

            if (a == 2 && (pole[x1 + 1][y1]) == 0) {//вправо
                pole[x1][y1] = 0;
                x1 = x1 + 2;
                pole[x1][y1] = 2;
                t = true;
            }

            if (a == 3 && (pole[x1][y1 + 1]) == 0) {//вниз
                pole[x1][y1] = 0;
                y1 = y1 + 2;
                pole[x1][y1] = 2;
                t = true;
            }

            if (a == 4 && (pole[x1 - 1][y1]) == 0) {//влево
                pole[x1][y1] = 0;
                x1 = x1 - 2;
                pole[x1][y1] = 2;
                t = true;
            }
            if (t == false) {
                System.out.println("стенка");
            }
            t = false;
            for (int i = 0; i < 19; i++) {
                for (int j = 0; j < 19; j++) {
                    System.out.print(pole[j][i] + " ");
                }
                System.out.println();
            }
        }

    }
}
