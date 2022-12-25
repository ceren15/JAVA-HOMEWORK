
import java.util.Scanner;


public class String35harfinilksonyazdır {

    public static void main(String[] args) {//DİLARA = (0,5),(1,4),(2,3)
        
         //7.39 soru.
        Scanner input=new Scanner(System.in);
        System.out.println("Lütfen bir ifade giriniz: ");
        String txt=input.nextLine();
        for (int i = 0; i <txt.length()/2; i++) {
            System.out.println(Character.toLowerCase(i));
            System.out.println(Character.toLowerCase(txt.length()-1-i));
        }
        
        if (txt.length()%2==1) {
            System.out.println(Character.toLowerCase(txt.charAt(txt.length()/2)));
        }
        
        
        
    }
    
}
