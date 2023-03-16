package Pratik8HesapMakSwitch;
import java.util.Scanner;
public class Main {
    public static void main (String[] args) {

        double i, j, toplam, carpim, bolum, fark;
        int islem;
        Scanner inp = new Scanner(System.in);
        System.out.println("1 - Toplama");
        System.out.println("2 - Çıkarma");
        System.out.println("3 - Çarpma");
        System.out.println("4 - Bölme");
        System.out.print("Yapmak istediğiniz işlemi numara ile seçiniz :");
        islem = inp.nextInt();
        System.out.print("İlk sayiyi giriniz :");
        i = inp.nextDouble();
        System.out.print("İkinci sayiyi giriniz :");
        j = inp.nextDouble();

        switch (islem) {
            case 1:
                toplam = i + j;
                System.out.println("Toplama sonucu: " + toplam);
                break;
            case 2:
                fark = i - j;
                System.out.println("Çıkartma sonucu: " + fark);
                break;
            case 3:
                carpim = i * j;
                System.out.println("Çarpım sonucu: " + carpim);
                break;
            case 4:
                bolum = i / j;
                System.out.println("Bölme sonucu: " + bolum);
                break;
            default:
                System.out.println("Hatalı numara girdiniz!");
        }

    }
}
