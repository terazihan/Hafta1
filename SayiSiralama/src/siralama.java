/** @author Erhan YILDIRIM (Patika.dev) - 25.12.2023 */
import java.util.Scanner;
public class siralama {
    public static void main(String[] args) {
        int a,b,c;

        //Kullanıcı girişini yazalım.
        Scanner input = new Scanner(System.in);
        System.out.print("1. Sayı: ");
        a = input.nextInt();

        System.out.print("2. Sayı: ");
        b = input.nextInt();

        System.out.print("3. Sayı: ");
        c = input.nextInt();

        //Şimdi istenen denklemi girelim.
        if ((a<b) && (a<c)) {
            if (b<c) {
                System.out.print("1<2<3");
            } else {
                System.out.print("1<3<2");
            }
        }
        else if ((b<a) && (b<c)) {
            if (a<c) {
                System.out.print("2<1<3");
            } else {
                System.out.print("2<3<1");
            }
        }
        else if ((c<a) && (c<b)) {
            if (b<a) {
                System.out.print("3<2<1");
            } else {
                System.out.print("3<1<2");
            }
        }
    }
}
