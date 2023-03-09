package Ders9;

//Temel operatörler
public class Main {
    public static void main(String[] args) {
        int a = 5 , b = 6, c = 5;
        boolean kosul1 = a == c;
        boolean kosul2 = a >= b;
        boolean sonuc  = kosul1 && kosul2;
        boolean sonuc2 = kosul1 || kosul2;
        boolean sonuc3 = !((a == c) || (a >= b));

        String str = (sonuc) ? "Doğru" : "Değil";
        System.out.println(str);
        System.out.println(kosul1);
        System.out.println(kosul2);
        System.out.println(sonuc);
        System.out.println(sonuc2);
        System.out.println(sonuc3);
    }
}
