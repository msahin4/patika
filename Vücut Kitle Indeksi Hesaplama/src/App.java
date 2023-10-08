import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Lütfen boyunuzu (metre cinsinde) giriniz: ");
        Scanner scanner = new Scanner(System.in);
        Double boy=scanner.nextDouble();
        System.out.println("Lütfen kilonuzu giriniz: ");
        int kilo = scanner.nextInt();
        System.out.println("Vücut kitle indeksiniz: "+kilo/(boy*boy));

        
    }
}
