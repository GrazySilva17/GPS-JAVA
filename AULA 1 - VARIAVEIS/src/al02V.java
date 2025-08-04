public class al02V {
    public static void main(String[] args) throws Exception {
        String nome = "Grazyeli";
        int idade = 19;
        double altura = 1.63;
        char letra = 'G';
        boolean comSono = true;

        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.printf("Altura: %.2f", altura);
        System.out.println("Letra inicial: " + letra);
        if (comSono) {
            System.out.println(nome + " está com sono agora");
        } else {
            System.out.println(nome + " não está com sono");
        }

    }
}