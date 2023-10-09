import java.net.Socket;
import java.util.Scanner;

import javax.imageio.ImageIO;
import javax.sound.midi.Soundbank;


public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner (System.in);
        System.out.println("ilk sayıyı giriniz...");
        int first = scanner.nextInt();
        System.out.println("ikinci sayıyı giriniz");
        int second = scanner.nextInt();

        System.out.println("1-Toplama \n2-Çıkartma \n3-Çarpma \n4-Bölme" );
        System.out.println("Yapmak istediğiniz işlemi seçiniz..");
        int select = scanner.nextInt();

        switch(select){
            case 1:
                System.out.println("Toplam = "+(first+second));
                break;
            case 2:
                System.out.println("Fark = "+(first-second));
                break;
            case 3:
                System.out.println("Çarpım = "+(first*second));
                break;
            case 4:
                if(second == 0)
                    System.out.println("Sayı sıfıra bölünemez.");
                else {
                    System.out.println("Bölüm = "+(double) first/second);
                }
            default:
                System.out.println("hatalı bir seçim yaptınız...");

        }
        
    }
}
