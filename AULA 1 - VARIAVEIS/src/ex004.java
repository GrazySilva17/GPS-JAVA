public class ex004 {
    public static void main(String[] args) {
        gps meuGPS = new gps();
        int a = 10; 
        int b = 20; 

        System.out.println("Valor de a(antes): " + a);
        System.out.println("Valor de b(antes): " + b);

        meuGPS.espaco();

        int temp = a; 
        a = b; 
        b = temp;
        System.out.println("Valor de a(depois): " + a);
        System.out.println("Valor de b(depois): " + b);
    }
}
