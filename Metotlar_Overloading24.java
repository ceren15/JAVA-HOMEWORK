
public class Metotlar_Overloading24 { //Aşırı Yüklenme
    //add(int,int)
    static int add(int a,int b){
       return a+b ;
    }
    //add(int,int,int)
    static int add(int a,int b,int c){
       return a+b+c ;
    }
    //add(int,int,double)
    static double add(int a,int b, double c){
        return a+b+c;
    }
    

    public static void main(String[] args) {
        
        System.out.println(add(1, 5));
        System.out.println(add(5, 4,1));
        System.out.println(add(1, 2,5.0));

        
    }
    
}
