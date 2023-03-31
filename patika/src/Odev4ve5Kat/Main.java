package Donguler.Odev4ve5Kat;
import java.util.Scanner;
public class Main {
    public static void main (String [] args){

        int n;
        Scanner inp = new Scanner(System.in);

        System.out.print("Sınır sayısını giriniz:");
        n = inp.nextInt();

        for(int i=1, j=1; i <= n && j <= n; i *=4, j *= 5){
            System.out.println(i + " " +j);
        }


    }
}
