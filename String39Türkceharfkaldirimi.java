
import java.util.Scanner;


public class String39Türkceharfkaldirimi {

    public static void main(String[] args) {
        //OLMADII YENİDEN BAKKKK.
        //Klavyeden küçük harflerle girilen kelimedeki Türkçe harfleri değiştiren/kaldıran program.
        
        Scanner input=new Scanner(System.in);
        System.out.println("Lütfen kelime giriniz : ");
        String txt=input.nextLine();
        char tr[]={'ç','ğ','ı','ö','ş','ü'};
        char en[]={'c','g','i','o','s','u'};
        
        for (int i = 0; i <txt.length(); i++) {
            for (int j = 0; j <tr.length; j++) {
                if (txt.charAt(i)==tr[j]) {
                    txt= txt.replace(tr[j], en[j]);
              
                }
          
            }
         
            System.out.println(txt.charAt(i));
            
        }
        
    }
}
    

