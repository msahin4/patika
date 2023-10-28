public class App {
    public static void main(String[] args) throws Exception {
        System.out.println(pow(4, 0));
    }


    static int pow (int a, int b) {
        if(b==0){
            return 1;
        }
        return pow(a, b-1)*a;
    }
}
