package Donguler.OdevEbobEkok;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int n1, n2, i, ebob=1, ekok=1;
        Scanner inp = new Scanner(System.in);
        System.out.print("n1 sayısını giriniz: ");
        n1 = inp.nextInt();
        System.out.print("n2 sayısını giriniz: ");
        n2 = inp.nextInt();
        if (n1<n2){
            i = n1;
            while (i>=1){
                if ((n1%i==0)&&(n2%i==0)){
                    ebob = i;
                    break;
                }
                i--;
            }
        }else if (n2<n1){
            i=n2;
            while (i>=1){
                if ((n1%i==0)&&(n2%i==0)){
                    ebob = i;
                    break;
                }
                i--;
            }
        }
        i =1;
        while (i<=n1*n2){
            if((i%n1==0)&&(i%n2==0)){
                ekok = i;
                break;
            }
            i++;
        }
        System.out.println("Ebob: " + ebob);
        System.out.println("Ekok: " + ekok);
    }
}
