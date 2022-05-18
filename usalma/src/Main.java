import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            int sayi, us, total = 1;
            System.out.print("Ussu alinacak sayiyi giriniz: ");
            sayi = input.nextInt();
            System.out.print("Ussu giriniz: ");
            us = input.nextInt();
            for (int i = 1; i <= us; i++) {
                total *= sayi;
            }
            System.out.println("Sonuc : " + total);
        }
    }