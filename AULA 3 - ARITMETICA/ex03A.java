import java.util.Scanner;
public class ex03A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Primeiro numero: ");
        int num1 = sc.nextInt();

        System.out.println("Segundo numero: ");
        int num2 = sc.nextInt();

        System.out.println("Soma: " + (num1 + num2));
        System.out.println("Media aritmetica: " + ((num1 + num2) / 2.0));
       
        int dobro = 2 * num1;
        int triplo = 3 * num2;

        System.out.printf("Dobro + triplo = %d + %d = %d\n", dobro, triplo, dobro + triplo);

        sc.close();
        
    }
    
}
