import java.util.Scanner;



public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner (System.in);
        System.out.println("Sayıyı giriniz");
        int number = input.nextInt();
        System.out.println("Üssünü giriniz");
        int result=1,power = input.nextInt();

        

        for (int i = 1; i <= power; i++) {
            result = result*number;
        }
        System.out.println(number+" üzeri "+power+" = "+result);
    }
}
