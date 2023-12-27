/** @author Erhan YILDIRIM (Patika.dev) - 27.12.2023 */
import java.util.Scanner;
public class harmonik {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Kullanıcı girişinin yapıldığı yer
        System.out.print("Bir sayı girin: ");
        int sayi = input.nextInt();

        double harmonik = 0.0;

        //Formülün yer aldığı döngü
        for (int i = 1; i <= sayi; i++) {
            harmonik += 1.0 / i;
        }

        System.out.println(sayi + " sayısının harmonik serisi: " + harmonik);
    }
}
