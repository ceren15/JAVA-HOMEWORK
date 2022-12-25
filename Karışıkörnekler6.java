
import java.util.Scanner;


public class Karışıkörnekler6 {

    public static void main(String[] args) {
        /*
    ÖRNEK-1[ Armstrong sayılar 153=(1*1*1)+(5*5*5)+(3*3*3) ]    
        
      int temp,birler,onlar,yuzler,toplam;
      for(int i=100;i<=999;i++){
          temp=i;
          
          birler=temp%10;
          temp /= 10;
          onlar=temp%10;
          temp/=10;
          yuzler=temp%10;
          temp/=10;
           
          toplam=(birler*birler*birler) + (onlar*onlar*onlar) + (yuzler*yuzler*yuzler);
          if(toplam==i){
              System.out.println(i +" Armstrong sayıdır.");
          }
      }
--------------------------------------------------------------------------------
    öRNEK-2[ Fibonacci serisi 0 1 1 2 3 5 8 13 21 34 55 ]
      
       Scanner scan=new Scanner(System.in);
        System.out.println("Bir sayı giriniz.");
        int sayi=scan.nextInt();
        int s1 =0;
        int s2 =1;
        int toplam;
        System.out.println(sayi+ " Kadar Fibonacci Dizisi:");
        for(int i=1;i<=sayi;i++){
            System.out.print(s1+ ",");
            toplam=s1+s2;
            s1 =s2;
            s2=toplam;
        }
--------------------------------------------------------------------------------        
       ÖRNEK-3[EBOB ve EKOK bulma.]
        
        Scanner oku=new Scanner(System.in);
        System.out.println("Lütfen ilk sayıyı giriniz.");
        int s1=oku.nextInt();
        System.out.println("Lütfen ikinci sayıyı giriniz.");
        int s2=oku.nextInt();
        
        int ebob=1,ekok;
        int min=(s1<s2) ? s1 : s2;//girilen sayılardan hangisi daha küçükse onunla işleme devam ediyor.
        
        for(int i=min;i>0;i--){
            if((s1%i==0) && (s2%i==0)){
                ebob=i;
                break;
            }
        }
        ekok=(s1*s2)/ebob;
        System.out.println(s1+ " ve"+ s2+" Sayılarının Ekok'u : "+ ekok);
        System.out.println(s1+ " ve"+ s2+" Sayılarının Ebob'u : "+ ebob);
        */
        
        
        int bakiye=1000 ,sayi,miktar;
        Scanner oku=new Scanner(System.in);
        
        System.out.println("Bankamıza Hoşgeldin İnsan.");
        System.out.println("Güncel Bakiyeniz:" + bakiye +" TL");
        OUTER :
        while (bakiye>0) {
            System.out.println("1-) Para Yatır. / 2-) Para Çek. / 3-) Bakiye Sorgula. / 4-) Çıkış Yap.");
            System.out.print("Yapmak istediğiniz işlemi seçiniz: ");
            sayi=oku.nextInt();
            switch (sayi) {
                case 1:
                    System.out.print("Yatırmak istediğiniz miktar :");
                    miktar=oku.nextInt();
                    bakiye+=miktar;
                    break;
                case 2:
                    System.out.print("Çekmek istediğiniz miktar :");
                    miktar=oku.nextInt();
                    if(miktar>bakiye){
                        System.out.println("Yetersiz bakiye.!!");
                    }else{
                        bakiye-=miktar;
                    }
                    break;
                case 3:
                    System.out.println("Güncel bakiyeniz: "+ bakiye+" TL");
                    break;
                case 4:
                    System.out.println("Çıkış Yapılıyor.");
                    break OUTER;
                default:
                    System.out.println("Geçersiz bir işlem girdiniz.!!");                  
            }
        }
        System.out.println("Tekrar Bekleriz. ");
    }
    
 }
