import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Fibonacci eleman sayısını giriniz");
        Scanner input = new Scanner(System.in);
        int num = input.nextInt(),sum=2;
        System.out.print("Fibonacci Serisinin ilk "+ num +" elemanı = 0, 1, 1");
        int pre=1;
        while(num>3){
            sum +=pre;
            pre=sum-pre;
            System.out.print(", "+sum);
            num--;
        }
    // 0 1 1 2 3 5 8 13 21 34...    
    
    }
}
