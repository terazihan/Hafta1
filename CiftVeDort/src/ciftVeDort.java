/** @author Erhan YILDIRIM (Patika.dev) - 27.12.2023 */
import java.util.Scanner;

public class ciftVeDort {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int toplam = 0;
        int sayi;

        System.out.println("Sayı giriniz (Programı sonlandırmak için tek sayı girin): ");

        while (true) {
            sayi = input.nextInt();

            if (sayi % 2 == 1) {
                break; // Tek sayı girildiğinde döngüden çık
            }

            if (sayi % 2 == 0 && sayi % 4 == 0) {
                toplam += sayi; // Çift ve 4'ün katı olan sayıları topla
            }
        }

        System.out.println("Girilen çift ve 4'ün katı olan sayıların toplamı: " + toplam);
    }
}
