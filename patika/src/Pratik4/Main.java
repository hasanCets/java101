package Pratik4;

//Kenar uzunluklarıyla üçgen alanı hesaplayan program.

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        int a,b,c;

        Scanner inp = new Scanner(System.in);
        System.out.print("Birinci kenarı giriniz :");
        a = inp.nextInt();
        System.out.print("İkinci kenarı giriniz :");
        b = inp.nextInt();
        System.out.print("Üçüncü kenarı giriniz :");
        c = inp.nextInt();
        int u = ((a+b+c)/2);
        double alan = Math.sqrt(u*(u-a)*(u-b)*(u-c));
        System.out.println("Üçgenin alanı :" + alan);

    }
}
