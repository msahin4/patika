import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Bir sayı giriniz");
        Scanner input = new Scanner(System.in);
        int num = input.nextInt(), sum = 0;

        for (int i = 1; i < num; i++) {
            if (num % i == 0) {
                sum += i;
            }
        }
        if (num == sum)
            System.out.println(num + " Mükemmel sayıdır.");

        else
            System.out.println(num + " Mükemmel sayı değildir.");
    }

}
