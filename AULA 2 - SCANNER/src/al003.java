import java.util.Scanner;
public class al003 {
    public static void main(String[] args) {
        
        double largura = 0;
        double altura = 0;
        double area = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a largura: ");
        largura = scanner.nextDouble();

        System.out.println("Digite a altura: ");
        altura = scanner.nextDouble();

        area = largura * altura;

        System.out.println("A area do retangulo é " + area + "cm²");
        scanner.close();


    }
}
