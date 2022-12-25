
import java.util.Scanner;


public class String31Terstenyazılış {

    public static void main(String[] args) {
        
        //Tersten yazılışı
        
        Scanner input=new Scanner(System.in);
        System.out.print("Lütfen bir ifade giriniz: ");
        String txt =input.nextLine();
        for (int i =txt.length()-1; i >=0; i--) {

            System.out.print(txt.charAt(i));
        }

    }
    
}
