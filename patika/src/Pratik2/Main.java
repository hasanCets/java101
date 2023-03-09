package Pratik2;

//KDV Tutarı hesaplayan program.

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        double tutar, kdvliFiyat, kdv;
        Scanner inp = new Scanner(System.in);

        System.out.print("Para değerini giriniz :");
        tutar = inp.nextDouble();

        //Kdv hesaplanıyor.
        kdv = ((tutar*18)/100);
        kdvliFiyat = (tutar+kdv);

        System.out.println("KDV'siz fiyat :" + tutar);
        System.out.println("KDV'li  fiyat :" + kdvliFiyat);
        System.out.println("KDV tutarı :" + kdv);

    }
}
