/** @author Erhan YILDIRIM (Patika.dev) 1. Hafta Ödevi - 20.12.2023 */
import java.util.Scanner;
public class manavKasa {
    public static void main(String[] args) {
        //Veri tiplerini belirleyelim.
        int arm,elm,dom,muz,pat;
        double toplam,armut=2.14,elma=3.67,domates=1.11,muzf=0.95,patlican=5.00;

        //Kullanıcı girişi yapalım.
        Scanner giris= new Scanner(System.in);
        System.out.print("Armut kilo giriniz: ");
        arm= giris.nextInt();
        System.out.print("Elma kilo giriniz: ");
        elm= giris.nextInt();
        System.out.print("Domates kilo giriniz: ");
        dom= giris.nextInt();
        System.out.print("Muz kilo giriniz: ");
        muz= giris.nextInt();
        System.out.print("Patlıcan kilo giriniz: ");
        pat= giris.nextInt();

        //Hesaplama yapalım.
        double toparm= arm * armut;
        double topelm= elm * elma;
        double topdom= dom * domates;
        double topmuz= muz * muzf;
        double toppat= pat * patlican;
        toplam= toparm + topelm + topdom + topmuz + toppat;

        //Ekrana yazdıralım. (Hadi biraz farklı olsun, her birimin de ücretini ekranda görelim)
        System.out.println("-------------------------------------------");
        System.out.println("Armut için ödenecek tutar: " + toparm + "TL");
        System.out.println("Elma için ödenecek tutar: " + topelm + "TL");
        System.out.println("Domates için ödenecek tutar: " + topdom + "TL");
        System.out.println("Muz için ödenecek tutar: " + topmuz + "TL");
        System.out.println("Patlıcan için ödenecek tutar: " + toppat + "TL");
        System.out.print("\nToplam ödenecek tutar: " + toplam + "TL");

    }
}
