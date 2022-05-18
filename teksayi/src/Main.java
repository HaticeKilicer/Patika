 import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        System.out.print("Bir sayi girin : ");
        Scanner scn = new Scanner(System.in);
        int i, numb = 0;

        while (true) {
            i = scn.nextInt();
            if (i % 4 == 0 && i % 2 == 0) {
                numb += i;
            } else {
                System.out.println("Girdiginiz sayı tek veya 2 ve 4'e bolunemeyen bir sayi!");
                i = scn.nextInt();
                break;
            }
        }
        System.out.println("Girilen Sayilar Toplami " + numb);
    }
}