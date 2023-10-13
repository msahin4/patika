import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Bir sayı giriniz");
        Scanner input = new Scanner(System.in);
        int num = input.nextInt(),sum=0;
        while (num!=0){
            sum += num%10;
            num=num/10;
        }
        System.out.println(sum);
    }
}