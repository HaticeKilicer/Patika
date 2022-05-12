import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        double r,a;
        Scanner input = new Scanner(System.in);

        System.out.print("Daire Yaricapini Giriniz : ");
        r = input.nextDouble();
        System.out.print("Merkez Acisini Giriniz: ");
        a = input.nextInt();

        double cevre = 2*3.14*r;
        double alan = 3.14*r*r;
        double alanDilim = (3.14*r*r*a)/360;
        System.out.println( "Daire Cevresi: " +cevre);
        System.out.println( "Daire Alani: " +alan);
        System.out.println( "Daire Diliminin Alani: " +alanDilim);


    }
}
