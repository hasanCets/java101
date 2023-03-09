package Pratik6;

import java.util.Scanner;
public class Main {
    public static void main(String[]args) {
        int r,x;
        double pi = 3.14;
        Scanner inp = new Scanner(System.in);

        System.out.println("Dairenin yari çapını giriniz :");
        r = inp.nextInt();
        System.out.println("Dairenin merkez acisini giriniz :");
        x = inp.nextInt();

        double alan = ((pi*(r*r)*x)/360);
        double cevre = 2*pi*r;

        System.out.println("Dairenin alani :" + alan);
        System.out.println("Dairenin çevresi : " + cevre);

    }
}
