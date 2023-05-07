package Arrays.repeatingEvenNumbers;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] numbers = {22,22,31,2,3,3,4,4,51,51,2,12,2,5,6};
        System.out.println("Dizi :" + Arrays.toString(numbers));

        Arrays.sort(numbers);
        System.out.println("Sıralanmis :" + Arrays.toString(numbers));
        int counter = 0;
        for (int i = 0; i < numbers.length-1; i++){
            if (numbers[i] == numbers[i+1]){
                int evenNumber = numbers[i];
                if (evenNumber % 2 == 0){
                    counter++;
                    System.out.println(evenNumber + " ");
                }
            }
        }
        if (counter == 0){
            System.out.println("Tekrar eden cift sayi bulunamadi..");
        }

    }
}
