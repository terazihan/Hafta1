/** @author Erhan YILDIRIM (Patika.dev) - 22.12.2023 */

import java.util.Scanner;
public class aritmetikislem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Lütfen ilk sayıyı girin (a): ");
        int a = scanner.nextInt();

        System.out.print("Lütfen ikinci sayıyı girin (b): ");
        int b = scanner.nextInt();

        System.out.print("Lütfen üçüncü sayıyı girin (c): ");
        int c = scanner.nextInt();

        int sonuc = a + b * c - b; // İşlem sırasına göre işlemi gerçekleştirme

        System.out.println("İşlem sonucu: " + sonuc); // Sonucu ekrana yazdırma
    }
}
