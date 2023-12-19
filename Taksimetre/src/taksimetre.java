/** @author Erhan YILDIRIM (Patika.dev) - 20.12.2023 */
import java.util.Scanner;
public class taksimetre {
    public static void main(String[] args) {
        //Verileri tanımlıyoruz
        int yol, baslangic= 10;
        double birim= 2.20, toplam;

        //Kullanıcı girişi
        Scanner giris = new Scanner(System.in);
        System.out.print("Kaç KM yol gidildi? : ");
        yol= giris.nextInt();

        //Tutar hesaplama
        toplam= yol * birim;
        toplam += baslangic;
        toplam = (toplam <= 20) ? 20 : toplam;

        //Ekrana yazdırma
        System.out.print("Ödenecek ücret: " + toplam + "TL");
        
    }
}
