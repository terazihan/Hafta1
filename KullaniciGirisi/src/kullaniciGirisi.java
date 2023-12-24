/** @author Erhan YILDIRIM (Patika.dev) - 23.12.2023 */
import java.util.Scanner;

public class kullaniciGirisi {
    public static void main(String[] args) {
        String username, password, newpassword; //Kullanacağımız değişkenleri alıyoruz.
        int secim = 0;
        Scanner entrance = new Scanner(System.in);

        //Kullanıcının giriş yapacağı kısmı belirliyoruz.
        System.out.print("Lütfen Kullanıcı Adınızı Giriniz: ");
        username = entrance.nextLine();
        System.out.print("Lütfen Parolanızı Giriniz: ");
        password = entrance.nextLine();

        //Yapılan girişlerin sağlaması yapılıyor.
        if (username.equals("patika") && password.equals("java123")) {
            System.out.println("Sisteme başarıyla giriş yaptınız!");
        } else {
            //Eğer şifre yanlış ise kullanıcı burada yeni şifre oluşturmaya yönlendiriliyor.
            System.out.println("Giriş bilgileriniz yanlış.\nYeni şifre oluşturmak ister misiniz?");
            System.out.print("1) Evet\n2) Hayır\nSeçim: ");
            secim = entrance.nextInt();

            if (secim == 1) {
                System.out.print("Yeni şifrenizi giriniz: ");
                entrance.nextLine();
                newpassword = entrance.nextLine();

                if (newpassword.equals(password)) {
                    System.out.println("Eski şifreniz ile aynı şifre giremezsiniz. Lütfen tekrar deneyiniz.");
                } else {
                    System.out.println("Yeni şifreniz tanımlanmıştır.");
                }
            } else {
                System.out.println("Giriş işlemi tamamlanamamıştır. İyi günler dileriz.");
            }
        }
    }
}
