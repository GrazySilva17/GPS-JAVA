import java.util.Scanner;
import java.util.Random;
public class ex08A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        int NumAleatorio = rand.nextInt(200);
        int cliques = 0;

        for (int i = 1; i <= NumAleatorio; i++) {
            System.out.println("Pressione ENTER para clicar [" + i + "/" + NumAleatorio + "]");
            sc.nextLine(); 
            cliques++; 
        }
        System.out.println("Total de cliques: " + cliques);

            

        sc.close();
        
    }
    
}
