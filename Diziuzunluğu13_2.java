
import java.util.Scanner;

//Sayı dizisini yazdırma
public class Diziuzunluğu13_2 {

    public static void main(String[] args) {
        Scanner oku=new Scanner(System.in);
        System.out.print("Dizi uzunluğunu giriniz : ");
        int n=oku.nextInt();
        int[] sayi=new int[n];
        for (int i = 0; i <=sayi.length-1; i++) {
            System.out.println(i+ " indis:" +sayi[i]);
        }
    }
    
}
