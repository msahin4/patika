import java.net.Socket;
import java.util.Scanner;

import javax.swing.text.html.HTMLDocument.HTMLReader.SpecialAction;

public class App {
    public static void main(String[] args) throws Exception {

        System.out.println("Gideceğiniz mesafeyi km cinsinden yazınız. ");
        Scanner scanner = new Scanner(System.in);
        int mesafe = scanner.nextInt();
        double tutar = 10 + (mesafe * 2.2);
        if(tutar < 20)
            tutar = 20;
        
        System.out.println("Tutar = " + tutar);


    }
}
