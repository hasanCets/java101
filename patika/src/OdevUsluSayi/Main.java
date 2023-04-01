package Donguler.OdevUsluSayi;
import java.util.Scanner;
public class Main {
    public static void main (String[] args){
        int n,k;
        Scanner inp = new Scanner (System.in);
        System.out.print("Üssü alınacak sayıyı giriniz :");
        n = inp.nextInt();
        System.out.print("Üs olacak sayıyı giriniz :");
        k = inp.nextInt();

        int total = 1;

        for(int i=1; i <=k; i++){
            total *= n;
        }
        System.out.println("Cevap :" +total);




    }
}
