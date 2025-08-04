//🧪 Exercício 4 – Multiplicação mágica
import java.util.Scanner; 
public class ex04S {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        GPS gps = new GPS();

        System.out.println("Digite um número: ");
        double primeiroNum = scanner.nextDouble();
        gps.limpar(scanner);

        System.out.println("Digite outro número: ");
        double segundoNum = scanner.nextDouble();
        gps.limpar(scanner);

        double produto = primeiroNum * segundoNum;
        double diferenca = primeiroNum - segundoNum;
        double media = (primeiroNum + segundoNum) / 2;
        
        System.out.println("Primeiro número: " + primeiroNum);
        System.out.println("Segundo número: " + segundoNum);

        System.out.println(" ----> RESULTADO <---- ");
        System.out.println("Produto: " + produto);
        System.out.println("Diferença: " + diferenca);
        System.out.printf("Média: %.2f\n", media);

        System.out.println("Obrigada por usar a Multiplicação Mágica 3000");


        scanner.close();
    }

}
