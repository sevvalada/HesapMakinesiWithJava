import java.util.Scanner;

public class Main {

    static int sum(int a, int b) {
        int result = a + b;
        System.out.println("Toplam : " + result);
        return result;
    }

    static int minus(int a, int b) {
        int result = a - b;
        System.out.println("Çıkarma : " + result);
        return result;
    }

    static int multi(int a, int b) {
        int result = a * b;
        System.out.println("Çarpma : " + result);
        return result;
    }

    static int divide(int a, int b) {
        if (b == 0) {
            System.out.println("Hata: Sıfıra bölme");
            return 0;
        }
        int result = a / b;
        System.out.println("Bölme : " + result);
        return result;
    }

    static int power(int a, int b) {
        int result = 1;
        for (int i = 1; i <= b; i++) {
            result *= a;
        }
        System.out.println("Üs : " + result);
        return result;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int secim;
        String menu = "1- Toplama İşlemi\n"
                + "2- Çıkarma İşlemi\n"
                + "3- Çarpma İşlemi\n"
                + "4- Bölme İşlemi\n"
                + "5- Üslü Sayı Hesaplama\n"
                + "0- Çıkış Yap";

        while (true) {
            System.out.println("\n" + menu);
            System.out.print("Bir seçim yapınız: ");
            secim = input.nextInt();

            if (secim == 0) {
                System.out.println("Güle Güle!");
                break;
            }

            System.out.print("İlk sayıyı giriniz: ");
            int a = input.nextInt();
            System.out.print("İkinci sayıyı giriniz: ");
            int b = input.nextInt();

            switch (secim) {
                case 1 -> sum(a, b);
                case 2 -> minus(a, b);
                case 3 -> multi(a, b);
                case 4 -> divide(a, b);
                case 5 -> power(a, b);
                default -> System.out.println("Geçersiz seçim, tekrar deneyiniz.");
            }
        }


    }
}
