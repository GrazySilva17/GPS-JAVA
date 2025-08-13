import java.util.Scanner;

public class GPS {
    private Scanner scanner = new Scanner(System.in);

    public void espaco() {
        System.out.println();
    }

    public void limpar() {
        if (scanner.hasNextLine()) {
            scanner.nextLine();
        }
    }
    
    public void linhas(int quantidade, String caractere) {
        for (int i = 0; i < quantidade; i++) {
            System.out.print(caractere);
        }
        System.out.println();
    }

    //Só funciona com mais de uma entrada. Se for apenas entrada com String, utilize o sc normal
    public Object entradaSaida(String mensagem, String tipo) {
        System.out.print(mensagem);

        if (tipo.equalsIgnoreCase("I")) { // inteiro
            int i = scanner.nextInt();
            scanner.nextLine(); // limpa buffer
            return i;
            
        } else if (tipo.equalsIgnoreCase("D")) { // double
            double d = scanner.nextDouble();
            scanner.nextLine(); // limpa buffer
            return d;

        } else if (tipo.equalsIgnoreCase("B")) { // boolean
            boolean b = scanner.nextBoolean();
            scanner.nextLine(); // limpa buffer
            return b;

        } else if (tipo.equalsIgnoreCase("S")) { // string
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
