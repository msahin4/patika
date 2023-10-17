import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Bir sayı giriniz");
        Scanner input = new Scanner(System.in);
        int limit = input.nextInt();

        for (int i = 2; i <= limit; i++) {
            int sayac=0;
            for (int j = 2; j < i; j++) {
                if(i%j==0)
                    sayac+=1;
            }
            if(sayac==0)
                System.out.println(i);
        }
    }
}
