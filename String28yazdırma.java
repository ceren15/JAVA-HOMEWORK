
import java.util.Scanner;


public class String28yazdırma {

    public static void main(String[] args) {
        
        Scanner input=new Scanner(System.in);
        System.out.println("Lütfen bir ifade giriniz: ");
        String txt =input.nextLine();//Line dememizin sebebi boşlukla alakalı bir sıkıntı çıkmaması içindir.
        System.out.println(txt.charAt(2));//Klavyeden girilen kelimenin 2. indisi yazdırma.
        char ch= txt.charAt(0);//0.indise bakıyor.
        System.out.println(ch+ "'nin ASCII kodu : " +(int)ch);//int ifadesiyle biz ASCII kodunu yazdırıyoruz.
        System.out.println(ch+1);
        
        char ch2='e';
        System.out.println(ch2+ "'nin ASCII kodu : " +(int)ch2);
        
        char ch3='3';//3 karaktedir sadece harflerin kodu yoktur sayılarında var.
        System.out.println(ch3+ "'nin ASCII kodu : " +(int)ch3);

    }
    
}
