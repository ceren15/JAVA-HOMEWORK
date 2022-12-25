
import java.util.Scanner;
//C(i)=A(i)+B(i)

public class Diziavebdizilerinitop17_6 {

    public static void main(String[] args) {
        Scanner oku=new Scanner(System.in);
        System.out.print("Dizi uzunluğunu giriniz : ");
        int N=oku.nextInt();
        int a[]=new int[N];
        int b[]=new int[N];
        int c[]=new int[N];
        for (int i = 0; i <a.length; i++) {
            System.out.println("A dizisinin elemanı ");
            System.out.print((i+1)+" inci sayı : ");
            a[i]=oku.nextInt();
        }
        for (int i = 0; i <b.length; i++) {
            System.out.println("B dizisinin elemanı ");
            System.out.print((i+1)+" insi sayı : ");
            b[i]=oku.nextInt();
        }
        for (int i = 0; i <c .length; i++) {
            c[i]=a[i]+b[i];
            System.out.println("C dizisinin elemanı ");
            System.out.println(c[i]);
        }
    }
    
}
