/** @author Erhan YILDIRIM (Patika.dev) - 27.12.2023 */
import java.util.Scanner;
public class elmas {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Kullanıcı girişi sağlanıyor.
        System.out.print("Elmasın yüksekliğini girin (tek sayı olmalı): ");
        int yukseklik = input.nextInt();

        // Üst kısmı çiziyoruz
        for (int i = 1; i <= yukseklik; i += 2) {
            for (int j = 0; j < (yukseklik - i) / 2; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // Alt kısmı çiziyoruz
        for (int i = yukseklik - 2; i >= 1; i -= 2) {
            for (int j = 0; j < (yukseklik - i) / 2; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
