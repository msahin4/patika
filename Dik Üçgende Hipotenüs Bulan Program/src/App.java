import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        int a,b,c,u;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Birinci kenarı giriniz");
        a=scanner.nextInt();
        System.out.println("İkinci kenarı giriniz");
        b=scanner.nextInt();
        System.out.println("Üçüncü kenarı giriniz");
        c=scanner.nextInt();

        Double alan;
        u=(a+b+c)/2;
        
        alan= Math.sqrt(u * (u-a) * (u-b) * (u-c));
        
        System.out.println("Üçgenin alanı = " + alan);



    }
}
