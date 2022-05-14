import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        int mat,fizik,kimya,turkce,tarih,cnt=5;
        Scanner input = new Scanner(System.in);

        System.out.print("Matematik Notunuz : ");
        mat = input.nextInt();
            if(0>mat || mat>100){
                mat=0;
                cnt--;
            }
        System.out.print("Fizik Notunuz : ");
        fizik = input.nextInt();
            if(0>mat || mat>100){
                 mat=0;
                 cnt--;
            }

        System.out.print("Kimya Notunuz : ");
        kimya = input.nextInt();
        if(0>kimya || kimya>100){
            kimya=0;
            cnt--;
        }

        System.out.print("Tarih Notunuz : ");
        tarih = input.nextInt();
        if(0>tarih || tarih>100){
            tarih=0;
            cnt--;
        }

        System.out.print("Turkce Notunuz : ");
        turkce = input.nextInt();
        if(0>turkce || turkce>100){
            turkce=0;
            cnt--;
        }

        double ort = (mat+fizik+kimya+tarih+turkce)/cnt;
        System.out.println("Ortalamaniz:"+ort);

        System.out.print( ort>55 ? "Sinifi Gecti": "Sinifta Kaldi");
    }
}
