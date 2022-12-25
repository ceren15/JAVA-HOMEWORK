/*
import java.util.Scanner;


public class Çalışmalarım9 {

    public static void main(String[] args) {
//Örnek-1
       
        for(int a=1;a<=5;a++){
           System.out.println("a=" +a);
           for(int i=1;i<=3;i++){
               System.out.println("i=" +i);
           }
           System.out.println();
       }
        
        
//Örnek-2
KARE *
        Scanner oku=new Scanner(System.in);
        int row;
        do {            
        System.out.println("Satır sayısını giriniz: ");
        row=oku.nextInt();
        } while (row<0||row%2==0);
        for(int i=1;i<=row;i++){
            if(i==1||i==row){
                for(int j=1;j<=row;j++){
                    System.out.print("*");
                }
            }else{
                for(int j=1;j<=row;j++){
                    if(j==1||j==row){
                        System.out.print("*");
                    }else{
                        System.out.print(" ");
                    }
                }
            }
            System.out.println();
        }
//Örnek-3
/*
        *
        **
        ***
        ****
        *****
        ****
        ***
        **
        *  
        for(int i=1;i<=5;i++){
            for(int j=0;j<i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=4;i>0;i--){
            for(int j=0;j<i;j++){
                System.out.print("*");
            }
            System.out.println();
        }

//Örnek-4

       *
      ***
     *****
    *******
   *********
        Scanner oku=new Scanner(System.in);
        System.out.println("Bir sayı giriniz.");
        int n=oku.nextInt();
        
        for(int i=1;i<=n;i++){
            for(int j=i;j<=n;j++){
                System.out.print(" ");
            }
            for(int j=1;j<i;j++){
                System.out.print("*");
            }
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }

*/
//Örnek-5
/*
*****
****
***
**
*
*
**
***
****
*****


        for(int i=5;i>0;i--){
           for(int j=0;j<i;j++){
                System.out.print("*");
           }
            System.out.println();
        }
        
        for(int i=1;i<=5;i++){
           for(int j=0;j<i;j++){
                System.out.print("*");
           }
            System.out.println();
        }        
    }
}
*/