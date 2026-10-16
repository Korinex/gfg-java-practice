/*
 * GFG: While Loop
 * https://www.geeksforgeeks.org/problems/while-loop/1
 */

import java.util.Scanner;

class GFG {
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        while(x>=0){
            System.out.print(x-- + " ");
        }
        
    }
}
