//🥉 Exercício 3 – Entrevista relâmpago
import java.util.Scanner;
public class ex03S {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        GPS gps = new GPS();

        System.out.println("Primeira palavra que vier na sua cabeça: ");
        String palavraSorte = scanner.nextLine();

        System.out.println("Numero favorito: ");
        int numFav = scanner.nextInt();
        gps.limpar(scanner);


        System.out.println("Numero quebrado aleatório: ");
        double numAl = scanner.nextDouble();

        System.out.println("Está com fome? ");
        boolean ehFome = scanner.nextBoolean();

        System.out.println("Palavra: " + palavraSorte);
        System.out.println("Numero favorito: " + numFav);
        System.out.println("Numero aleatório: " + numAl);
        System.out.println("Fome? " + ehFome);

        scanner.close();


    }  
}
