import java.util.Scanner;
public class al02S {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite sua idade: ");
        int idade = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Idade: " + idade);

        System.out.println("Digite sua cor favorita: ");
        String cor = scanner.nextLine();
        System.out.println("Cor: " + cor);

        scanner.close();

    }
    
}
