import java.util.Scanner;
    public class Odev6 {
        public static void main(String[]args){
            System.out.println("bir sayı giriniz");
            Scanner sayilar = new Scanner(System.in);
            int sayi1 = sayilar.nextInt();
            int sayi2 = sayilar.nextInt();
            int sayi3 = sayilar.nextInt();


            int enbuyuk = sayi1;

            if(enbuyuk<sayi2)
            {
                enbuyuk=sayi2;
            }
            if(enbuyuk<sayi3)
            {
                enbuyuk=sayi3;
            }
            System.out.println("en büyük"+enbuyuk);
        }


}
