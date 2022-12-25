
import java.util.Scanner;
//Dizi toplamı ve ortalama hesaplama

public class Dizitoplamveort14_3 {

    public static void main(String[] args) {
        Scanner oku=new Scanner(System.in);
        System.out.print("Dizi uzunluğunu giriniz : ");
        int n=oku.nextInt();
        int[] sayi=new int[n];
        int toplam=0;
        for (int i = 0; i <=sayi.length-1; i++) {
            toplam+=sayi[i];
        }
        double ort=(double) toplam/sayi.length;
        System.out.println("Toplam : " +toplam);
        System.out.println("Ortalama : " +ort);
    }
    
}
