import java.util.Scanner;
public class Odev7 {
    public static void main(String[]args){
        System.out.println("çevre için 1 alan için 2 ye basın");
        System.out.println("yarıçap değeri girin");
        final double pisayisi=3.14;
        Scanner girdi1=new Scanner(System.in);
        double secim= girdi1.nextDouble();
        Scanner girdi2=new Scanner(System.in);
        double yaricap=girdi2.nextDouble();

        if (secim==1)
        {
            System.out.println(yaricap + "yarıçaplı dairenin çevresi" + yaricap* 2 *pisayisi + "dır");
        }
        if (secim==2)
        {
             System.out.println(yaricap + "yarıçaplı dairenin alanı" + yaricap * yaricap * pisayisi + "dır");
        }
    }
}
