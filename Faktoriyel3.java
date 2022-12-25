
import java.util.Scanner;


public class Faktoriyel3 {

    public static void main(String[] args) {
            /*
    1.Başla.
    2.N değerini klavyeden oku/yaz.
    3.i=1,faktoriyel=1
    4.Eğer i>N ise adım 8 e git.
    5.faktoriyel=faktoriyel*i
    6.i+=i
    7.Adım 4 e git.
    8.faktöriyel yazdır.
    9.Dur.
    */

       Scanner oku=new Scanner(System.in);
        System.out.println("Bir sayı giriniz.");
        int N=oku.nextInt();
        int faktoriyel= 1;
        
        for (int i = 1; i <= N; i++) {
            faktoriyel=faktoriyel*i;
        }
        System.out.println("Sonuç:" + faktoriyel);
    }
    
}
