package com.company;

import java.util.Scanner;

public class Main {
    public static int[][] pole = new int[19][19];
    public static int x2 = 9, y2 = 9, wall = 1;
    Scanner sc = new Scanner(System.in);

    public static void out() {
        for (int i = 0; i < 19; i++) {
            for (int j = 0; j < 19; j++) {
                System.out.print(pole[j][i] + " ");
            }
            System.out.println();
        }
    }

    public static void pl2_hode(int n) {
        boolean t = false;
        while (t == true) {
            if (n == 1 && (pole[x2][y2 - 1]) == 0) {//вверх
                pole[x2][y2] = 0;
                y2 = y2 - 2;
                pole[x2][y2] = 2;
                t = true;
            }

            if (n == 2 && (pole[x2 + 1][y2]) == 0) {//вправо
                pole[x2][y2] = 0;
                x2 = x2 + 2;
                pole[x2][y2] = 2;
                t = true;
            }

            if (n == 3 && (pole[x2][y2 + 1]) == 0) {//вниз
                pole[x2][y2] = 0;
                y2 = y2 + 2;
                pole[x2][y2] = 2;
                t = true;
            }

            if (n == 4 && (pole[x2 - 1][y2]) == 0) {//влево
                pole[x2][y2] = 0;
                x2 = x2 - 2;
                pole[x2][y2] = 2;
                t = true;
            }
            if (t == false) {
                System.out.println("стенка");
            }
        }

    }

    public static void pl1_hode(int x1, int y1, int side, boolean end_hode) {


        Scanner sc = new Scanner(System.in);
        while (wall != 0 && end_hode == false) {

            if (side == 1) {//поставить стенку вверх
                if (pole[x1 * 2 - 1][y1 * 2 - 1 - 1] == 1) {
                    System.out.println("Стенка уже поставлена");
                    x1 = sc.nextInt();
                    y1 = sc.nextInt();
                    side = sc.nextInt();

                } else {
                    pole[x1 * 2 - 1][y1 * 2 - 1 - 1] = 1;
                    wall = wall - 1;
                    if (wall > 0) {
                        System.out.println("Конец хода?");
                        end_hode = sc.nextBoolean();
                    }
                }

            }
            if (side == 2) {//поставить стенку вправо
                if (pole[x1 * 2 - 1 + 1][y1 * 2 - 1] == 1) {
                    System.out.println("Стенка уже поставлена");
                    x1 = sc.nextInt();
                    y1 = sc.nextInt();
                    side = sc.nextInt();

                } else {
                    pole[x1 * 2 - 1 + 1][y1 * 2 - 1] = 1;
                    if (wall > 0) {
                        System.out.println("Конец хода?");
                        end_hode = sc.nextBoolean();
                    }
                }

            }
            if (side == 3) {//поставить стенку вниз
                if (pole[x1 * 2 - 1][y1 * 2 - 1 + 1] == 1) {
                    System.out.println("Стенка уже поставлена");
                    x1 = sc.nextInt();
                    y1 = sc.nextInt();
                    side = sc.nextInt();

                } else {
                    pole[x1 * 2 - 1][y1 * 2 - 1 + 1] = 1;
                    if (wall > 0) {
                        System.out.println("Конец хода?");
                        end_hode = sc.nextBoolean();
                    }
                }
            }
            if (side == 4) {//поставить стенку влево
                if (pole[x1 * 2 - 1 - 1][y1 * 2 - 1] == 1) {
                    System.out.println("Стенка уже поставлена");
                    x1 = sc.nextInt();
                    y1 = sc.nextInt();
                    side = sc.nextInt();

                } else {
                    pole[x1 * 2 - 1 - 1][y1 * 2 - 1] = 1;
                    if (wall > 0) {
                        System.out.println("Конец хода?");
                        end_hode = sc.nextBoolean();
                    }

                }
            }

        }
        if (wall + 1 != 4) {
            wall = wall + 1;
        }


    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        pole[x2][y2] = 2;
        pole[9][10] = 1;
        wall=3;
        int a,b,c;
        a= sc.nextInt();
        b= sc.nextInt();
        c= sc.nextInt();

        //pl1_hode();
        out();





        /*while (a != 5) {
            a = sc.nextInt();
            try{
                pl2_hode(a);
                out();
            }
            catch (Exception e){
                  System.out.println("Игрок 2 победил");
            }

        }*/

    }
}
