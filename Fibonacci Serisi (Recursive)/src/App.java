import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Bir sayi giriniz");
        Scanner input = new Scanner (System.in);
        int num = input.nextInt();
        
        
        //0 1 1 2 3 5 8 13 21 34
        /*
            f(1)=0
            f(2)=1
            f(3) = f(2) + f(1)
            f(4) = f(3) + f(2)
            ...
            f(n) = f(n-1) + f(n-2)
        */    
        
        System.out.println(fib(num));;

    }
     
    static int fib (int n){
        
        if(n<=0)
            return 0;
        else if (n==1)
            return 0;
        else if (n==2)
            return 1;
        
        int result = fib(n-1) + fib(n-2);

        return result;
    }


}
