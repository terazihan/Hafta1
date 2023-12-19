/** @author Erhan YILDIRIM (Patika.dev) - 20.12.2023 */
import java.util.Scanner;
public class hipotenus {
    public static void main(String[] args) {
        //Veri tiplerini tanımlıyoruz
        int a,b;
        double c;

        //Kullanıcı girişi
        Scanner giris = new Scanner(System.in);
        System.out.print("Üçgenin A Kenar Uzunluğunu Giriniz: ");
        a= giris.nextInt();
        System.out.print("Üçgenin B Kenar Uzunluğunu Giriniz: ");
        b= giris.nextInt();

        //Hipotenüs hesaplama
        c= Math.sqrt((a * a) + (b * b));

        //Ekrana yazdırma
        System.out.print("Üçgenin hipotenüsü: " + c);

    }
}
