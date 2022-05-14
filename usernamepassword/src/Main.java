import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        String username,password;
        Scanner input = new Scanner(System.in);

        System.out.print("Kullanici Adinizi Giriniz: ");
        username = input.nextLine();


        if(username.equals("user")) {
            System.out.print("Sifrenizi Giriniz : ");
            password = input.nextLine();
            if (password.equals("1234"))
                System.out.println("Giris Yaptiniz!");

            else if (!password.equals("1234")){
                System.out.println("Sifreniz Yanlis.Yeni bir şifre giriniz!");
                System.out.print("Sifrenizi Giriniz : ");
                password = input.nextLine();

                if (password.equals("1234")) {
                    System.out.println("Sifreniz bir önceki sifre ile ayni olmamlidir.Yeni bir sifre giriniz!");
                    System.out.print("Sifrenizi Giriniz : ");
                    password = input.nextLine();
                    System.out.println("Yeni Sifreniz Basarıyla Olusturuldu!");

                }
            }
        }
        else if (!username.equals("user")) {
                System.out.println("Girilen Kullanici Adi Yanlis.Tekrar Giriniz!");
                System.out.print("Kullanici Adinizi Giriniz: ");
                username = input.nextLine();

                System.out.print("Sifrenizi Giriniz : ");
                password = input.nextLine();

                if (password.equals("1234"))
                System.out.println("Giriş Yaptiniz!");

                if (!password.equals("1234")){
                    System.out.println("Sifreniz Yanlis.Yeni bir şifre giriniz!");
                    System.out.print("Sifrenizi Giriniz : ");
                    password = input.nextLine();
                    if (password.equals("1234")) {
                        System.out.println("Sifreniz bir önceki sifre ile ayni olmamlidir.Yeni bir sifre giriniz!");
                        System.out.print("Sifrenizi Giriniz : ");
                        password = input.nextLine();
                        System.out.println("Yeni Sifreniz Basarıyla Olusturuldu!");

                    }
                }



        }
        }




    }

