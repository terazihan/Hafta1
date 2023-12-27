/** @author Erhan YILDIRIM (Patika.dev) - 27.12.2023 */
import java.util.Scanner;
public class obebOkek {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("İlk sayıyı girin: ");
        int num1 = input.nextInt();

        System.out.print("İkinci sayıyı girin: ");
        int num2 = input.nextInt();

        int ebob = findEBOB(num1, num2);
        int ekok = findEKOK(num1, num2);

        System.out.println("EBOB: " + ebob);
        System.out.println("EKOK: " + ekok);
    }

    // EBOB bulan fonksiyon
    public static int findEBOB(int a, int b) {
        while (a != b) {
            if (a > b) {
                a -= b;
            } else {
                b -= a;
            }
        }
        return a;
    }

    // EKOK bulan fonksiyon
    public static int findEKOK(int a, int b) {
        return (a * b) / findEBOB(a, b);
    }
}
