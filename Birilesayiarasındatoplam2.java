
import java.util.Scanner;


public class Birilesayiarasındatoplam2 {

   
    public static void main(String[] args) {
           /*
    1.Başla.
    2.Kullanıcıdan sayı al.
    3.toplam=0
    4.i=1
    5.Eğer i>sayi ise adım
    6.yaz toplam=toplam+i
    7.yaz arasındaki sayıların toplamı
    8.Bitir.
    */

     Scanner oku=new Scanner(System.in);
        System.out.println("Bir sayı giriniz.");
        int sayi=oku.nextInt();
        int toplam=0;
        
        for (int i = 1; i <=sayi; i++) {
        toplam=toplam+i;
     } System.out.println("1-" + sayi + " arasındaki sayıların toplamı " + toplam);
        
    }
    
}
