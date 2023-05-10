package javaApplications.triangle;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int n;

        System.out.print("Enter the number of digits :");
        n = inp.nextInt();

        for (int i = n; i >= 1; i --){
            for (int j = 0; j < n-i; j++){
                System.out.print(" ");
            }
            for (int j = 0; j < (2*i)-i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
