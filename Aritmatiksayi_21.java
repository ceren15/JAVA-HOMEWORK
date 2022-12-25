
import java.util.Scanner;


public class Aritmatiksayi_21 {

    public static void main(String[] args) {
        Scanner oku=new Scanner(System.in);
        System.out.print("Pozitif bir tam sayı giriniz : ");
        int n=oku.nextInt();
        double s=0,toplam=0;
        for (int i = 1; i <=n; i++) {
            if (n%i==0) {
                toplam+=i;
                s++;
            }
        }
         if ((toplam/s)==(int)(toplam/s)) {
            System.out.println("Aritmetik sayıdır.");
        }else{
            System.out.println("Aritmatik sayı değildir.");
        }
    }
}
