public class App {
    public static void main(String[] args) throws Exception {
        int x = 1101011;

        System.out.println(isPalindrome(x));

    }

    static boolean isPalindrome(int x) {
        int basamak = basamakSayisi(x);
        int rightNumbers = x%((int)Math.pow(10, basamak/2));

        int leftNumbers;
        if (basamak%2==0){
            leftNumbers = x/((int)Math.pow(10,basamak/2));
        }
        else{
            leftNumbers=x/((int)Math.pow(10, (basamak/2)+1));
        }
        leftNumbers = mirror(leftNumbers);

        if(leftNumbers == rightNumbers)
            return true;
        else
            return false;


    }




    static int basamakSayisi(int x){
        int sayac=0;
        while (x != 0){
            x/=10;
            sayac++;
        }
        return sayac;
    }

    static int mirror (int x){
        // x = 312   213
        int basamak = basamakSayisi(x);
        int sum = 0;
        for (int i = basamak-1; i >= 0 ; i--) {
            sum += (x % 10) * ((int)Math.pow(10, i));
            x=x/10;
        }
        return sum;

    }
}
