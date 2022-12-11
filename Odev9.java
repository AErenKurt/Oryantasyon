import java.util.Scanner;

public class Odev9 {
    public static void main(String[]args){
        Scanner girdi = new Scanner(System.in);
        System.out.println("lütfen sınav notlarını giriniz");
        double sayi1 = girdi.nextInt();
        double sayi2 = girdi.nextInt();
        double sayi3 = girdi.nextInt();
        double ortalama = (sayi1 + sayi2 + sayi3)/3;
        System.out.println("sınav 1=" + sayi1 + "sınav 2=" + sayi2 + "sınav 3=" + sayi3);
        System.out.println("ortlamaları"+ ortalama);

    }
}
