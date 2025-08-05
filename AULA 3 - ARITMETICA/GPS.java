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

}


    
