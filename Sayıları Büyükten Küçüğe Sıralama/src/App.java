import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Birinci sayıyı giriniz");
        int first = scanner.nextInt();
        System.out.println("İkinci sayıyı giriniz");
        int second = scanner.nextInt();
        System.out.println("Üçüncü sayıyı giriniz");
        int third = scanner.nextInt();
    
        if(first > second && first > third){
            if(second>third)
                System.out.println(first + " "+ second + " "+third);
            else
                System.out.println(first + " "+ third + " "+ second);                
        }

        else if (second > third){
            if(third > first)
                System.out.println(second + " " + third + " "+ first);
            else
                System.out.println(second + " " + first + " "+ third);

        }
        else if (third>second)
            if(first>second)
                System.out.println(third + " "+ first + " "+ second);

            else
                System.out.println(third + " "+ second + " "+ first);    
    
    }
}
