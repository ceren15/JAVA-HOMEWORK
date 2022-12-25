/*
import java.util.Scanner;
import java.util.Random;


public class Çalışmalarım7 {
    public static void main(String[] args) {
   
//Örnek 1: Birbirinden farklı olarak verilen iki adet sayıdan, büyük olanı bulup gösteren algoritma ve akış diyagramını tasarlayınız.
    public static void main(String[] args) {
        Scanner oku=new Scanner(System.in);
        System.out.println("İlk sayıyı giriniz: ");
        int sayi1=oku.nextInt();
        System.out.println("İkinci sayıyı giriniz: ");
        int sayi2=oku.nextInt();
        if(sayi1>sayi2){
            System.out.println(sayi1+" büyüktür.");
        }else if(sayi2>sayi1){
            System.out.println(sayi2+" büyüktür.");
        }else{
            System.out.println("İki sayı birbirine eşittir.");
        }
    

//Örnek 2- Girilen vize ve final notlarına göre öğrencinin dersten geçip geçmediğini bulan algoritma ve akış diyagramını tasarlayınız.    

        Scanner oku=new Scanner(System.in);
        int vize,fnl;
        do {            
            System.out.println("Vize sınavınızı giriniz: ");
            vize=oku.nextInt();
            System.out.println("Final sınavınızı giriniz: ");
            fnl=oku.nextInt();
        } while (vize>100||vize<0 || fnl>100||fnl<0);
        
        double ort=(vize*0.4)+(fnl*0.6);
        if(ort<=100&&ort>=80){
            System.out.println("Harf notunuz : A+" +ort);
        }else if(ort>=60&&ort<=79){
            System.out.println("Harf notunuz : B+ " +ort);
        }else if(ort>=50&&ort<=59){
            System.out.println("Harf notunuz : C+ " +ort);
        }else if(ort>0&&ort<=49){
            System.out.println("Harf notunuz : D+ " +ort);
        }else{
            System.out.println("Geçemediniz!!");
        }


//Örnek 3- Verilen tamsayının sıfır, pozitif ya da negatif olup olmadığını bulan algoritma ve akış diyagramını tasarlayınız.      
        
        Scanner oku=new Scanner(System.in);
        System.out.println("Bir sayı giriniz : ");
        int sayi=oku.nextInt();
        if(sayi<0){
            System.out.println("Sayı negatiftir.");
        }else if(sayi>0){
            System.out.println("Sayı pozitiftir.");
        }else {
            System.out.println("0'a eşittir.");
        }  

//Örnek 4- Ekrana 10 defa programcının adını yazan algoritmayı yapınız”.

        int i=1;
        while(i<=10){
            i++;
            System.out.println("Ceren");
        }
         
// Örnek 5- 1’den 100’e kadar tek sayıları yazdıran algoritma ve akış diyagramını yapınız.

        int i=1;
         while(i<=100){
             if(i%2!=0){
                 System.out.println(i);
             }
             i++;
         }
         
//Örnek 6- Beş sayının toplamını ve ortalamasını veren programa ait algoritmayı oluşturunuz.
 
        Scanner oku=new Scanner(System.in);
        System.out.println("Bir sayı giriniz.");
        int N=oku.nextInt();
        int toplam=0;
        for(int i=1;i<=N;i++){
            toplam+=i;
        }System.out.println("1 ile " +N+" arasındaki sayıların toplamı: "+ toplam );
        
        float ort=toplam/N;
        System.out.println("1 ile " +N+" arasındaki sayıların ortalaması :"+ ort);
         
//Örnek 7- Klavyeden girilen sayı kadar (N) sayının faktoryelini alan programın akış şeması.

        Scanner oku=new Scanner(System.in);
        System.out.println("Bir sayı giriniz.");
        int N=oku.nextInt();
        int faktoriyel=1;
        for(int i=1;i<=N;i++){
            faktoriyel*=i;
        }
        System.out.println(N+" sayısının faktöriyeli: " +faktoriyel);

//Örnek 8- Klavyeden girilen Fahrenayt derecesini Cantigrad’a çeviren programın akış şemasını çizin. 

        Scanner oku=new Scanner(System.in);
        System.out.println("Fahrenayt'ı giriniz.");
        int F=oku.nextInt();
        double C=(F-32)*5/9;
        System.out.println(F+" Fahrenayt = " +C+ " Cantigrad derecedir.");

// Örnek 9- ax²+bx+c=0 şeklinde verilen 2. derece denklemin köklerini bulan programın akış diyagramını çizin.
        
        Scanner oku=new Scanner(System.in);
        System.out.println("ax^2+bx+c ifadesindeki a değerini giriniz.");
        int a=oku.nextInt();
        System.out.println("ax^2+bx+c ifadesindeki b değerini giriniz.");
        int b=oku.nextInt();
        System.out.println("ax^2+bx+c ifadesindeki c değerini giriniz.");
        int c=oku.nextInt();
        double delta=Math.pow(b, 2)-4*a*c;
        System.out.println("Delta :" +delta);
        if(delta>0){
            double x1 = (-b+ Math.sqrt(delta))/(2*a);
            double x2 =(-b- Math.sqrt(delta))/(2*a);
            System.out.print("Birinci kök x1 : " +x1+" İkinci kök : " +x2);
        }else if(delta<0){
            System.out.println("Reel kök yoktur.");
        }else if(delta==0){
           double x=-b/2*a;
            System.out.println("Tek kök: "+x);
        }
         
//Örnek 10-Kullanıcının klavyeden girdiği sayı 3’e ve 5’e tam bölünüyorsa ekrana tam bölünüyor yazan, bölünmüyorsa bölünmüyor yazan algoritma.         

        Scanner oku=new Scanner(System.in);
        System.out.println("Bir sayı giriniz.");
        int sayi=oku.nextInt();
        if(sayi%3==0&&sayi%5==0){
            System.out.println(sayi+ " 3 ile 5'e tam bölünüyor.");
        }else{
            System.out.println(sayi+ " 3 ile 5'e tam bölünmüyor.");
        }
         
//Örnek 11. Klavyeden girilen N sayısına göre 1den Nye kadar olan tek sayıların toplamı ve çarpımı çift sayıların ise karelerinin toplamını bulan programın algoritması.         
         
        Scanner oku=new Scanner(System.in);
        System.out.println("Bir sayı giriniz.");
        int N=oku.nextInt();
        double toplam=0;
        double top=0;
        double çarpım=1;
         
        for(int i=1;i<=N;i++){
             if(i%2!=0){
                 toplam+=i;
                 çarpım*=i;
             }
             else{
                 top=top+i*i;
             }
         }
        System.out.println("1 den " + N+ "e kadar tek sayıların toplamı: " +toplam);
        System.out.println("1 den " + N+ "e kadar tek sayıların çarpım: " +çarpım);
        System.out.println("1 den " + N+ "e kadar çift sayıların kareleri toplamı: " +top);

//Örnek 12. Klavyeden girilen a ve b sayıları arasındaki sayıları listeleyen algoritması.

        Scanner oku=new Scanner(System.in);
        System.out.println("ilk aralığı giriniz :");
        int a=oku.nextInt();
        System.out.println("İkinci aralığı giriniz :");
        int b=oku.nextInt();
        
        for(int i=a;i<=b;i++){
            System.out.println(a+" ile " +b+" arasındaki sayılar :"+i);
        }
         
//Örnek 13. Klavyeden girilen 3 basamaklı sayının 1. 2. ve 3. basamağını (Basamak Değerlerini) yazdıran programın algoritması.   

        Scanner oku=new Scanner(System.in);
        int sayi;
        do{
          System.out.println("3 Basamaklı bir sayı giriniz: ");
          sayi=oku.nextInt();
        }while(sayi>999);
        int yuzler,onlar,birler;
        while(sayi>0){
            yuzler=sayi/100;
            sayi=sayi-(yuzler*100);
            System.out.println("Yüzler basamağı :" +yuzler);
            onlar=sayi/10;
            sayi=sayi-(onlar*10);
            System.out.println("Onlar basamağı: "+onlar);
            birler=sayi;
            System.out.println("Birler basamağı:" +birler);
            break;
        }
         
//Örnek 14. 7-24 arası tek sayıların toplamını ve ortalamasını bulan algoritma.

        int toplam=0;
        int ort=0;
        for(int i=7;i<=24;i++){
            if(i%2!=0){
                toplam+=i;
                ort=toplam/9;
            }
        }System.out.println("7 den 24'e kadar olan sayıların toplamı :" +toplam);
        System.out.println("7 den 24'e kadar olan sayıların ortalaması: "+ort);
         
//Örnek 15. 0 ile 30 arasında 10 tane rastgele sayı yazdırdık.
        
        for (int i=0; i<10; i++){
        System.out.println ((int)(Math.random()* 30));
        }
    
//Örnek 16. 100a+10b+c şeklinde sayı basamaklarına ayrıldığında a+b+c=3 olan değeleri ekrana yazdırılır.

        for(int a=1;a<=9;a++){
            for(int b=0;b<=9;b++){
                for(int c=0;c<=9;c++){
                    if(a+b+c==3){
                        System.out.println(100*a+10*b+c);
                    }
                }
            }
        }
    
//Örnek 17. ÇARPIM TABLOSU  

        int altcizgi, i, j; 
        System.out.println("    1 2 3 4 5 6 7 8 9 10 ");  
        for(altcizgi=1; altcizgi<=70; altcizgi++) //döngüyle uzunca bir çizgi çizelim
        { 
        System.out.print("_"); 
        } 
     
        System.out.println(); 
        for (i =1; i<=10; i++) 
         { 
        System.out.print(i+" | "); 
        for (j=1 ; j<=10 ; j ++) 
         { 
           System.out.print(i*j +" "); 
          } 
        System.out.println(); 
       }
 
         
//      


    }
 }
*/