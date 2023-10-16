import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Bir sayı giriniz");
        Scanner input = new Scanner(System.in);
        int num=input.nextInt();
        
        for (int i = 1; i <= num; i++) {
                for (int j = i; j < num; j++) {
                    System.out.print("   ");
                }
                for (int j = 1; j <= (2*i - 1) ; j++) {
                    System.out.print(" * ");
                }
                System.out.println();
        }
        for (int i = num-1;  i>= 1; i--) {
            for (int j = num; j > i ; j--) {
                System.out.print("   ");
            }

            for (int j = 1; j < 2*i; j++) {
                System.out.print(" * ");
            }
            System.out.println();
        }

    }
}
