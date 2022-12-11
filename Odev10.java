import java.util.Scanner;
public class Odev10
{
    public static void main(String[]args)
    {
    String sifre = "1453";
    System.out.println("LÜTFEN ŞİFRE GİRİNİZ");
    Scanner girdi = new Scanner(System.in);
    String kullanıcıgirisi = girdi.nextLine();
    if (kullanıcıgirisi.equals(sifre))
        {
            System.out.println("GİRİŞ BALŞARILI");
        }
        else
        {
            System.out.println("LÜTFEN TEKRAR DENEYİNİZ");
        }
    }
}
