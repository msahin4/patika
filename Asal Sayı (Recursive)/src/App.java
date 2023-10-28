import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        System.out.println("Bir sayı giriniz");
        int num = input.nextInt();
        int bolen = 2;

        if (isPrime(num, bolen))
            System.out.println(num + " sayisi ASALDIR.");
        else
            System.out.println(num+" sayisi ASAL DEĞİLDİR.");

    }

    // 2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71,
    // 73, 79...
    static boolean isPrime(int x, int bolen) {
        if(x==2)
            return true;
        if (x % bolen == 0)
            return false;
        if (bolen * bolen > x)
            return true;
        return isPrime(x, bolen + 1);
    }

}
