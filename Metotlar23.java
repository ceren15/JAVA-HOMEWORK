
public class Metotlar23 {
    
    static int power(int a,int b){ //int in yerine void yazamayız çünkü döndürdüğümüz değerin türünü yazmalıyız.
     int result=1;
        for (int i = 1; i <=b; i++) {
            result*=a;
        }
       // System.out.println(result);
       return result; //Burada result değerini döndürdük bu yüzden void maine result gider.Yani döndürdüğün değer.
    }
    
     static void power2(int a,int b){ //int yerine void le yaparsak değeri döndüremeyiz.
     int result=1;
        for (int i = 1; i <=b; i++) {
            result*=a;
        }
        System.out.println(result);
     }
     
    public static void main(String[] args) {

       // power(2, 10);
        int r=power(10, 2);
        System.out.println(r);
    }
    
    
}
