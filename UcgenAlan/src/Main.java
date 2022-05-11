import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        int a,b,c;
        Scanner input = new Scanner(System.in);
        System.out.print("1.Kenari Giriniz:");
        a =input.nextInt();
        System.out.print("2.Kenari Giriniz:");
        b =input.nextInt();
        System.out.print("3.Kenari Giriniz:");
        c =input.nextInt();

        int u = a+b+c;
        double alan =  u*(u-a)*(u-b)*(u-c);
        System.out.println("Ucgenin Alani: "+ u);

    }
}
