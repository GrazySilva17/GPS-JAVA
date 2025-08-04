import java.util.Scanner;
public class ex01S {
    public static void main(String[] args) {
        GPS gps = new GPS();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite seu nome: ");
        String nome = scanner.nextLine();
        
        System.out.print("Digite sua idade: ");
        int idade = scanner.nextInt();
        gps.limpar(scanner);

        System.out.print("Digite sua altura: "); //Não use "." e sim ","
        double altura = scanner.nextDouble();
        gps.limpar(scanner);

        System.out.println("Você é estudante? ");
        boolean estudante = scanner.nextBoolean();

        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Altura: " + altura);
        System.out.println("É estudante? " + estudante);
        
        scanner.close();
    } 
    
}
