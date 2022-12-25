
import java.util.Scanner;
//Klavyeden girilen N elemanlı A dizisinin elemanlarını,ters sırada B dizisine yerleştiren ve yazdıran program.

public class Diziadanbyetersdizi18_7 {

    public static void main(String[] args) {
        Scanner oku=new Scanner(System.in);
        System.out.print("Dizi uzunluğunu giriniz : ");
        int N=oku.nextInt();
        int a[]=new int[N];
        int b[]=new int[N];
        for (int i = 0; i <a.length; i++) {
            System.out.print((i+1)+" inci sayı : ");
            a[i]=oku.nextInt();
        }
        for (int i = 0; i <b.length; i++) {
            b[i]=a[N-1-i];
        }
        for (int i = 0; i <b .length; i++) {
            System.out.println("B dizisinin elemanı");
            System.out.println((i+1)+" inci sayı : "+b[i]);
           
        }
    }
}
