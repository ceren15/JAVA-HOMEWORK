
import java.util.Scanner;


public class Karışıkörnekler5 {

    public static void main(String[] args) {
      /*
       Örnek-1
    [Bir sayının faktöriyelini bulma]
        
        Scanner scan=new Scanner(System.in);
        System.out.println("Pozitif bir sayı giriniz.");
        int f=scan.nextInt();
        int sonuc=1;
        while(f>0){
            sonuc=sonuc*f;
            f=f-1;
        }
        System.out.print("sonuç ="+ sonuc);
    ------------------------------------------------------------------
       Örnek-2 
    [1+1/2+1/3+.....+1/n sayılarını toplama]
      
      Scanner scan=new Scanner(System.in);
        System.out.println("Pozitif bir sayı giriniz.");
        double n=scan.nextDouble();
        double toplam=0.0;
        while(n>0){
         toplam=toplam+(1/n);
         n=n-1;
        }  
        System.out.print(toplam);
    ------------------------------------------------------------------     
      Örnek-3
    [* 4 satır ve 5 sütundan oluşan * kümesi yazdırdık.]
        
      for(int i=1;i<=4;i++){
          for(int j=1;j<=5;j++){
              System.out.print("*");
          }
          System.out.println();
      }
    -------------------------------------------------------------------  
      Örnek-4
    [Üslü şeklinde yazdırma.]
        
      Scanner oku=new Scanner(System.in);
        System.out.println("Bir alt taban giriniz.");
        int a=oku.nextInt();
        System.out.println("Bir üst taban giriniz.");
        int b=oku.nextInt();
        int sonuc =1;
        for(int i=1;i<=b;i++){
                sonuc =sonuc*a;
        }
        System.out.println("sonuc :" +sonuc);
        */
      
      Scanner oku=new Scanner (System.in);
      int sayi;
      boolean asal=true;
      do{
          System.out.println("Bir sayı giriniz.");
          sayi=oku.nextInt();
        }while(sayi<2);
      for(int i=2;i<sayi;i++){
          if(sayi%i==0){
          asal=false;
          break;
      }
     }
      if(asal){
          System.out.println("Girilen sayı :"+sayi+ " asaldır.");
      }else{
          System.out.println("Girilen sayı :"+sayi+ " asal değildir.");
      }
    } 
    
}
