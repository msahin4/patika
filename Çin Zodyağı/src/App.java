import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Doğum yılınzı giriniz.");
        Scanner scanner = new Scanner(System.in);
        int year = scanner.nextInt()%12;
        String animals [] ={"Maymun", "Horoz","Köpek","Domuz","Fare","Öküz","Kaplan","Tavşan","Ejderha","Yılan","At","Koyun"};

        System.out.println("Çin Zodyağı Burcunuz = " + animals[year]);
    }
}
