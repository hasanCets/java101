package Metotlar.Pratik1Palindrom;

public class Main {
    static boolean isPalindrom(int number){
        int temp = number, reverseNumber = 0, lastNumber;
        while (temp != 0){
            System.out.println("-----------");
            System.out.println("Sayı = " + temp);

            lastNumber = temp % 10;
            System.out.println("Son Basamak :" + lastNumber);

            reverseNumber = (reverseNumber * 10) + lastNumber;
            System.out.println("Yeni sayı :" + reverseNumber);
            temp /= 10;
            System.out.println("Yeni temp :" + temp);

        }
        if (number == reverseNumber)
            return true;
        else
            return false;

    }
    public static void main(String[] args){
        System.out.println(isPalindrom(888));
    }
}
