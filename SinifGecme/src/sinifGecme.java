/** @author Erhan YILDIRIM (Patika.dev) - 24.12.2023 */
import java.util.Scanner;
public class sinifGecme {
    public static void main(String[] args) { //Değişkenleri tanımlıyoruz.
        int mat,fiz,tur,kim,muz,ort=0;
        Scanner input = new Scanner(System.in);

        //Kullanıcıdan veri girmesini istiyoruz.
        System.out.print("Matematik notunuzu giriniz: ");
        mat = input.nextInt();
        ort = (++ort);
        if (mat < 0 || mat > 100) {
            mat = 0;
            ort = (--ort);
        }

        System.out.print("Fizik notunuzu giriniz: ");
        fiz = input.nextInt();
        ort = (++ort);
        if (fiz < 0 || fiz > 100) {
            fiz = 0;
            ort = (--ort);
        }

        System.out.print("Türkçe notunuzu giriniz: ");
        tur = input.nextInt();
        ort = (++ort);
        if (tur < 0 || tur > 100) {
            tur = 0;
            ort = (--ort);
        }

        System.out.print("Kimya notunuzu giriniz: ");
        kim = input.nextInt();
        ort = (++ort);
        if (kim < 0 || kim > 100) {
            kim = 0;
            ort = (--ort);
        }

        System.out.print("Müzik notunuzu giriniz: ");
        muz = input.nextInt();
        ort = (++ort);
        if (muz < 0 || muz > 100) {
            muz = 0;
            ort = (--ort);
        }

        double average = (mat+fiz+tur+kim+muz)/ort;
        System.out.print(ort);

        if (average <= 55) {
            System.out.println("Ortalamanız: " + average);
            System.out.print("Sınıfı geçemediniz. :(");
        }
        else {
            System.out.println("Ortalamanız: " + average);
            System.out.print("Tebrikler, sınıfı geçtiniz! :)");
        }
    }
}
