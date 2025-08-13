import java.util.Scanner;

public class al01EC {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        GPS gps = new GPS();

        String nome = (String) gps.entradaSaida("Digite seu nome: ", "S");
        int idade = (int) gps.entradaSaida("Digite sua idade: ", "I");
        gps.limpar(sc);
        boolean ehEstudante = (boolean) gps.entradaSaida("Você é estudante? (true/false): ", "B");

        if (nome.isEmpty()) {
            System.out.println("Você não tem nome???");
        } else {
            System.out.println("Olá, caro(a) " + nome);
        }

        if (idade < 0) {
            System.out.println("Você é um fantasma???");

        } else if (idade == 0) {
            System.out.println("Você é um bebê!!");

        } else if (idade >= 18 || idade <= 64) {
            System.out.println("Você é um adulto!!");

        } else {
            System.out.println("Você é um idoso!");
        }


        if (ehEstudante) {
            System.out.println("Você é estudante!");

        } else {
            System.out.println("Você não é estudante!");
        }

        gps.fechar();
    }
}
