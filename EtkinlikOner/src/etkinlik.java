/** @author Erhan YILDIRIM (Patika.dev) - 25.12.2023 */
import java.util.Scanner;
public class etkinlik {
    public static void main(String[] args) {
        int heat;

        //Kullanıcı girişi sağlanıyor.
        Scanner input = new Scanner(System.in);
        System.out.print("Sıcaklık değerini giriniz: ");
        heat = input.nextInt();

        //Ödevde istenen denklemi kuruyoruz.
        if (heat < 5) {
            System.out.print("Kayak yapabilirsiniz.");
        } else if (heat >= 5 && heat <= 15) {
            System.out.print("Sinemaya gidebilirsiniz.");
        } else if (heat > 15 && heat <= 25) {
            System.out.print("Piknik yapmaya gidebilirsiniz.");
        } else {
            System.out.print("Yüzmeye gidebilirsiniz.");
        }
    }
}
