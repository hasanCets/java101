package Donguler.Pratik1Dongu;
import java.util.Scanner;
public class Main {
    public static void main (String[] args){
        int k;
        Scanner inp = new Scanner(System.in);

        System.out.print("Sayi giriniz :");
        k = inp.nextInt();
        int i = 1;
        while(i <= k){
            i++;
            if(i % 2 == 0){
                System.out.println(i);
            }
        }


    }
}
