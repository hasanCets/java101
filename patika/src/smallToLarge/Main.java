package Arrays.smallToLarge;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        System.out.print("Dizinin boyutu :");
        int n = inp.nextInt();

        int[] arr = new int[n];
        System.out.println("Dizi elemanlarını giriniz:");
        for (int i = 0; i < n; i++){
            System.out.print((i+1) + ". Elemanı :");
            arr[i] = inp.nextInt();
        }
        System.out.println("Dizi :" + Arrays.toString(arr));
        Arrays.sort(arr);
        System.out.println("Sıralama :" + Arrays.toString(arr));
    }
}
