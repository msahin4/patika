import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        String dbUserName = "patika", dbPassword = "java123";

        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Kullanıcı adını giriniz");
            String userName = scanner.nextLine();
            System.out.println("Şifrenizi giriniz:");
            String password = scanner.nextLine();

            if (userName.equals(dbUserName)) {
                if (password.equals(dbPassword)) {
                    System.out.println("Giriş yapıldı...");
                    break;
                } else {
                    System.out.println("Şifre hatalı.");
                    System.out.println("Şifrenizi sıfırlamak istiyor musunuz? (y/n)");
                    char answer = scanner.next().charAt(0);
                    switch (answer) {
                        case 'y':
                            while (true) {
                                System.out.println("Yeni şifre giriniz.");

                                String newPassword = scanner.next();
                                
                                System.out.println("Yeni şifre = " + newPassword);
                                if (newPassword.equals(dbPassword)) {
                                    System.out.println("Yeni şifreniz eski şifreniz ile aynı olamaz.");
                                } else {
                                    dbPassword = newPassword;
                                    System.out.println("Şifreniz başarıyla değiştirildi.");
                                    break;
                                }
                            }
                            break;
                        case 'n':
                            System.out.println("Şifrenizi sıfırlamayı reddettiniz. ");
                            break;
                    }
                }
            } else {
                System.out.println('"' + userName + '"' + " isminde kayıtlı bir kullanıcı yok. Lütfen kayıt olun.");
            }
        }
    }

}
