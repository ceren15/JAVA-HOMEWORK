
import java.util.Scanner;


public class SINAVSORULARI20 {
/*
     *
      * 
       *
        *
         *    
    */
    public static void main(String[] args) {
      /*
        Scanner oku=new Scanner(System.in);
        System.out.print("Sütun sayısını giriniz : ");
        int n=oku.nextInt();
        
        for(int i = 1; i <=n; i++) {
            for (int bosluk = 0; bosluk <=i; bosluk++) {
             
                System.out.print(" ");
            }
                System.out.println("*");    
            
            
        }
        System.out.println();
        */
      
      //TAU SAYILARI - Girilen sayının tam bölünenlerine tam bölünmesine tau sayıları denir.Ve kaç adet tam böleni old. yazdır.
      
        Scanner oku=new Scanner(System.in);
        System.out.println("Pozitif bir sayı giriniz : ");
        int N=oku.nextInt();
        int s;
        for (int i = 1; i <= N; i++) {
            s=0;
            for (int j = 1; j <= i; j++) {
                if (i%j==0) {
                    s+=1;
                }
            }
            if (i%s==0) {
                System.out.println(i);
            }
        }
    }
    
}
