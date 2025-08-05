
import java.util.Random;
public class ex09A {
    public static void main(String[] args) throws InterruptedException {
       
        Random rand = new Random();
        GPS gps = new GPS();

        int NumAleatorio = 0;
        int vidas = 3;
        int contagem = 0;

        while (vidas != 0) {
            
            System.out.println("Você tem " + "<3 ".repeat(vidas) + "vidas");
            System.out.printf("Gerando novo valor aleatório");
            NumAleatorio = rand.nextInt(10);
            for (int i = 0; i < 3; i++) {
                System.out.printf("...%d", i+1);
                Thread.sleep(1000);
            }
            System.out.println("\nNúmero sorteado: " + NumAleatorio);
        
            if (NumAleatorio > 5) {
                System.out.println("-> Você ganhou 1 vida!");
                vidas++;
                Thread.sleep(1000);

            } else if (NumAleatorio <= 5) {
                System.out.println("-> Você perdeu 1 vida!");
                vidas--;
                Thread.sleep(1000);
            }

            contagem+= 1;
            gps.linhas(15, "-+-");

        }

        System.out.println("O número de vezes até você perder: " + contagem);

        

        
    }
}
/*Crie um programa onde o jogador começa com 3 vidas.
Simule a perda de uma vida (com --), depois a recuperação de uma (com ++).
Mostre o total de vidas ao final. */

//Determi