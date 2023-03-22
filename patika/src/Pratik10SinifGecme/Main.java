package javaApplications.Pratik10SinifGecme;

import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        int mat,fizik,turkce,kimya,muzik;
        double sum = 0, avarage;

        Scanner inp = new Scanner(System.in);

        System.out.println("Matematik notunuzu giriniz :");
        mat = inp.nextInt();
        if ((mat < 0) || (mat > 100)) {
            System.out.println("Matematik dersi notunuz hatalı girdiniz.Ortalamaya eklenmeyecek.");
        }else {
            sum += mat;
        }

        System.out.println("Fizik notunuzu giriniz :");
        fizik = inp.nextInt();
        if ((fizik < 0) || (fizik > 100)) {
            System.out.println("Fizik dersi notunuz hatalı girdiniz.Ortalamaya eklenmeyecek.");
        }else {
            sum += fizik;
        }

        System.out.println("Turkce notunuzu giriniz :");
        turkce = inp.nextInt();
        if ((turkce < 0) || (turkce > 100)) {
            System.out.println("Turkce dersi notunuz hatalı girdiniz.Ortalamaya eklenmeyecek.");
        }else {
            sum += turkce;
        }

        System.out.println("Kimya notunuzu giriniz :");
        kimya = inp.nextInt();
        if ((kimya < 0) || (kimya > 100)) {
            System.out.println("Kimya dersi notunuz hatalı girdiniz.Ortalamaya eklenmeyecek.");
        }else {
            sum += kimya;
        }

        System.out.println("Muzik notunuzu giriniz :");
        muzik = inp.nextInt();
        if ((muzik < 0) || (muzik > 100)) {
            System.out.println("Muzik dersi notunuz hatalı girdiniz.Ortalamaya eklenmeyecek.");
        }else {
            sum += muzik;
        }

        avarage = sum / 5;

        if (avarage >= 55) {
            System.out.println("Tebrikler sınıfı geçtiniz.");
        }else {
            System.out.println("Sınıfta kaldınız.");
        }
        System.out.println("Ortalamanız : " + avarage);



    }
}
