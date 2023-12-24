/** @author Erhan YILDIRIM (Patika.dev) - 25.12.2023 */
import java.util.Scanner;
public class ucakBileti {
    public static void main(String[] args) { //Değişkenleri tanımlıyoruz.
        int distance,age,type;
        Scanner scanner = new Scanner(System.in);

        //Kullanıcı bilgilerinin girildiği ekran.
        System.out.print("Mesafeyi KM cinsinden giriniz: ");
        distance = scanner.nextInt();

        System.out.print("Yaşınızı giriniz: ");
        age = scanner.nextInt();

        System.out.print("Yolculuk tipini giriniz (Tek Yön için 1, Gidiş-Dönüş için 2): ");
        type = scanner.nextInt();

        //Bilet fiyatının hesaplandığı denklemler;
        double biletTutari = distance * 0.10;

        if (distance <= 0 || age <= 0 || (type != 1 && type != 2)) {
            System.out.println("Hatalı Veri Girdiniz !");
        } else {
            if (age < 12) {
                biletTutari *= 0.5; // Burada %50 indirim uygulanır.
            } else if (age <= 24) {
                biletTutari *= 0.9; // Burada %10 indirim uygulanır.
            } else if (age >= 65) {
                biletTutari *= 0.7; // Burada %30 indirim uygulanır.
            }

            if (type == 2) {
                biletTutari *= 0.8; // Burada %20 indirim uygulanır.
                biletTutari *= 2; // Gidiş-dönüş olduğu için 2'yle çarpılır.
            }

            System.out.println("Toplam Tutar: " + biletTutari + " TL");
        }
    }
}
