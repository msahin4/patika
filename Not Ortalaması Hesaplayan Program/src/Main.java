import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
    int math, pyhsics, chemistry, turkish, history, music;
    Scanner inp = new Scanner(System.in);

    System.out.println("Enter your math grade");
    math = inp.nextInt();

    System.out.println("Enter your pyhsics grade");
    pyhsics = inp.nextInt();

    System.out.println("Enter your chemistry grade");
    chemistry = inp.nextInt();

    System.out.println("Enter your turkish grade");
    turkish = inp.nextInt();

    System.out.println("Enter your history grade");
    history = inp.nextInt();

    System.out.println("Enter your music grade");
    music = inp.nextInt();

    double average = ((math+pyhsics+chemistry+turkish+history+music)/6);
    System.out.println("Your average = "+ average); 
    
    String conclusion = average >= 60 ? "You passed the class !!" : "Unfortunately, you failed the class...";
    System.out.println(conclusion);
    

    }
}