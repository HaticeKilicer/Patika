import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        double armut=2.14,elma=3.67, domates= 1.11, muz=0.95,patlican=5.00;
        double elmaKg,armutKg,domatesKg,muzKg,patlicanKg;
        Scanner input = new Scanner(System.in);

        System.out.print("Armut Kg : ");
        armutKg = input.nextDouble();
        System.out.print("Elma Kg : ");
        elmaKg = input.nextDouble();
        System.out.print("Domates Kg : ");
        domatesKg = input.nextDouble();
        System.out.print("Muz Kg : ");
        muzKg = input.nextDouble();
        System.out.print("Patlican Kg : ");
        patlicanKg = input.nextDouble();


        double tutar = elma*elmaKg+armut*armutKg+domates*domatesKg+muz*muzKg+patlican*patlicanKg;
        System.out.println("Odenecek Tutar :"+tutar);



    }
}
