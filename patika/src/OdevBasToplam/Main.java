package Donguler.OdevBasToplam;
import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner inp = new Scanner(System.in);

        System.out.print("Sayı giriniz :");
        int number = inp.nextInt();
        int basValue,result = 0;

        while(number != 0){
            basValue = number % 10;
            result += basValue;
            number /= 10;
        }
        System.out.println("Basamak toplamı : " + result);



    }
}
