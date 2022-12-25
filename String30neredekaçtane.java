
import java.util.Scanner;


public class String30neredekaçtane {

    public static void main(String[] args) {
        
        //Klavyeden girilen kelimenin seçilen harfin nerelerde ve kaç tane bulunduğunu yazdıran program.
        
        Scanner input=new Scanner(System.in);
        System.out.print("Lütfen bir ifade giriniz: ");
        String txt =input.nextLine();
        System.out.print("Lütfen bir harf giriniz: ");
        char ch=input.nextLine().charAt(0);
        
        int sayac=0;
        for (int i = 0; i < txt.length(); i++) {
            if (txt.charAt(i)==ch) {
                System.out.println((i+1)+ ",");
                sayac++;
            }
        }
        System.out.println(ch+": " +sayac+" kadar cümlede seçilmektedir.");

    }    
    
}
