package Arrays.OdevHarmonik;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        System.out.print("Dizinin boyutu: ");
        int n = inp.nextInt();

        double[] arr = new double[n];
        System.out.print("Dizi elemanlarını giriniz :");
        for (int i = 0; i < n; i++){
            arr[i] = inp.nextDouble();
        }

        double sum = 0.0;
        for (int i = 0; i < n; i++) {
            sum += 1.0 / arr[i];
        }

        double harmonicMean = n / sum;
        System.out.println("Dizinin harmonik ortalaması :" + harmonicMean);
    }
}
