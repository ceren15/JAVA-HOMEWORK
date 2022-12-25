
import java.util.Scanner;


public class String36Cümledekaçkelime {

    public static void main(String[] args) {
        
        //Klavyeden girilen bir cümlede kaç tane kelime olduğunu bulan.
        
        //!!sonucu yanlış çıkmasına bakmana gerek yokk.
        Scanner input=new Scanner(System.in);
        System.out.println("Lütfen bir ifade giriniz: ");
        String txt=input.nextLine();
        char is[]={' ',',',';','-',':','?','!','&','.'};
        int sayac=0;
        for (int i = 0; i <txt.length(); i++) {
            char h=txt.charAt(i);
            for (int j = 0; j <is.length; j++) {
                if (h==is[j]) {
                    sayac++;
                   
                }
            }
        }
        System.out.println("Cümlede "+ sayac+ " tane kelime vardır.");
    }
    
}
