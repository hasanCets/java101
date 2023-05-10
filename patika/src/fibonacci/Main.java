package javaApplications.fibonacci;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println("Fibonacci series length: ");
        int length = inp.nextInt();

        int[] series = new int[length];
        series[0] = 0;
        series[1] = 1;

        for (int i = 2; i < length; i++) {
            series[i] = series[i-1] + series[i-2];
        }

        for (int i = 0; i < length; i++){
            System.out.println(series[i] + " ");
        }
    }
}
