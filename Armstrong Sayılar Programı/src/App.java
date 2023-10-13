import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
      Scanner input = new Scanner(System.in);
      System.out.println("Bir sayı giriniz");
      int number = input.nextInt();
        
        int numberCopy = number;
        int basamakSayisi=0;
        while(numberCopy !=0){
            numberCopy = numberCopy/10;
            basamakSayisi++;
        }
        numberCopy=number;
        int x,sum =0;
        for (int i = 1; i <= basamakSayisi; i++) {
            x=number%10;
            int y=1;
            for (int j = 1; j <= basamakSayisi; j++) {
               y=y*x;
            }
            sum+=y;
            number=number/10;
        }
        if(numberCopy == sum)
            System.out.println(numberCopy +" = !!ARMSTRONG SAYI !!");
        else
            System.out.println(numberCopy +" = Armstrong sayı değil...");

    }
}
