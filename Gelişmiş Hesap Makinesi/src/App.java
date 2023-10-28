import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        int a=0, b=0, x;
        do {
            System.out.println("1 - Toplama\n"
                    + "2 - Çıkartma\n"
                    + "3 - Çarpma\n"
                    + "4 - Bölme\n"
                    + "5 - Üslü Sayı Hesaplama\n"
                    + "6 - Faktöriyel Hesaplama\n"
                    + "7 - Mod Alma\n"
                    + "8 - Dikdörtgen Alan ve Çevre Hesaplama\n"
                    + "9 - Çıkış\n\n"
                    + "Yapmak istediğiniz işlemi seçiniz = ");
            int choice = input.nextInt();
            if(choice==9)
                break;
            if (choice < 1 || choice > 8) {
                System.out.println("Hatalı bir işlem kodu girdiniz");
                Thread.sleep(2000);
            }

            else if (choice == 6) {
                System.out.println("Sayi giriniz... ");
                a = input.nextInt();
            } else {
                System.out.println("1. Sayiyi giriniz... ");
                a = input.nextInt();
                System.out.println("2. Sayiyi giriniz... ");
                b = input.nextInt(); 
            }

            switch (choice) {
                case 1:
                    System.out.println(sum(a, b));
                    break;
                case 2:
                    System.out.println(minus(a, b));
                    break;
                case 3:
                    System.out.println(times(a, b));
                    break;
                case 4:
                    System.out.println(divided(a, b));
                    break;
                case 5:
                    System.out.println(power(a, b));
                    break;
                case 6:
                    System.out.println(factorial(a));
                    break;
                case 7:
                    System.out.println(mod(a, b));
                    break;
                case 8:
                    System.out.println(dikdortgen(a, b));
                    break;
            }
        } while (true);
    }

    static int sum(int a, int b) {
        return a + b;
    }

    static int minus(int a, int b) {
        return a - b;
    }

    static int times(int a, int b) {
        return a * b;
    }

    static double divided(int a, int b) {
        if (b == 0) {
            System.out.println("Sıfıra bölme hatası");
            return 0;
        }
        return ((double) a / b);
    }

    static int power(int a, int b) {
        return (int) Math.pow(a, b);
    }

    static int factorial(int a) {
        int result = 1;
        for (int i = 1; i <= a; i++) {
            result *= i;
        }
        return result;
    }

    static int mod(int a, int b) {
        return a % b;
    }

    static String dikdortgen(int a, int b) {
        return "Alan = " + (a * b) + "\nÇevre = " + 2 * (a + b);
    }
}
