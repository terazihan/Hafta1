/** @author Erhan YILDIRIM (Patika.dev) - 27.12.2023 */
import java.util.Scanner;
public class faktoriyel {
    public static void main(String[] args) { //Kullanıcı girişi yapıyoruz.
        Scanner input = new Scanner(System.in);

        System.out.print("n sayısını girin: ");
        int n = input.nextInt();

        System.out.print("r sayısını girin: ");
        int r = input.nextInt();

        int kombinasyon = faktoriyel(n) / (faktoriyel(r) * faktoriyel(n - r));

        System.out.println("Faktöriyel = " + kombinasyon);
    }

    // Faktöriyel hesaplama metodu
    public static int faktoriyel(int sayi) {
        int faktoriyel = 1;
        for (int i = 1; i <= sayi; i++) {
            faktoriyel *= i;
        }
        return faktoriyel;
    }
}
