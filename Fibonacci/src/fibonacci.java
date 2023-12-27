/** @author Erhan YILDIRIM (Patika.dev) - 27.12.2023 */
import java.util.Scanner;
public class fibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Fibonacci serisinin eleman sayısını giriniz: ");
        int count = scanner.nextInt();
        scanner.close();

        int first = 0, second = 1;
        System.out.print("Fibonacci serisi: " + first + " " + second);

        for (int i = 2; i < count; ++i) {
            int next = first + second;
            System.out.print(" " + next);
            first = second;
            second = next;
        }
    }
}
