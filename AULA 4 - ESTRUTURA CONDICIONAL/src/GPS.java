import java.util.Scanner;
public class GPS {
    Scanner scanner = new Scanner(System.in);

    public void espaco() {
        System.out.println();

    }

    public void limpar(Scanner scanner) {
        if (scanner.hasNextLine()) {
            scanner.nextLine();
        }
    }

    public void linhas(int quantidade, String estilo) {
        System.out.println();
        for (int i = 0; i < quantidade; i++) {
            System.out.printf("%s", estilo);
        }
        System.out.println();

    }
    


    public Object entradaSaida(String mensagem, String tipo) {
        System.out.print(mensagem);

        if (tipo.equalsIgnoreCase("B")) {
            return scanner.nextBoolean();
        } else if (tipo.equalsIgnoreCase("D")) {
            return scanner.nextDouble();
        } else if (tipo.equalsIgnoreCase("I")) {
            return scanner.nextInt();
        } else if (tipo.equalsIgnoreCase("S")) {
            //limpar(scanner); // limpa buffer antes
            return scanner.nextLine();
        } else {
            System.out.println("Tipo inválido!");
            return null;
        }
    }

    public void fechar() {
        scanner.close();
    }

}


    
