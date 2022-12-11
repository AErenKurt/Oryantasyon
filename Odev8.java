import java.util.Scanner;
import java.util.Random;
public class Odev8
{
    public static void main(String[] args)
    {
        int kisi, pc;
        Random rastgele = new Random();
        int bound = 3;
        pc = rastgele.nextInt(bound)+1;

        System.out.println("1. taş");
        System.out.println("2. kağıt");
        System.out.println("3. makas");
        System.out.println("lütfen seçim yapınız");
        Scanner gelenioku = new Scanner(System.in);
        kisi = gelenioku.nextInt();
        if (kisi != 1 && kisi != 2 && kisi != 3)
        {
            System.out.println("yanlış seçim yapılmıştır");
        }
        else
        {


            System.out.println("--------VE KAZANAAANNN--------");
            if (pc == kisi)
            {
                System.out.println("BERABERE");
            }
            if (pc == 1 && kisi == 2) {
                System.out.println("OYUNCU KAZANDI");
            }
            if (pc == 1 && kisi == 3) {
                System.out.println("BİLGİSAYAR KAZANDI");
            }
            if (pc == 2 && kisi == 1) {
                System.out.println("BİLGİSAYAR KAZANDI");
            }
            if (pc == 2 && kisi == 3) {
                System.out.println("OYUNCU KAZANDI");
            }
            if (pc == 3 && kisi == 1) {
                System.out.println("OYUNCU KAZANDI");
            }
            if (pc == 3 && kisi == 2)
            {
                System.out.println("BİLGİSAYAR KAZANDI");
            }

        }
    }
}
