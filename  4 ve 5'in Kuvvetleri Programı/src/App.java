import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Bir sayı giriniz.");
        Scanner input = new Scanner(System.in);
        int limit = input.nextInt();
        int counter = 0;
        System.out.println("Girilen sayıya kadar 4'ün kuvvetleri");
        while (Math.pow(4, counter) < limit) {
            System.out.println((int) Math.pow(4, counter));
            counter++;
        }
        counter = 0;
        System.out.println("Girilen sayıya kadar 5'in kuvvetleri");
        while (Math.pow(5, counter) < limit) {
            System.out.println((int) Math.pow(5, counter));
            counter++;
        }
    }
}
