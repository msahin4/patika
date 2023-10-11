import java.util.Scanner;
public class App {
    public static void main(String[] args) {
        System.out.println("Bir yıl giriniz.");
        Scanner scanner = new Scanner(System.in);
        int year = scanner.nextInt();
        if (year %100 == 0){
            if (year %400==0){
                System.out.println(year + " ARTIK YIL'dır");
            }
            else
                System.out.println(year + " ARTIK YIL DEĞİLDİR");
        }
        else{
            if(year%4==0)
                System.out.println(year + " ARTIK YIL'dır");
            else
                System.out.println(year + " ARTIK YIL DEĞİLDİR");

        }

    }
}