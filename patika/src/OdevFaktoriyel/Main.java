package Donguler.OdevFaktoriyel;
import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        int n,r;
        int nFact = 1, rFact = 1, n_rFact =1;
        double combination;

        Scanner inp = new Scanner (System.in);

        System.out.print("1. Değeri giriniz :");
        n = inp.nextInt();

        System.out.print("2. Değeri giriniz :");
        r = inp.nextInt();

        for (int i = 1; i <= n; i++){
            nFact *= i;
        }

        for (int j = 1; j <= r; j++){
            rFact *= j;
        }
        for (int k = 1; k <= (n-r); k++){
            n_rFact *=k;
        }

        combination = nFact / (rFact*n_rFact);

        System.out.println("Sonuç : " + combination);







    }
}

