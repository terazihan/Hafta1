/** @author Erhan YILDIRIM (Patika.dev) 1. Hafta Ödevi - 20.12.2023 */
import java.util.Scanner;
public class kitleEndeks {
    public static void main(String[] args) {
        //Değer tanımlarını giriyoruz.
        int kilo;
        double boy,endeks;

        //Kullanıcı girişi ekliyoruz.
        Scanner giris= new Scanner(System.in);
        System.out.print("Boy değerinizi giriniz (metre): ");
        boy=giris.nextDouble();
        System.out.print("Kilo değerinizi giriniz (kilo): ");
        kilo=giris.nextInt();

        //Endeks hesaplama yapıyoruz.
        endeks= kilo/(boy * boy);

        //Ekrana yazdırıyoruz.
        System.out.print("Vücut kitle endeksiniz: " + endeks);
    }
}
