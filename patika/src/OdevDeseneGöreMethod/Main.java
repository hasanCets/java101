package Metotlar.OdevDeseneGöreMethod;
import java.util.Scanner;
public class Main {
    public static void recursive(int n) {
        System.out.print(n + " ");
        if(n <= 0) {
            return;
        }
        recursive(n-5);
        System.out.print(n + " ");
    }
    public static void main(String[] args){
        Scanner inp = new Scanner(System.in);
        System.out.print("Bir sayi giriniz :");
        int n = inp.nextInt();
        recursive(n);
    }
}
