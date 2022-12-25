
import java.util.Scanner;


public class String29ASCIIkodu {

    public static void main(String[] args) {
        
        //Bütün harflerin ASCII kodu 
        
        Scanner input=new Scanner(System.in);
        System.out.print("Lütfen bir ifade giriniz: ");
        String txt =input.nextLine();
        for (int i = 0; i < txt.length(); i++) {//i<=txt.lenght()-1 şeklindede yazabilirdimm.
            System.out.println(txt.charAt(i)+" nin ASCII kodu : "+(int)txt.charAt(i));
        }
        //Yazdığımız ifadenin 0 .indisi yazdırır bize.Yani ceren yazdığımızda 0.indis c 75 olduğundan a da 75 olur.
        int a=txt.charAt(0);
        System.out.println("a'nın değeri : "+a);
        
        //%'nın kendi değerini yazdırdık.
        int b='%';
        System.out.println("%'nın değeri : "+b);

    }
    
}
