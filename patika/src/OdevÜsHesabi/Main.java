package Metotlar.OdevÜsHesabi;
import java.util.Scanner;
public class Main {
    static int exponential(int k, int m){
        int result = 1;
        for (int i = 1; i <= m; i++){
            result *= k;
        }
        return result;
    }
    public static void main(String[] args){
        Scanner inp = new Scanner(System.in);
        int base, exponent;
        System.out.print("Taban değerini giriniz :");
        base = inp.nextInt();
        System.out.print("Üs değerini giriniz :");
        exponent = inp.nextInt();
        System.out.println(base +" ^ " + exponent + "="+exponential(base,exponent));
    }
}
