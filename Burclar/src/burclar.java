/** @author Erhan YILDIRIM (Patika.dev) - 25.12.2023 */
import java.util.Scanner;
public class burclar {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int mounth, day;

        //Kullanıcı girişini alıyoruz.
        System.out.print("Doğduğunuz ay numarasını girin: ");
        mounth = input.nextInt();
        if (mounth > 0 || mounth < 13) {
            mounth = 0;

        }

        System.out.print("Doğduğunuz günü giriniz: ");
        day = input.nextInt();
        if (day > 0 || day < 32) {
            day = 0;
        }
            //Şimdi istenen denklemi kuruyoruz.
            if (mounth == 1) {
                if (day >= 22 && day <= 31) {
                    System.out.print("Burcunuz KOVA");
                } else {
                    System.out.print("Burcunuz OĞLAK");
                }
            } else if (mounth == 2) {
                if (day >= 1 && day <= 19) {
                    System.out.print("Burcunuz KOVA");
                } else {
                    System.out.print("Burcunuz BALIK");
                }
            } else if (mounth == 3) {
                if (day >= 1 && day <= 20) {
                    System.out.print("Burcunuz BALIK");
                } else {
                    System.out.print("Burcunuz KOÇ");
                }
            } else if (mounth == 4) {
                if (day >= 1 && day <= 20) {
                    System.out.print("Burcunuz KOÇ");
                } else {
                    System.out.print("Burcunuz BOĞA");
                }
            } else if (mounth == 5) {
                if (day >= 1 && day <= 21) {
                    System.out.print("Burcunuz BOĞA");
                } else {
                    System.out.print("Burcunuz İKİZLER");
                }
            } else if (mounth == 6) {
                if (day >= 1 && day <= 22) {
                    System.out.print("Burcunuz İKİZLER");
                } else {
                    System.out.print("Burcunuz YENGEÇ");
                }
            } else if (mounth == 7) {
                if (day >= 1 && day <= 22) {
                    System.out.print("Burcunuz YENGEÇ");
                } else {
                    System.out.print("Burcunuz ASLAN");
                }
            } else if (mounth == 8) {
                if (day >= 1 && day <= 22) {
                    System.out.print("Burcunuz ASLAN");
                } else {
                    System.out.print("Burcunuz BAŞAK");
                }
            } else if (mounth == 9) {
                if (day >= 1 && day <= 22) {
                    System.out.print("Burcunuz BAŞAK");
                } else {
                    System.out.print("Burcunuz TERAZİ");
                }
            } else if (mounth == 10) {
                if (day >= 1 && day <= 22) {
                    System.out.print("Burcunuz TERAZİ");
                } else {
                    System.out.print("Burcunuz AKREP");
                }
            } else if (mounth == 11) {
                if (day >= 1 && day <= 21) {
                    System.out.print("Burcunuz AKREP");
                } else {
                    System.out.print("Burcunuz YAY");
                }
            } else if (mounth == 12) {
                if (day >= 1 && day <= 21) {
                    System.out.print("Burcunuz YAY");
                } else {
                    System.out.print("Burcunuz OĞLAK");
                }
            } else if (mounth == 0 || day == 0){
                System.out.print("Yanlış değer girdiniz! Lütfen tekrar deneyiniz.");
            }
        }

    }