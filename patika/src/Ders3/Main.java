package Ders3;

public class Main {

    //Veri tipleri ve Değişkenler
    public static void main(String[] args) {
       int numberOne = 10;
       numberOne = 5;
       int numberTwo,numberThree = 3, numberFour;
       numberTwo = 2;
       numberFour = numberThree+numberTwo;
       System.out.println(numberOne);
       System.out.println(numberFour);

       int kisaKenar=10, uzunKenar=20;
       int cevre = 2 * (kisaKenar+uzunKenar);
       int alan  = kisaKenar * uzunKenar;
        System.out.println(cevre);
        System.out.println(alan);
    }
}
