import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Gideceğiniz mesafeyi km cinsinden giriniz.");
        int mesafe = scanner.nextInt();
        if(mesafe<0){
            System.out.println("Hatali bir değer girdiniz."); 
            return;}
        System.out.println("Yasinizi girin");
        int yas = scanner.nextInt();
        if(yas<0 || yas>100){
            System.out.println("Hatali bir değer girdiniz."); 
            return;}
        System.out.println("Yolculuk tipini giriniz (1 => Tek Yön , 2 => Gidiş Dönüş ): 2");
        int travel = scanner.nextInt();
        if(travel != 1 && travel!=2){
            System.out.println("Hatali bir değer girdiniz.");
            return;

        }

        double price = (0.1) * mesafe;
        if(yas < 12)
            price = price /2;
        else if (yas >=12 && yas <25)
            price = price * (0.9);
        else if (yas > 65)
            price = price * (0.7);

        if (travel == 2){
            System.out.println("+%20 Gidiş dönüş indirimi ");
            price = (price * (0.8))*2;
            System.out.println("Toplam Tutar : " + price);
        }
        else 
            System.out.println("Toplam Tutar : " + price);
    }
}
