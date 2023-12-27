/** @author Erhan YILDIRIM (Patika.dev) - 27.12.2023 */
import java.util.Scanner;
public class minMax {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Kullanıcı girişi yapılıyor.
        System.out.print("Kaç tane sayı gireceksiniz: ");
        int n = input.nextInt();

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for (int i = 1; i <= n; i++) {
            System.out.print(i + ". Sayıyı giriniz: ");
            int num = input.nextInt();

            //Formülü döngüde kuruyoruz.
            if (num > max) {
                max = num;
            }

            if (num < min) {
                min = num;
            }
        }

        //Sonucu yazdıralım.
        System.out.println("En büyük sayı: " + max);
        System.out.println("En küçük sayı: " + min);
    }
}
