/** @author Erhan YILDIRIM (Patika.dev) - 20.12.2023 */
import java.util.Scanner;
public class daireOdev {
    public static void main(String[] args) {
        //Veri tiplerini tanımlıyoruz
        int r,alf;
        double pi= 3.14;

        //Kullanıcı girişi
        Scanner giris= new Scanner(System.in);
        System.out.print("Dairenin yarıçapını giriniz: ");
        r= giris.nextInt();
        System.out.print("Merkez açısının ölçüsünü giriniz: ");
        alf= giris.nextInt();

        //Alan ve çevre hesaplama
        double alan= (pi * (r * r) * alf)/360;

        //Ekrana yazdırma
        System.out.print("Daire diliminin alanı: " + alan);

    }

}
