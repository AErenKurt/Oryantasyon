import java.util.Scanner;


public class Odev3 {


    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);

        System.out.print("Birinci Sayıyı Girin: ");
        int sayi1 = reader.nextInt();
        System.out.print("İkinci Sayıyı Girin: ");
        int sayi2 = reader.nextInt();

        int toplam = sayi1 + sayi2;

        System.out.println("Sayıların Toplamı: " + toplam);
    }

}
