/** @author Erhan YILDIRIM (Patika.dev) - 20.12.2023 */
import java.util.Scanner;
public class daire {
    public static void main(String[] args) {
        //Veri tiplerini tanımlıyoruz
        int r;
        double pi= 3.14;

        //Kullanıcı girişi
        Scanner giris= new Scanner(System.in);
        System.out.print("Dairenin yarıçapını giriniz: ");
        r= giris.nextInt();

        //Alan ve çevre hesaplama
        double alan= pi * r * r;
        double cevre= 2 * pi * r;

        //Ekrana yazdırma
        System.out.println("Dairenin Alanı: " + alan);
        System.out.print("Dairenin Çevresi: " + cevre);
    }
}
