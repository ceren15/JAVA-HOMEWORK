
import java.util.Scanner;


public class AyrıkMatkasaödemesi19 {

    public static void main(String[] args) {
        Scanner oku=new Scanner(System.in);
        double fiyat;
        double odeme;
        double paraustu;
        
        System.out.print("Alışveriş tutarı : ");
        fiyat = oku.nextDouble();
 
        System.out.print("Müşteriden alınan para miktarını yazın: ");
        odeme = oku.nextDouble();
 
        if (odeme > fiyat) {
            paraustu = odeme - fiyat;
            System.out.println("Para üstü: " +paraustu+" TL");
            
            int ikiyuzluk = (int)(paraustu/200);
        if (ikiyuzluk > 0) {
    	    paraustu = paraustu % 200;
            System.out.println(ikiyuzluk + " adet 200 TL banknot");
        }
    
        int yuzluk = (int)(paraustu/100);
        if (yuzluk > 0) {
    	paraustu = paraustu % 100;
        System.out.println(yuzluk + " adet 100 TL banknot");
        }
    
        int ellilik = (int)(paraustu/50);
        if (ellilik > 0) {
    	paraustu = paraustu % 50;
        System.out.println(ellilik + " adet 50 TL banknot");
        }
    
        int yirmilik = (int)(paraustu/20);
        if (yirmilik > 0) {
    	paraustu = paraustu % 20;
        System.out.println(yirmilik + " adet 20 TL banknot");
        }
    
        int onluk = (int)(paraustu/10);
        if (onluk > 0) {
    	paraustu = paraustu % 10;
        System.out.println(onluk + " adet 10 TL banknot");
        }
    
        int beslik = (int)(paraustu/5);
        if (beslik > 0) {
    	paraustu = paraustu % 5;
        System.out.println(beslik + " adet 5 TL banknot");
        }
    
        int birlik = (int)(paraustu/1);
        if (birlik > 0) {
    	paraustu = paraustu % 1;
        System.out.println(birlik + " adet 1 TL banknot");
        }
    
        int ellikurus = (int)(paraustu/0.5);
        if (ellikurus > 0) {
    	paraustu = paraustu % 0.5;
        System.out.println(ellikurus + " adet elli kuruş");
        }
    
        int yirmibeskurus = (int)(paraustu/0.25);
        if (yirmibeskurus > 0) {
    	paraustu = paraustu % 0.25;
        System.out.println(yirmibeskurus + " adet yirmi beş kuruş");
        }
    
        int onkurus = (int)(paraustu/0.1);
        if (onkurus > 0) {
    	paraustu = paraustu % 0.1;
        System.out.println(onkurus + " adet on kuruş");
        }
    
        int beskurus = (int)(paraustu/0.05);
        if (beskurus > 0) {
    	paraustu = paraustu % 1;
        System.out.println(beskurus + " adet beş kuruş");
        }
    }
 
        else if (odeme < fiyat) 
        System.out.print("Yetersiz bakiye");
 
        else 
        System.out.print("Para üzeri yok");
        
    }
    
}
