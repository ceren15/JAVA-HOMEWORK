
import java.util.Scanner;


public class Chenasalı11 {

    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int s = 0 ;
        System.out.print("Asal bir sayı giriniz : ");
        int n= input.nextInt();
       //Chen asalı olması için sayının iki fazlasının da asal olması gerekir. Burada sayının iki fazlasını bir değişkene atadık
        do {            
            for (int i = 2; i <n; i++) {
                if (n%i==0) {
                    System.out.print("Asal sayı giriniz : ");
                    n = input.nextInt();
                }      
            }
            break;
        } while (n<0);
         int x = n+2 ;
        for (int i = 2 ; i<n ; i++){//for döngüsü ile asallığını döngü içinde kontrol ederiz
            if (x % i == 0){  //asallık kuralı sağlanıyor mu koşulu sağlanır
              s++ ; 
            }
        }
        if (s==0){
            System.out.println("Girdiğiniz sayı Chen asalıdır.");
        }else {
            System.out.println("Girdiğiniz sayı Chen asalı değildir.");
        }
    }
    
}
