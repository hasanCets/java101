package Arrays.MinMaxSorting;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int[] valueList = {12,42,-4,0,23,1,3,90,-32};
        Scanner inp = new Scanner(System.in);

        System.out.println("Dizi :" + Arrays.toString(valueList));

        System.out.print("Bir sayi giriniz :");
        int number = inp.nextInt();
        int min = number;
        int max = number;
        Arrays.sort(valueList);
        System.out.println("Sıralı :" + Arrays.toString(valueList));

        // En yakın büyük sayıyı bulalım
        for (int item: valueList){
            if (item > number){
                max = item;
                break;
            }
        }

        //En yakın kücük sayıyı bulalım.
        for (int i = valueList.length-1; i >= 0; i--){
            if (valueList[i] < number){
                min = valueList[i];
                break;
            }

        }

        System.out.println("En yakın büyük sayı :" +max);
        System.out.println("En yakın küçüj sayı :" +min);

    }
}
