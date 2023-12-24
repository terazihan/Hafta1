/** @author Erhan YILDIRIM (Patika.dev) - 25.12.2023 */
import java.util.Scanner;
public class artikYil {
    public static void main(String[] args) { //Değişkenleri tanımlıyoruz.
        Scanner input = new Scanner(System.in);
        int yil;
        boolean artikYil=false;

        //Kullanıcı girişi yapılıyor.
        System.out.print("Yıl Giriniz: ");
        yil = input.nextInt();
        
        //İstenen sonuç için denklem uygulanıyor.
        if ((yil % 4 == 0 && yil % 100 != 0) || (yil % 400 == 0)) {
            artikYil = true;
        }

        if (artikYil) {
            System.out.println(yil + " bir artık yıldır.");
        } else {
            System.out.println(yil + " bir artık yıl değildir.");
        }
    }
}
