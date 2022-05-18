import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int numb,cnt=0;
        double average = 0;
        Scanner scn = new Scanner(System.in);
        System.out.println("Bir Sayi Giriniz");
        numb = scn.nextInt();

        for (int i=0;i<=numb;i++) {
            if (i%3 == 0 && i % 4 == 0) {
                average += i;
                cnt++;
            }
        }
        double av = average / cnt ;
        System.out.println("3e've 4'e bölünen sayıların ortalamasi "+av);
    }
}