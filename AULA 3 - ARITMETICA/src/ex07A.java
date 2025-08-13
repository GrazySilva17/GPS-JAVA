import java.util.Scanner;
public class ex07A {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        GPS gps = new GPS();

        System.out.printf("Qual seu salário atual? R$");
        double SalarioAtual = sc.nextDouble();
        gps.limpar(sc);

        System.out.printf("Qual percentual de aumento (decimal)? ");
        double PercentualAumento = sc.nextDouble();
        gps.limpar(sc);

        SalarioAtual += PercentualAumento *= SalarioAtual; //SalarioAtual = SalarioAtual + (PercentualAumento * SalarioAtual)

        System.out.println("Novo salario: R$" + SalarioAtual);
    

        sc.close();
    }
   
    
}