import java.util.Scanner;

import javax.swing.text.html.HTMLDocument.HTMLReader.SpecialAction;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Basamak sayısını giriniz");
        Scanner input = new Scanner(System.in);
        int basamak = input.nextInt();

        for (int i = basamak; i > 0; i--) {
            for (int k = 0; k < (basamak - i); k++) {
                System.out.print("   ");
            }
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print(" * ");
            }

            System.out.println();
        }

    }
}
