/** @author Erhan YILDIRIM (Patika.dev) - 27.12.2023 */
import java.util.Scanner;
public class basamakSayi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Kullanıcı girişi yapıyoruz.
        System.out.print("Bir sayı girin: ");
        int sayi = input.nextInt();

        int toplam = 0;
        int geciciSayi = sayi;

        //İşlem yapıldığı while döngüsü
        while (geciciSayi != 0) {
            int basamak = geciciSayi % 10;
            toplam += basamak;
            geciciSayi /= 10;
        }

        System.out.println("Sayının basamaklarındaki rakamların toplamı: " + toplam);
    }
}
