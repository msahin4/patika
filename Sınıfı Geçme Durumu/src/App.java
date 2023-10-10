import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        int math, pyhsics, chemistry, turkish, history, music;
        Scanner inp = new Scanner(System.in);
        int ders=5;
        System.out.println("Enter your math grade");
        math = inp.nextInt();
        if (math < 0 && math > 100)
            math = 0;

        System.out.println("Enter your pyhsics grade");
        pyhsics = inp.nextInt();
        if (pyhsics < 0 && math > 100)
            pyhsics = 0;

        System.out.println("Enter your chemistry grade");
        chemistry = inp.nextInt();
        if (chemistry < 0 && math > 100)
            chemistry = 0;

        System.out.println("Enter your turkish grade");
        turkish = inp.nextInt();
        if (turkish < 0 && math > 100)
            turkish = 0;

        System.out.println("Enter your history grade");
        history = inp.nextInt();
        if (history < 0 && math > 100)
            history = 0;

        System.out.println("Enter your music grade");
        music = inp.nextInt();
        if (music < 0 && math > 100)
            music = 0;

        double average = ((math + pyhsics + chemistry + turkish + history + music) / 6);
        System.out.println("Your average = " + average);

        String conclusion = average >= 60 ? "You passed the class !!" : "Unfortunately, you failed the class...";
        System.out.println(conclusion);

    }
}
