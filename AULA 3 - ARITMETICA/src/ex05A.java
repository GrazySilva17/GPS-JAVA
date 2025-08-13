//🧪 Exercício 1 — Conta bancária dinâmica
import java.util.Scanner;
public class ex05A {
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);
        GPS gps = new GPS();
        
        double saldo = 10000;
        System.out.printf("Quanto deseja depositar? R$");
        double deposito = sc.nextDouble();
        gps.limpar(sc);


        System.out.printf("Quanto deseja sacar? R$");
        double saque = sc.nextDouble();
        gps.limpar(sc);

        saldo += deposito;
        saldo -= saque;

        System.out.println("Saldo final: R$" + saldo);

        sc.close();
    }
    
}
