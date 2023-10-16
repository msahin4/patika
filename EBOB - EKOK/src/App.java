import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        System.out.println("ilk sayıyı giriniz");
        int a = input.nextInt();
        System.out.println("ikinci sayıyı giriniz");
        int b = input.nextInt();

        int ebob = 1;
        for (int i = 2; i <= a && i <= b; i++) {
            if (a % i == 0 && b % i == 0) {
                ebob = i;
            }
        }
        System.out.println("ebob = " + ebob);
        System.out.println("ekok = " + (a * b) / ebob);

        for (int i = 1; i <= a * b; i++) {
            if (i % a == 0 && i % b == 0) {
                System.out.println("ekok 2 = " + i);
                break;
            }
        }
    }
}
