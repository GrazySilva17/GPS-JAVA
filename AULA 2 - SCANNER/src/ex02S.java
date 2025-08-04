//🥈 Exercício 2 – Calculadora de área do quadrado
import java.util.Scanner;
public class ex02S {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o lado do quadrado (cm): ");
        double LadoQuadrado = scanner.nextDouble();

        double area = LadoQuadrado * LadoQuadrado;

        System.out.println("Área: " + area + "cm²");
        scanner.close();
        
    }
}
