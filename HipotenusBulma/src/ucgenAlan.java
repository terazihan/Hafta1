/** @author Erhan YILDIRIM (Patika.dev) - 20.12.2023 */
import java.util.Scanner;
public class ucgenAlan {
    public static void main(String[] args) {
        //Veri tiplerini tanımlıyoruz
        int a,b,c;
        double u,alan;

        //Kullanıcı girişi
        Scanner giris = new Scanner(System.in);
        System.out.print("Üçgenin A Kenar Uzunluğunu Giriniz: ");
        a= giris.nextInt();
        System.out.print("Üçgenin B Kenar Uzunluğunu Giriniz: ");
        b= giris.nextInt();
        System.out.print("Üçgenin B Kenar Uzunluğunu Giriniz: ");
        c= giris.nextInt();

        //Alan hesaplama
        u= (a + b + c)/2;
        alan= Math.sqrt(u * (u - a) * (u - b) * (u - c));

        //Ekrana yazdırma
        System.out.print("Üçgenin alanı: " + alan);

    }
}
