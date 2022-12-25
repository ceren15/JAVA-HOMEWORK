
import java.util.Scanner;

public class Karışıkörnekler8 {
    
    public static void main(String[] args) {
    
/*
    Örnek-1
        Scanner oku=new Scanner(System.in);
        System.out.println("Bir sayı giriniz : ");
        int number=oku.nextInt();
        
        for(int i=2;i<=number/2;i++){
            if(number%i==0){
                System.out.println("Tam bölünen sayılar : "+i);
                
            }
        }

Örnek-2
        Scanner oku=new Scanner(System.in);
        System.out.println("İlk sayıyı giriniz: ");
        int a=oku.nextInt();
        System.out.println("İkinci sayıyı giriniz: ");
        int b=oku.nextInt();
        int toplam=0;
        for(int i=1;i<=b;i++){
            toplam=toplam+a;
        }
        System.out.println("Girilen iki sayının çarpımı : " +toplam);
        
*/  

       Scanner oku=new Scanner(System.in);
        System.out.println("Bir sayı giriniz: ");
        int row=oku.nextInt();
        
        for(int i=1;i<=row;i++){
             for(int bosluk=1;bosluk<row;bosluk++){
                System.out.print(" ");
            }
            for(int j=1;j<=1;j++){
                System.out.print("*");
            }
           
            System.out.println();
        }
    }
    
}
