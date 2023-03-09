package Ders10;

// Kullanıcıdan veri alma

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);

        System.out.print("Bir değer giriniz :");
        String str = input.nextLine();


        System.out.print("A sayisini giriniz :");
        int a = input.nextInt();

        System.out.print("B sayisini giriniz :");
        double b = input.nextDouble();

        System.out.println(str);
        System.out.println(a);
        System.out.println(b);
    }
}
