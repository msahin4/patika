import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("C(n,r) \nKombinasyonun n değerini giriniz.");
        Scanner input = new Scanner(System.in);
        int n2=1,n = input.nextInt();
        System.out.println("C(n,r) \nKombinasyonun r değerini giriniz.");
        int r2=1,r = input.nextInt();

        int combination=0,x=1;
        for (int i = 1; i <= n; i++) {
            n2 = n2 *i;
        }
        System.out.println(n2);
        for (int i = 1; i <= r; i++) {
            r2 = r2*i;
        }
        System.out.println(r2);
        for (int i = 1; i <= (n-r); i++) {
            x = x*(i);
        }

        combination= n2/(r2*x);
        System.out.println("C("+n+"/"+r+") = "+combination);
    }
}
