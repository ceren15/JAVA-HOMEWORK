
import java.util.Scanner;


public class Homework3 {

   
    public static void main(String[] args) {
        Scanner oku=new Scanner(System.in);
        System.out.println("Üçgenin ilk kenarını giriniz.");
        int a=oku.nextInt();
        System.out.println("Üçgenin ikinci kenarını giriniz.");
        int b=oku.nextInt();
        System.out.println("Üçgenin üçüncü kenarını giriniz.");
        int c=oku.nextInt();
        
        if(a==b && b==c){
            System.out.println("Eşkenar üçgendir.");
        }
        if(a!=b && b!=c && a!=c){
            System.out.println("Çeşit kenar üçgendir.");
        }
        else if(a==b && b!=c || a!=b && b==c || a==c && a!=b){
            System.out.println("İkiz kenar üçgendir.");
        }
      
        
   
   
   
   
   
   
   
   
   
   
   
      }
           
     }
    

