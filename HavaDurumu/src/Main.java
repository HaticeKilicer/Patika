import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        double degree;
        Scanner input = new Scanner(System.in);
        System.out.print("Hava sicakligini giriniz : ");

        degree = input.nextDouble();

        if (degree < 5)
            System.out.println("Kayak Yapabilirsiniz!");
        else if (degree > 5 && degree <= 15)
            System.out.println("Sinemaya Gidebilirsiniz!");
        else if (degree > 15 && degree <= 25)
            System.out.println("Piknik Yapabilirsiniz!");
        else
            System.out.println("Yüzebiliirsiniz!");

    }
}
