
import java.util.Scanner;


public class String32Büyükküçükyaz {

    public static void main(String[] args) {
        
        //Girilen cümleyi tersten yazma ve büyük/küçük yazdırma.
        
        Scanner input=new Scanner(System.in);
        System.out.print("Lütfen bir ifade giriniz: ");
        String txt =input.nextLine();
        int sayac=0;
        
        for (int i =txt.length()-1; i >=0; i--) {
            if (sayac%2==0) {
                System.out.println(Character.toLowerCase(txt.charAt(i)));//Küçülterek yazdırma
            }else{
                System.out.println(Character.toUpperCase(txt.charAt(i)));//Büyülterek yazdırma
            }
            sayac++;
        }
   }
    
}
