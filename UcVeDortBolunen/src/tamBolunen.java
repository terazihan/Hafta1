/** @author Erhan YILDIRIM (Patika.dev) - 26.12.2023 */
import java.util.Scanner;
public class tamBolunen {
    public static void main(String[] args) {
        int sayi,sayac=0,sonuc=0,k=1; //Değişkenleri atıyoruz.

        Scanner input = new Scanner(System.in);

        //Kullanıcı girişi yapılıyor.
        System.out.print("Lütfen sayı giriniz: ");
        sayi = input.nextInt();

        //Döngüler ile hesaplama yapıyoruz.
        for (int i = 1; i <= sayi; i++){
            if (i % 3 == 0 && i %4 == 0) {
                sayac += i;
                k++;
            }
        } //Bundan sonra işlem sonucunu yazdırıyoruz.
        if (k > 1) {
            sonuc = sayac / k;
            System.out.print("İşlem sonucu: " + sonuc);
        } else {
            System.out.print("3 ve 4'e ortak bölünen bulunamadı.");
        }


    }
}
