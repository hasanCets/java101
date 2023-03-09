package Ödev2;
//Manavda tutar hesaplama programı.

import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        double armt = 2.14,elma = 3.67,
               domts = 1.11, muz = 0.95, patlcn = 5,tutar,
               armtKg,elmaKg,domtsKg,muzKg,patlcnKg;


        Scanner inp = new Scanner(System.in);
        System.out.print("Armut kaç kilo ? :");
        armtKg = inp.nextDouble();
        System.out.print("Elma kaç kilo ? :");
        elmaKg = inp.nextDouble();
        System.out.print("Domates kaç kilo? :");
        domtsKg = inp.nextDouble();
        System.out.print("Muz kaç kilo? :");
        muzKg = inp.nextDouble();
        System.out.print("Patlıcan kaç kilo? :");
        patlcnKg = inp.nextDouble();

        tutar = (armt*armtKg) + (elma*elmaKg) + (domts*domtsKg) + (muz*muzKg) + (patlcn*patlcnKg);

        System.out.println("Toplam Tutar : "+tutar);

    }
}
