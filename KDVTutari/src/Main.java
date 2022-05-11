import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        double tutar, kdvtutari, kdvOran;
        Scanner input = new Scanner(System.in);
        System.out.print("Tutar Giriniz:");
        tutar = input.nextDouble();
        if (tutar > 0 && tutar < 1000) {
            kdvOran = 0.18;
        } else {
            kdvOran = 0.08;
        }
        double kdvfiyat = tutar + tutar * kdvOran;
        double kdvtutar = kdvfiyat - tutar;

        System.out.println("KDV'li tutar: " + kdvfiyat);
        System.out.println("KDV Tutari: " + kdvtutar);

    }
}