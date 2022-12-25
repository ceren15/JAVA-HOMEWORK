
import java.util.Scanner;
//Dizinin uzunluğunu alıp kullanıcıdan sayı dizisini alma programı

public class Dizilgirdileri12_1 {

    public static void main(String[] args) {
        Scanner oku=new Scanner(System.in);
        System.out.print("Dizi uzunluğunu giriniz : ");
        int n=oku.nextInt();
        int[] sayi=new int[n];
        for (int i = 0; i <=sayi.length-1; i++) {
            System.out.print((i+1)+" inci sayı : ");
            sayi[i]=oku.nextInt();
        }
    }
    
}
