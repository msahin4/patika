import java.net.Socket;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Kaçıncı ayda doğdunuz? ");
        int month = scanner.nextInt();
        System.out.println("Ayın kaçında doğdunuz? ");
        int day = scanner.nextInt();
        boolean isError = false;

        if (month == 1) {
            if (day >0 && day < 22)
                System.out.println("Burcunuz : OĞLAK");
            else if (day>22 &&day <= 31)
                System.out.println("Burcunuz : KOVA");
            else 
                isError = true;
        }
        else if (month == 2) {
            if (day >0 && day < 20)
                System.out.println("Burcunuz : KOVA");
            else if (day> 20 &&day <= 29)
                System.out.println("Burcunuz : BALIK");
            else 
                isError = true;
        }
        else if (month == 3) {
            if (day >0 && day < 21)
                System.out.println("Burcunuz : BALIK");
            else if (day> 20 &&day <= 31)
                System.out.println("Burcunuz : KOÇ");
            else 
                isError = true;
        }
        else if (month == 4) {
            if (day > 0 &&day < 21)
                System.out.println("Burcunuz : KOÇ");
            else if (day> 21 && day <= 30)
                System.out.println("Burcunuz : BOĞA");
            else 
                isError = true;
        }
        else if (month == 5) {
            if (day >0 && day < 22)
                System.out.println("Burcunuz : BOĞA");
            else if (day> 22 && day <= 31)
                System.out.println("Burcunuz : İKİZLER");
            else 
                isError = true;
        }
        else if (month == 6) {
            if (day >0 && day < 23)
                System.out.println("Burcunuz : İKİZLER");
            else if (day> 23 && day <= 30)
                System.out.println("Burcunuz : YENGEÇ");
            else 
                isError = true;
        }
        else if (month == 7) {
            if (day >0 && day < 23)
                System.out.println("Burcunuz : YENGEÇ");
            else if (day> 20 && day <= 31)
                System.out.println("Burcunuz : ASLAN");
            else 
                isError = true;
        }
        else if (month == 8) {
            if (day >0 && day < 23)
                System.out.println("Burcunuz : ASLAN");
            else if (day> 23 && day <= 31)
                System.out.println("Burcunuz : BAŞAK");
            else 
                isError = true;
        }
        else if (month == 9) {
            if (day >0 && day < 23)
                System.out.println("Burcunuz : BAŞAK");
            else if (day> 23 && day <= 30)
                System.out.println("Burcunuz : TERAZİ");
            else 
                isError = true;
        }
        else if (month == 10) {
            if (day >0 && day < 23)
                System.out.println("Burcunuz : TERAZİ");
            else if (day> 23 && day <= 31)
                System.out.println("Burcunuz : AKREP");
            else 
                isError = true;
        }
        else if (month == 11) {
            if (day >0 && day < 22)
                System.out.println("Burcunuz : AKREP");
            else if (day> 22 && day <= 30)
                System.out.println("Burcunuz : YAY");
            else 
                isError = true;
        }
        else if (month == 12) {
            if (day >0 && day < 22)
                System.out.println("Burcunuz : YAY");
            else  if (day> 22 && day <= 31)
                System.out.println("Burcunuz : OĞLAK");
            else 
                isError = true;
        }
        else 
            isError =true;

        
        if(isError == true)
            System.out.println("hatalı bir tarih girdiniz");    
    }
    
}
