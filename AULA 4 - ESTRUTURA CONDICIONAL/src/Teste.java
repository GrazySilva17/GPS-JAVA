public class Teste {
    public static void main(String[] args) {
        GPS gps = new GPS();

        int numero = (int) gps.entradaSaida("Digite um número inteiro: ", "I");
        double valor = (double) gps.entradaSaida("Digite um número decimal: ", "D");
        String texto = (String) gps.entradaSaida("Digite um texto: ", "S");
        boolean resposta = (boolean) gps.entradaSaida("Digite true ou false: ", "B");

        gps.linhas(20, "-");
        System.out.println("Número: " + numero);
        System.out.println("Valor: " + valor);
        System.out.println("Texto: " + texto);
        System.out.println("Resposta: " + resposta);
    }
}
