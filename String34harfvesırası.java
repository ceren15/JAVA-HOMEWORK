
import java.util.Scanner;


public class String34harfvesırası {

    public static void main(String[] args) {
        
        //Klavyeden girilen bir kelimeyi her harfinden sonra sırasını gösteren sayıyı da yanına koyarak yazdıran.
        
        Scanner input=new Scanner(System.in);
        System.out.println("Lütfen bir ifade giriniz: ");
        String txt =input.nextLine();
        for (int i = 0; i <txt.length(); i++) {
            System.out.println(txt.charAt(i)+" "+ (i+1));//Yan yana yazdırmak için.
           // System.out.println(i+1);
        }

    }
    
}
