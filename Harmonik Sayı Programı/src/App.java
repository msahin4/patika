import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Bir sayı giriniz");
        Scanner input = new Scanner (System.in);
        int num=input.nextInt();
        double sum=0;
        for (int i = 1; i <= num ; i++) {
            sum += (1.0/i);
        }
        System.out.println(sum);

    }
    
}
