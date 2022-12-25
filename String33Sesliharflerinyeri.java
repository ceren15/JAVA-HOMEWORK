
import java.util.Scanner;


public class String33Sesliharflerinyeri {

    public static void main(String[] args) {
        
        //Klavyeden küçük harflerle girilen bir cümledeki sesli harflerin sayısını ve cümledeki yerlerini bulma.
        
        //SINAVDAA SORABİLİRR İYİ ANLAA.
        Scanner input=new Scanner(System.in);
        System.out.println("Lütfen bir ifade giriniz: ");
        String txt =input.nextLine();
        char[] sesli ={'e','a','i','u','o'};//boşluğuda sayıyor oda bir karakterdir.
        int[] yer=new int[255];//Kaç kelime girdiğinle alakalıdır.
        int sayac=0;
        for (int i = 0; i <= txt.length()-1; i++) {//sesli harflerim küçük harflerden oluştuğu için küçültüp kontrol ediyoruz.
            char h=Character.toLowerCase(txt.charAt(i));
            for (int j = 0; j <=sesli.length-1; j++) {
                if (sesli[j]==h) {
                    //System.out.println((i+1)+" inci karakter : "); 
                    yer[sayac]=i;
                    sayac++;
                }
            }
        }
        
        for (int i = 0; i < sayac; i++) {
            System.out.println(yer[i]+" ,");
        }
        System.out.println("Toplam sesli harf : "+ sayac);

        
    }
    
}
