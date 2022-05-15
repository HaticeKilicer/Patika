import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int yil;

        Scanner input = new Scanner(System.in);

        System.out.print("Yil Giriniz: ");
        yil = input.nextInt();

        if(yil%400==0)
            System.out.println(yil+" artik bir yildir!'");
        else if(yil%4==0)
            System.out.println(yil+" artik bir yildir!");

    }
}