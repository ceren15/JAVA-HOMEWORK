
public class Metotlar22 {
//Fonksiyonu mainde çağırdık ve x i kaç almasını yazdık. - fx i tanımladık static void olarak 
//eğer void dersek sadece olmaz static olarak tanımlamamız gerekiyor.    
    public static void main(String[] args) {
        /*
        System.out.print("Birinci metot : ");
        f(5);
        System.out.print("İkinci metot : ");
        f(8);
        */
        power(2, 3);
        power(5, 2);
        power(0.5, 2);
    }
    
    static void f(int x){
        int result=(x+2)*6;
        System.out.println(result);
    }
    
    static void power (double number1,double number2){
        double result=1; //Eğer double yerine int kullansaydık sondaki işlemin sonucunu 0.5 in üssünü 0 yapacaktı.
        for (int i = 1; i <= number2; i++) {
            result*=number1;
        }
        System.out.println("Cevap : "+result);
    }
            
    
}
