import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        int mat,fizik,kimya,turkce,tarih;
        Scanner input = new Scanner(System.in);

        System.out.print("Matematik Notunuz : ");
        mat = input.nextInt();

        System.out.print("Fizik Notunuz : ");
        fizik = input.nextInt();

        System.out.print("Kimya Notunuz : ");
        kimya = input.nextInt();

        System.out.print("Tarih Notunuz : ");
        tarih = input.nextInt();

        System.out.print("Turkce Notunuz : ");
        turkce = input.nextInt();

        double ort = (mat+fizik+kimya+tarih+turkce)/5;
        System.out.println("Ortalamaniz:"+ort);

        System.out.print( ort>60 ? "Sinifi Gecti": "Sinifta Kaldi");
    }
}
