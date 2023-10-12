import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Bir sayı giriniz...");
        Scanner input = new Scanner(System.in);
        int limit = input.nextInt();
        int counter=0, sum=0;
        for (int i = 1; i <= limit; i++) {
            if(i%3==0 && i%4==0){
                System.out.println(i);
                sum += i;
                counter++;
            }
        }
        System.out.println("0'dan girilen sayıya kadar olan sayılardan 3 ve 4'e tam bölünen sayıların ortalaması = "+sum/counter);
        System.out.println("counter = " + counter + "\nsum = "+sum);
    }
}
