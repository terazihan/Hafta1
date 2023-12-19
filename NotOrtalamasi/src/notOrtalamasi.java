/** @author Erhan YILDIRIM (Patika.dev) - 19.12.2023 */
import java.util.Scanner;
public class notOrtalamasi {
    public static void main(String[] args) {
        //Giriş değerleri tanımlanıyor
        int mat,fiz,kim,tur,tar,muz;

        //Giriş değeri tanımlandı
        Scanner giris = new Scanner(System.in);

        //Kullanıcı girişleri
        System.out.print("Matematik notunu giriniz: ");
        mat= giris.nextInt();
        System.out.print("Fizik notunu giriniz: ");
        fiz= giris.nextInt();
        System.out.print("Kimya notunu giriniz: ");
        kim= giris.nextInt();
        System.out.print("Türkçe notunu giriniz: ");
        tur= giris.nextInt();
        System.out.print("Tarih notunu giriniz: ");
        tar= giris.nextInt();
        System.out.print("Müzik notunu giriniz: ");
        muz= giris.nextInt();

        //Sonuç kısmına geliyoruz
        double sonuc = (mat+fiz+kim+tur+tar+muz)/6;
        System.out.println("Derslerinizin Not Ortalaması: " + sonuc);

        //Ders geçme koşulu
        boolean karne = sonuc >= 50;
        String str = (karne) ? "Sınıfı başarıyla geçtiniz." : "Maalesef sınıfta kaldınız.";
        System.out.print(str);

    }
}
