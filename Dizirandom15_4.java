
import java.util.Random;
import java.util.Scanner;


public class Dizirandom15_4 {

    public static void main(String[] args) {
        Scanner oku=new Scanner(System.in);
        Random r=new Random();
        int n;
        do {            
            System.out.println("Dizinin uzunluğunu giriniz : ");
            n=oku.nextInt();
        } while (n<0);
        
        int[] randomsayi=new int[n];
        for (int i = 0; i <randomsayi.length; i++) {
            randomsayi[i]=r .nextInt(100);
        }
        int minsayi=randomsayi[0];
        int minindex=0;
        int maxsayi=randomsayi[0];
        int maxindex=0;
        
        for (int i = 1; i <randomsayi.length; i++) {
            if (randomsayi[i]<minsayi) {
                minsayi=randomsayi[i];
                maxindex=i;
            }
            if (randomsayi[i]>maxsayi) {
                maxsayi=randomsayi[i];
                maxindex=i;
            }
            
        }
        System.out.println("Minimum eleman : "+minsayi);
        System.out.println("Minimum eleman indexi : "+minindex);
        System.out.println("Maximum eleman : "+maxsayi);
        System.out.println("Maximum eleman indexi : "+maxindex);
        
    }
    
}
