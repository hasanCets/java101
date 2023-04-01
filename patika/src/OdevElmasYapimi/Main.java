package Donguler.OdevElmasYapimi;
import java.util.Scanner;
public class Main {
    public static void main (String[] args){
        int basamakSayisi;

        Scanner input = new Scanner(System.in);

        System.out.print("Basamak sayısını giriniz :");
        basamakSayisi = input.nextInt();

        for (int i = 1; i <= basamakSayisi; i++) {
            for (int j = 1; j <= (basamakSayisi - i); j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }

        for (int o = 1; o <= (basamakSayisi - 1); o++) {
            for (int l = 1; l <= o; l++) {
                System.out.print(" ");
            }
            for (int m = 1; m <= 2 * (basamakSayisi - o) - 1; m++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
