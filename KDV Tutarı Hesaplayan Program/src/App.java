import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        System.out.println("KDV'siz fiyatı girin");
        Scanner asd = new Scanner(System.in);
        double girdi = asd.nextDouble();
        if (girdi<1000)
            System.out.println("KDV'siz fiyat = "+girdi + "\nKDV'li fiyat = "+girdi*(1.18) + "\nKDV Tutarı = "+girdi*(0.18) );
        else
            System.out.println("KDV'siz fiyat = "+girdi + "\nKDV'li fiyat = "+girdi*(1.08) + "\nKDV Tutarı = "+girdi*(0.08) );
    }
}
