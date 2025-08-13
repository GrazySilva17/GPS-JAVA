//Algoritmo 34: Ler um número inteiro e imprir seu sucessor e seu antecessor. 
import java.util.Scanner;
public class ex06S {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um número inteiro: ");
        int num = sc.nextInt();
        int antecessorNum, sucessorNum;
        antecessorNum = num - 1;
        sucessorNum = num + 1;

        System.out.println("Número: " + num);
        System.out.println("Antecessor: " + antecessorNum);
        System.out.println("Sucessor: " + sucessorNum);
        sc.close();
        
    }
    
}
