import java.util.Scanner;
public class al01S {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nome: ");

        String nome = scanner.nextLine(); //Exibe tudo digitado 
        System.out.println("Seu nome é " + nome);

        System.out.println("Primeiro nome: "); //Exbie apenas a primeira palavra digitada 
        String primeiroNome = scanner.next();
        System.out.println("Seu primeiro nome é " + primeiroNome);

        System.out.println("Idade: ");
        int idade = scanner.nextInt();
        System.out.println("Sua idade é " + idade);

        System.out.println("Temperatura atual: ");
        double temperatura = scanner.nextDouble();
        System.out.println("A temperatura atual é " + temperatura);

        System.out.println("Você trabalha? ");
        boolean ehEstudante = scanner.nextBoolean();
        System.out.println("Ela é estudante? " + ehEstudante);    
        
        
        scanner.close();

    }
}
