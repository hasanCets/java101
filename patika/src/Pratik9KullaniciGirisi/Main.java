package javaApplications.Pratik9KullaniciGirisi;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String userName = "Patika", password = "Java101";
        System.out.print("Enter your username: ");
        String Login_userName = scan.next();

        System.out.print("Enter your password: ");
        String Login_password = scan.next();

        if (Login_userName.equals(userName) && (Login_password.equals(password))) {
            System.out.println("Succesfully logged in.");
        } else {
            System.out.println("Wrong information entered!");
            System.out.println("Reset your password (1-Yes / 0-No)");
            int choice = scan.nextInt();
            switch (choice) {
                case 0:
                    System.out.println("The transaction has been cancelled.");
                    break;
                case 1:
                    System.out.println("Enter your new password");
                    String newPassword = scan.next();
                    if ((newPassword.equals(password))) {
                        System.out.println("New password cannot be the same as the old one.");
                    } else {
                        System.out.println("The password has been changed succesfully.");
                    }
                    break;
                default:
                    System.out.println("Invalid value entered.");

            }

        }
        scan.close();

    }
}