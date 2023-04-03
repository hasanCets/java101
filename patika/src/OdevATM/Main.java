package Donguler.OdevATM;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        String userName, password;
        Scanner inp = new Scanner(System.in);
        int right = 3;
        int balance = 1500;
        int select,price;
        while (right > 0) {
            System.out.print("Kullanıcı adınız :");
            userName = inp.nextLine();
            System.out.print("Parolanız :");
            password = inp.nextLine();

            if (userName.equals("patika") && password.equals("dev123")){
                System.out.println("Merhaba Kodluyoruz Bankasına hoş geldiniz :");
                do {
                    System.out.println("1- Para yatırma\n" +
                            "2- Para çekme\n" +
                            "3- Bakiye sorgula\n" +
                            "4- Çıkış yap.");
                    System.out.print("Lütfen yapmak istediğiniz işlemi seçiniz :");
                    select = inp.nextInt();
                    switch (select){
                        case 1:
                            System.out.print("Para miktarı :");
                            price = inp.nextInt();
                            balance += price;
                            System.out.println("Yeni bakiyeniz :" + balance);
                            break;
                        case 2:
                            System.out.print("Para miktarı :");
                            price = inp.nextInt();
                            if (price > balance){
                                System.out.println("Bakiye yetersiz, çekilebilir bakiyeniz :" +balance);
                            }else{
                                balance -= price;
                                System.out.println("Yeni bakiyeniz :" + balance);
                            }
                            break;
                        case 3:
                            System.out.println("Bakiyeniz :" + balance);
                    }

                }while(select != 4);
                System.out.println("Tekrar görüşmek üzere.");
                break;
            }else {
                right--;
                System.out.println("Hatalı kullanıcı adı veya şifre!");
                if (right == 0){
                    System.out.println("Hesabınız bloke olmuştur lütfen banka ile" +
                            "iletişime geçin!");
                } else {
                    System.out.println("Kalan hakkınız :" + right);
                }
            }
        }


    }
}

