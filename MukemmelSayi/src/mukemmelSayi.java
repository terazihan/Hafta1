/** @author Erhan YILDIRIM (Patika.dev) - 27.12.2023 */
import java.util.Scanner;
public class mukemmelSayi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Kullanıcı girişi yapılıyor.
        System.out.print("Bir sayı giriniz: ");
        int sayi = input.nextInt();
        int toplam = 0;

        //Formülü döngüye uyarlıyoruz.
        for (int i = 1; i <= sayi / 2; i++) {
            if (sayi % i == 0) {
                toplam += i;
            }
        }

        //Sonucu ekrana yazdıralım.
        if (toplam == sayi && sayi != 1) {
            System.out.println(sayi + " Mükemmel sayıdır.");
        } else {
            System.out.println(sayi + " Mükemmel sayı değildir.");
        }
    }
}
