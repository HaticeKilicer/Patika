import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        double boy,kilo;
        Scanner input = new Scanner(System.in);

        System.out.print("Boyunuzu Giriniz (m) : ");
        boy = input.nextDouble();
        System.out.print("Kilonuzu  Giriniz (kg): ");
        kilo = input.nextInt();

        double kitleIndex = kilo/(boy* boy) ;
        System.out.println( "Vucut Kitle Indeksiniz: " + kitleIndex);



    }
}
