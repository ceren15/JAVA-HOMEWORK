
import java.util.Scanner;


public class String38Karakterdeğişimi {

    public static void main(String[] args) {
        
        //Klavyeden girilen bir cümlede ; belirtilen karakteri,yeni değeriyle değiştirip yeniden yazdıran program.
        
        Scanner input=new Scanner(System.in);
        System.out.print("Lütfen cümlenizi giriniz : ");
        String txt=input.nextLine();
        System.out.println();
        
        System.out.print("Değiştirmek istediğiniz karakteri giriniz : ");
        char h=input.nextLine().charAt(0);
        System.out.print("Karakterin yeni değerini giriniz : ");
        char y=input.nextLine().charAt(0);
        System.out.println("Yeni cümle : "+txt.replace(h,y));
        
    }
    
}
