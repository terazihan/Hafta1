/** @author Erhan YILDIRIm (Patika.dev) - 19.12.2023 */
import java.util.Scanner;
public class kdvTutari {
    public static void main(String[] args) {

        //Değer tanımlarını giriyoruz
        double kdvoran, fiyat, kdvfiyat, kdvtutar;

        //Giriş tanımı
        Scanner giris = new Scanner(System.in);

        //Kullanıcı girişi
        System.out.print("Hesaplanacak TL fiyatı girin: ");
        fiyat= giris.nextDouble();

        //KDV Oranı Hesaplama
        if (fiyat <= 1000) {
            kdvoran = 0.18;
        } else {
            kdvoran = 0.08;
        }

        //KDV Hesaplama
        kdvtutar = fiyat * kdvoran;
        kdvfiyat = fiyat + kdvtutar;

        //Sonuç ekranı
        System.out.println("KDV'siz Fiyatı: " + fiyat + "TL");
        System.out.println("KDV Oranı: " + kdvoran);
        System.out.println("KDV Tutarı: " + kdvtutar + "TL");
        System.out.print("KDV'li Fiyatı: " + kdvfiyat + "TL");

    }
}
