import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Kaç tane sayı gireceksiniz?");
        Scanner input = new Scanner(System.in);
        int limit = input.nextInt();
        int num,min=0,max=0;
        System.out.println("sayı giriniz");
        num = input.nextInt();
        min = num; 
        max = num;

        while (limit > 1) {
            System.out.println("sayı giriniz");
            num = input.nextInt();
            if(num < min)
                min = num;
            if(num > max)
                max = num;
            limit--;
        } 
        System.out.println("En küçük sayı = "+ min);
        System.out.println("En büyük sayı = "+max);

    
    
    }



}
