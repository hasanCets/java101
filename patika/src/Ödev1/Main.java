package Ödev1;
//Vücut Kitle İndeksi hesaplayan program.

import java.util.Scanner;
public class Main {
    public static void main(String[] args ) {
        double boy,kilo,indeks;

        Scanner inp = new Scanner(System.in);
        System.out.print("lütfen boyunuzu (metre cinsinde) giriniz :");
        boy = inp.nextDouble();
        System.out.print("Lütfen kilonuzu giriniz :");
        kilo = inp.nextDouble();

        indeks = (kilo/(boy*boy));

        System.out.println("Vücut Kitle İndeksiniz :" +indeks);
    }
}
