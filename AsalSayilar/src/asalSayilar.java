public class asalSayilar {
    public static void main(String[] args) {
        int i, j;
        boolean isPrime;

        System.out.println("1-100 arasındaki asal sayılar:");

        for (i = 2; i <= 100; i++) {
            isPrime = true;

            for (j = 2; j < i; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                System.out.print(i + " ");
            }
        }
    }
}
