import java.util.Scanner;
public class ex07S {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        GPS gps = new GPS();
        System.out.println("Digite a nota 1: ");
        double nota1 = sc.nextDouble();
        gps.limpar(sc);

        System.out.println("Digite a nota 2: ");
        double nota2 = sc.nextDouble();
        gps.limpar(sc);

        System.out.println("Digite a nota 3: ");
        double nota3 = sc.nextDouble();
        gps.limpar(sc);

        System.out.println("Digite a nota 4: ");
        double nota4 = sc.nextDouble();
        gps.limpar(sc);

        double mediaPonderada = (nota1 * 1 + nota2 * 2 + nota3 * 3 + nota4 * 4) / 10;
        gps.linhas(15, "-");
        System.out.println("NOTAS");
        System.out.printf("Nota 1: %.2f \nNota 2: %.2f \nNota 3: %.2f \nNota 4: %.2f\n", nota1, nota2, nota3, nota4);
        gps.linhas(22, "-");
        System.out.printf("Média ponderada: %.2f\n", mediaPonderada);


        sc.close();
        
    }
    
}
