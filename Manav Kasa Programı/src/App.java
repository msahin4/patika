import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int armut, elma, domates, muz, patlican; 
        Double toplam;
        System.out.println("Armut kaç kilo? " );
        armut = scanner.nextInt();
        System.out.println("Elma  kaç kilo? " );
        elma = scanner.nextInt();
        System.out.println("Domates  kaç kilo? " );
        domates = scanner.nextInt();
        System.out.println("Muz kaç kilo? " );
        muz = scanner.nextInt();
        System.out.println("Patlıcan  kaç kilo? " );
        patlican = scanner.nextInt();
        toplam=armut*2.14 + elma*3.67+domates*1.11+muz*0.95+patlican*5;
        System.out.println("Toplan Tutar: "+toplam);
    }
}
