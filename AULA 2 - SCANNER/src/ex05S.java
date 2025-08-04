import java.util.Scanner;

public class ex05S {
    public static void main(String[] args) throws InterruptedException{ 
        Scanner scanner = new Scanner(System.in);
        //GPS gps = new GPS();


        //System.out.println("Vamos jogar um jogo de palavras! Responda às perguntas abaixo:");
        System.out.println("Digite um adjetivo (descrevendo algo): ");
        String adjetivo1 = scanner.nextLine(); 

        System.out.println("Digite um verbo (uma ação que termine com -ndo): ");
        String verbo1 = scanner.nextLine();


        System.out.println("Digite um substantivo (algo que você pode ouvir): ");
        String substantivo1 = scanner.nextLine();

        System.out.println("Digite um cômodo da casa (pode ser qualquer lugar): ");
        String comodoCasa = scanner.nextLine();


        System.out.println("Digite um objeto (algo que você pode usar): ");
        String objeto = scanner.nextLine();

        System.out.println("Digite um nome de um parente (pode ser qualquer pessoa): ");
        String nomeParente = scanner.nextLine();
        
        System.out.println("Digite uma profissão (profissao dele(a)): ");
        String profissao = scanner.nextLine();

        System.out.println("Digite um verbo (uma ação que termine com -ndo): ");
        String verbo2 = scanner.nextLine();

        System.out.printf("Digite um substantivo (O que estava %s): \n", verbo2);
        String substantivo2 = scanner.nextLine();

        System.out.println("Digite uma comida (pode ser a sua favorita): ");
        String comida = scanner.nextLine();

        System.out.println("Preparando a história... Por favor, aguarde.");
        Thread.sleep(1000);
        System.out.printf("Era uma noite %s e eu estava %s no meu quarto.\n", adjetivo1, verbo1);
        System.out.printf("De repente, ouvi um(uma) %s vindo do(a) %s.\n", substantivo1, comodoCasa);
        System.out.println("Peguei meu/minha " + objeto + " e fui investigar.");
        System.out.printf("Encontrei %s vestido(a) de %s\n", nomeParente, profissao);
        System.out.printf("Ele(a) disse: 'Eu só estava %s o(a) %s'.\n", verbo2, substantivo2);
        System.out.println("Depois disso, decidi que era hora de comer um pouco de " + comida);
        Thread.sleep(3000);
        System.out.println("Obrigado por participar do nosso jogo de palavras!");


        scanner.close();
    }
    
}
