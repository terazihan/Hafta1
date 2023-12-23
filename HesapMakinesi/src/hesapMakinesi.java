/** @author Erhan YILDIRIM (Patika.dev) - 23.12.2023 */
import java.util.Scanner;
public class hesapMakinesi {
    public static void main(String[] args) {
        int n1,n2,select; //Girilecek sayıların değişkenlerini atıyoruz.
        int sonuc=0;

        //Kullanıcıdan gelen girişleri alıp değişkenlere atıyoruz.
        Scanner input = new Scanner(System.in);
        System.out.print("İlk sayıyı giriniz: ");
        n1 = input.nextInt();
        System.out.print("İkinci sayıyı giriniz: ");
        n2 = input.nextInt();

        //Kullanıcının yapmak istediği işlemi seçtiriyoruz.
        System.out.println("1)Toplama\n2)Çıkarma\n3)Çarpma\n4)Bölme");
        System.out.print("İşlem seçiminizi yapınız: ");
        select = input.nextInt();

        //Switch-case kullanarak dört işlemi sonuçlandırıyoruz.
        switch (select){
            case 1:
                sonuc = (n1+n2);
                break;
            case 2:
                sonuc = (n1-n2);
                break;
            case 3:
                sonuc = (n1*n2);
                break;
            case 4: //Burada bölme işleminde n2 değeri 0 olursa program hata verir. Bunun önüne geçmek için if-else ile doğrulama yapıyoruz.
                if (n2!=0){
                sonuc = (n1/n2);}
            else {
                System.out.print("Bir sayı sıfıra bölünemez. Lütfen tekrar deneyiniz.");
                return;
            }
                break;
            default: //Farklı bir işlem numarası girdiklerinde çıkacak ekranı yazıyoruz.
                System.out.print("Yanlış işlem seçtiniz. Lütfen tekrar deneyiniz.");
                return;
        } //Sonuç ekranımızı yazdırıyoruz.
        System.out.print("İşlem sonucu: " + sonuc);
    }
}
