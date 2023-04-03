package Donguler.OdevMinMaks;
import java.util.Scanner;
public class Main {
    public static void main(String[] args){
    int limit, smallNumber, bigNumber, number;


    Scanner inp = new Scanner(System.in);
        System.out.print("Kaç sayı gireceksiniz ?");
        limit = inp.nextInt();


        System.out.print("1. Sayıyı giriniz :");
        number = inp.nextInt();
        bigNumber = number;
        smallNumber = number;

        for (int i = 1; i < limit; i++){
            System.out.println(i+1 + ". sayıyı giriniz");
            number = inp.nextInt();

            if (number < smallNumber){
                smallNumber = number;
            }else if (number > bigNumber){
                bigNumber = number;
            }
        }

        System.out.println("En büyük sayı : "+ bigNumber);
        System.out.println("Em küçük sayı : "+ smallNumber);



    }
}
