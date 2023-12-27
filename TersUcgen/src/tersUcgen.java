/** @author Erhan YILDIRIM (Patika.dev) - 27.12.2023 */
import java.util.Scanner;
public class tersUcgen {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Kullanıcı girişi yapıyoruz.
        System.out.print("Basamak Sayısı: ");
        int basamak = input.nextInt();

        //Formülü döngüya sokuyoruz.
        for (int i = 0; i < basamak; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < 2 * (basamak - i) - 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
