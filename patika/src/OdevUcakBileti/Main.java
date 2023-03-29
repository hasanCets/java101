package javaApplications.OdevUcakBileti;
import java.util.Scanner;
public class Main {
    public static void main (String[] args){
        int km, age, tip;
        double fee = 0.10, total, discount;

        Scanner inp = new Scanner (System.in);

        System.out.print("Mesafeyi Km türünden giriniz :");
        km = inp.nextInt();
        System.out.print("Yaşınızı giriniz :");
        age = inp.nextInt();
        System.out.println("Yolculuk tipini giriniz (1 -> Tek Yön, 2 -> Gidiş Dönüş ");
        tip = inp.nextInt();

        if( (km < 0) || (age <0) || ((tip != 1) && (tip !=2))) {
            System.out.println("Hatalı veri girdiniz!");
        }else {
            total = km * fee;

            if (age < 12) {
                discount = total * 0.50;
                total = total - discount;
                discount = 0;
            }else if (age <= 24) {
                discount = total * 0.10;
                total = total - discount;
                discount = 0;
            }else if (age >= 65) {
                discount = total * 0.30;
                total = total - discount;
                discount = 0;
            }
            if (tip == 2) {
                discount = total*0.20;
                total = (total - discount)*2;
            }
            System.out.println("Toplam ödeyeceğiniz tutar : " + total);

        }




    }
}
