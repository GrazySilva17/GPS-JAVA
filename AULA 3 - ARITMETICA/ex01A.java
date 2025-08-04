import java.util.Scanner;
public class ex01A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int num1 = scanner.nextInt();

        System.out.println("Digite outro número: ");
        int num2 = scanner.nextInt();

        int mult = num1 * num2;
        double div = (double) num1 / num2;
        int rest = num1 % num2;
        
        System.out.println("Multiplicacao: " + mult);
        System.out.println("Divisao: " + div);
        System.out.println("Resto da divisao: " + rest);

        
        scanner.close();   
    }
    
}
