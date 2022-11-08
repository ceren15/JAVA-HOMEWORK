
import java.util.Scanner;
/*
Soru sıkıntılı takma....
*/


public class Homework14 {

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Bir sayı giriniz.");
        int a=scan.nextInt();
        int b=0;
        while(a>0){
            b=b+1;
            System.out.println(a%10);
            b=b*10+a%10 ;
            a/=10;
            
        }
        System.out.println(b);
        
        
        
        
        
        
        
        
        
        
    }
    
}
