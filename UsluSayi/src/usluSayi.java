/** @author Erhan YILDIRIM (Patika.dev) - 27.12.2023 */
import java.util.Scanner;
public class usluSayi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Taban sayısını girin: ");
        int taban = input.nextInt();

        System.out.print("Üs sayısını girin: ");
        int us = input.nextInt();

        int sonuc = 1;

        //İşlemin yapıldığı döngü
        for (int i = 1; i <= us; i++) {
            sonuc *= taban;
        }

        System.out.println("Sonuç: " + taban + "^" + us + " = " + sonuc);
    }
}
