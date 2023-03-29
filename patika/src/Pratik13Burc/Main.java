package javaApplications.Pratik13Burc;
import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        int month, day;
        String burc = "";
        boolean isEror = false;

        Scanner inp = new Scanner(System.in);
        System.out.print("Doğduğunuz ay :");
        month = inp.nextInt();

        System.out.print("Doğduğunuz gün :");
        day = inp.nextInt();

        switch (month){
            case 1:
                if (day >=1 && day <=31){
                    if (day < 22) {
                        burc = "Oğlak";
                    }else {
                        burc = "Kova";
                    }
                }else {
                    isEror = true;
                }
                break;
            case 2:
                if (day >=1 && day <=28){
                    if (day < 20) {
                        burc = "Kova";
                    }else {
                        burc = "Balık";
                    }
                }else {
                    isEror = true;
                }
                break;
            case 3:
                if (day >=1 && day <=31){
                    if (day < 21) {
                        burc = "Balık";
                    }else {
                        burc = "Koç";
                    }
                }else {
                    isEror = true;
                }
                break;
            case 4:
                if (day >=1 && day <=31){
                    if (day < 21) {
                        burc = "Koç";
                    }else {
                        burc = "Boğa";
                    }
                }else {
                    isEror = true;
                }
                break;
            case 5:
                if(day >= 1 && day <=30) {
                    if (day < 21) {
                        burc = "Boğa";
                    }else {
                        burc = "İkizler";
                    }
                }else {
                    isEror=true;
                }
                break;
            case 6:
                if(day >= 1 && day <=30) {
                    if (day < 23) {
                        burc = "İkizler";
                    }else {
                        burc = "Yengeç";
                    }
                }else {
                    isEror=true;
                }
                break;
            case 7:
                if(day >= 1 && day <=30) {
                    if (day < 23) {
                        burc = "Yengeç";
                    }else {
                        burc = "Aslan";
                    }
                }else {
                    isEror=true;
                }
                break;
            case 8:
                if(day >= 1 && day <=30) {
                    if (day < 23) {
                        burc = "Aslan";
                    }else {
                        burc = "Başak";
                    }
                }else {
                    isEror=true;
                }
                break;
            case 9:
                if(day >= 1 && day <=30) {
                    if (day < 23) {
                        burc = "Başak";
                    }else {
                        burc = "Terazi";
                    }
                }else {
                    isEror=true;
                }
                break;
            case 10:
                if(day >= 1 && day <=30) {
                    if (day < 23) {
                        burc = "Terazi";
                    }else {
                        burc = "Akrep";
                    }
                }else {
                    isEror=true;
                }
                break;
            case 11:
                if(day >= 1 && day <=30) {
                    if (day < 22) {
                        burc = "Akrep";
                    }else {
                        burc = "Yay";
                    }
                }else {
                    isEror=true;
                }
                break;
            case 12:
                if(day >= 1 && day <=30) {
                    if (day < 22) {
                        burc = "Yay";
                    }else {
                        burc = "Oğlak";
                    }
                }else {
                    isEror=true;
                }
                break;

            default:
                isEror = true;
        }

            if(isEror) {
                System.out.println("Hatalı giriş yaptınız, tekrar deneyiniz!");
            }else {
                System.out.println("Burcunuz :" + burc);
            }
    }
}
