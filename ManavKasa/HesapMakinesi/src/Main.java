import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        int n1,n2,select;
        Scanner input = new Scanner(System.in);

        System.out.print("1.Sayiyi Giriniz : ");
        n1 = input.nextInt();
        System.out.print("1.Sayiyi Giriniz : ");
        n2 = input.nextInt();
        System.out.print("Yapmak Istediginiz Islemi Seciniz: ");
        System.out.print("1--> Toplama  2--> Cikarma 3-->Carpma 4-->Bolme ------> ");
        select = input.nextInt();

        switch (select) {
            case 1:
                System.out.println("Toplam = "+ (n1+n2));
                break;
            case 2:
                System.out.println("Cikarma = "+ (n1-n2));
                break;
            case 3:
                System.out.println("Carpma = "+ (n1*n2));
                break;
            case 4:
                System.out.println("Bolme = "+ (n1/n2));
                break;
        }



    }
}
