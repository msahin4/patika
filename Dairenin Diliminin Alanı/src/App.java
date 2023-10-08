import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Dairenin yarıçapını giriniz: ");
        Scanner scanner = new Scanner (System.in);
        int r = scanner.nextInt();
        System.out.println("Merkez açı ölçüsünü giriniz: ");
        int alpha = scanner.nextInt();

        double pi = 3.14,alan;

        alan = (pi*r*r*alpha)/360;
        System.out.println("Daire diliminin alanı = "+alan);
    }
}
