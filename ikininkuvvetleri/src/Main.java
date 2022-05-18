import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        System.out.println("Sayý Giriniz");
        int numb = scan.nextInt();

        System.out.println("4'ün katlari");
        for (int i=1;i<=numb;i*=4)
            System.out.println(i);

        System.out.println("5'in katlari");

        for (int j=1;j<=numb;j*=5)
            System.out.println(j);
    }

}