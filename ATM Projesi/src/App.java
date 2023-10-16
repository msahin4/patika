import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        String userName, password;
        String dbUserNAme = "sarlo", dbPassword = "123";
        int dbBalance = 39750;
        Scanner input = new Scanner(System.in);
        int sayac = 3, choice;
        while (true) {

            System.out.println("Kullanıcı adı giriniz");
            userName = input.nextLine();
            System.out.println("Şifre giriniz");
            password = input.nextLine();
            if (!userName.equals(dbUserNAme) || !password.equals(dbPassword)) {
                System.out.println("Kullanıcı adı veya şifre hatalı");
                sayac--;
                if (sayac == 0)
                    break;
                System.out.println("Kalan deneme hakkınız: " + sayac);

            } else {
                System.out.println("Oturum açıldı...\nKodluyoruz Bankası'na Hoşgeldiniz...");
                do {
                    System.out.println(
                            "\nLütfen yapmak istediğiniz işlemi seçiniz\n1 - Para yatırma \n2-Para çekme \n3-Bakiye sorgulama \n4-Çıkış yap");
                    choice = input.nextInt();
                    if (choice == 1) {
                        System.out
                                .println("Mevcut bakiyeniz = " + dbBalance + "\nYatırmak istediğiniz miktarı giriniz");
                        int add = input.nextInt();
                        dbBalance += add;
                        System.out.println("Yatırma işlemi başarılı.\nGüncel bakiye = " + dbBalance);
                    }
                    if (choice == 2) {
                        System.out.println("Mevcut bakiyeniz = " + dbBalance + "\nÇekmek istediğiniz miktarı giriniz");
                        int amount = input.nextInt();
                        if(dbBalance >= amount){
                            dbBalance-=amount;
                            System.out.println("Para çekme işlemi başarılı.\nGüncel bakiye = "+dbBalance);
                        }
                        else
                            System.out.println("Yetersiz bakiye");
                    }
                    if (choice == 3) {
                        System.out.println("Güncel bakiye = "+dbBalance);

                    }
                    
                } while (choice != 4);
                System.out.println("Tekrar görüşmek üzere...");
                break;

            }
        }
    }
}
