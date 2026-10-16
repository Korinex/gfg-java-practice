/*
 * GFG: Taking Input
 * https://www.geeksforgeeks.org/problems/taking-input/1
 */

import java.util.Scanner;

class GFG {
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int n = sc.nextInt();
        float f = sc.nextFloat();
        int ff = (int)f; // To Store floor of float variable f
        System.out.println(s);
        System.out.println(n);
        System.out.println(ff);
    }   
}