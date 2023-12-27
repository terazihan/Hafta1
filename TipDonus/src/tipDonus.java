/** @author Erhan YILDIRIM (Patika.dev) - 27.12.2023 */
import java.util.Scanner;
public class tipDonus {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Kullanıcıdan bir tam sayı girişi al
        System.out.print("Lütfen bir tam sayı giriniz: ");
        int integerInput = scanner.nextInt();

        // Kullanıcıdan bir ondalıklı sayı girişi al
        System.out.print("Lütfen bir ondalıklı sayı giriniz: ");
        double doubleInput = scanner.nextDouble();

        // Tam sayıyı double'a dönüştür ve ekrana yazdır
        double convertedInteger = (double) integerInput;
        System.out.println("Tam sayıyı ondalıklı sayıya dönüştürdüğümüzde: " + convertedInteger);

        // Ondalıklı sayıyı tam sayıya dönüştür ve ekrana yazdır
        int convertedDouble = (int) doubleInput;
        System.out.println("Ondalıklı sayıyı tam sayıya dönüştürdüğümüzde: " + convertedDouble);

        scanner.close();
    }
}
