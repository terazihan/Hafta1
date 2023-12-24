import java.util.Scanner;

public class cinZodyak {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int dogumYili,kalan;
        String burc;

        System.out.print("Doğum Yılınızı Giriniz: ");
        dogumYili = input.nextInt();

        input.close();

        // Çin Zodyağı hesaplama
        String[] zodyak = {"Maymun", "Horoz", "Köpek", "Domuz", "Fare", "Öküz", "Kaplan", "Tavşan", "Ejderha", "Yılan", "At", "Koyun"};
        kalan = dogumYili % 12;
        burc = zodyak[kalan];

        System.out.println("Çin Zodyağı Burcunuz: " + burc);
    }
}
