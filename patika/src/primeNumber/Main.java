package javaApplications.primeNumber;

public class Main {
    public static void main(String[] args) {
        for (int i = 2; i <= 100; i++){
            boolean prime = true;
            for (int j = 2; j < i; j++){
                if (i % j == 0){
                    prime = false;
                }
            }
            if (prime == true)
                System.out.print(" " + i + " ");
        }
    }
}
