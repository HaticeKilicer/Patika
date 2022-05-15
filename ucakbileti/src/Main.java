import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int mesafe = 0, yas, yolculukTipi;
        double normalTutar = 0;

        Scanner input = new Scanner(System.in);

        System.out.print("Mesafeyi giriniz(km): ");
        mesafe = input.nextInt();

        System.out.print("Yasinizi giriniz: ");
        yas = input.nextInt();

        System.out.print("Yolculuk tipini giriniz[1-->Tek Yon, 2-->Gidis-Donus]: ");
        yolculukTipi = input.nextInt();

        if (mesafe > 0){
            normalTutar = mesafe * 0.1;
        }
        else{
            System.out.println("Mesafe icin 0'dan buyuk bir deger giriniz!");
        }

        if (yas > 0){
            if (yas < 12){
                normalTutar -= (normalTutar * 0.5);
            }
            else if((yas >= 12) && (yas <=24)){
                normalTutar -= (normalTutar * 0.1);
            }
            else if(yas >65){
                normalTutar -= (normalTutar * 0.3);
            }
        }
        else{
            System.out.println("Yas icin 0'dan buyuk bir deger giriniz!");
        }

        if ((yolculukTipi == 1) || (yolculukTipi == 2)){
            if (yolculukTipi == 2){
                normalTutar -= (normalTutar * 0.2);
                normalTutar *= 2;
            }
        }
        else{
            System.out.println("Yolculuk tipi icin 1 veya 2 degerini giriniz!");
        }

        System.out.println("Toplam tutar: " + normalTutar + " TL");
    }
}