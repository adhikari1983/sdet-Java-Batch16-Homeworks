/*
Write a program to print out the pattern:
1 2 3 4 5 6 7 8 9 10

2 4 6 8 10 12 14 16 18 20

3 6 9 12 15 18 21 24 27 30

4 8 12 16 20 24 28 32 36 40

5 10 15 20 25 30 35 40 45 50
 */
package com.syntax.replits.replit3.forloops;

public class E67NestedForLoop {
    public static void main(String[] args) {
        for (int j = 1; j <=5 ; j++) {
            for (int i = 1; i <=10 ; i++) {
                System.out.print((i*j) + " ");
            }
            System.out.println(" ");
        }
    }
}
