import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        int sum=0;
        while(true){

        System.out.println("Bir sayı giriniz");
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        if(number%2!=0)
            break;
        
        else if(number%4==0)
            sum+=number;
        }

        System.out.println(sum);
    }
}
