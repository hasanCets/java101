package Pratik3;

//Dik üçgende hipotenüs hesaplayan program.

import java.sql.SQLOutput;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        //Degiskenleri olusturalım.

        int a,b;
        double c;

        //Kullanıcıdan verilerimizi alalım.
        Scanner girdi = new Scanner(System.in);
        System.out.print("Birinci kenarı giriniz :");
        a = girdi.nextInt();
        System.out.print("İkinci kenarı giriniz :");
        b = girdi.nextInt();

        c = Math.sqrt((a*a) + (b*b));
        System.out.println("Hipotenüs :" + c);

    }
}
