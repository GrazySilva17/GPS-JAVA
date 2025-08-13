import java.util.Scanner;
import java.util.Random;


public class ex010A {
    
    
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       GPS gps = new GPS();
       Random rand = new Random();
       int numAleatorio = 0;

        System.out.println("Quantos jogadores irão participar? ");
        int quantJogadores = sc.nextInt();
        gps.limpar(sc);
        int cont = 1;
        int somaPontos = 0;

        for (int i = 0; i < quantJogadores; i++) {
            gps.linhas(10, "-+-");
            System.out.println("Jogador " + (i+1));

            for (int j = 0; j < 5; j++) {
                sc.nextLine();
                numAleatorio = rand.nextInt(6) + 1;
                System.out.printf("Rodada %d: Você rolou o número %d", cont, numAleatorio);
                somaPontos += numAleatorio;
                cont++;
    
            }   
            gps.espaco();
            System.out.println("Total de pontos do jogador " + (i+1) + ": " + somaPontos);
            cont = 1;   
            somaPontos = 0;   

            

        }    

        sc.close();
    }
}

/*
 * ---

### 🎲 **Exercício 5 — Rolagem de dados**

O programa deve simular 5 rodadas onde o jogador "rola o dado" apertando ENTER.
Use um contador (`++`) para contar quantas vezes o dado foi rolado.
Mostre o total de rodadas no final.

---
 */