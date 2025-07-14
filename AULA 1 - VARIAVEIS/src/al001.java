public class al001 {
    public static void main(String[] args) throws Exception {
        gps meuGPS = new gps(); 
        
       //Declaração básica de uma variavel 
        int idade = 19;
        int ano = 2025;
        int quantidade = 3;

        System.out.println("Eu tenho " + idade + " anos");
        System.out.println("Estou estudando Java no ano de " + ano);
        System.out.println("Já tentei estudar java " + quantidade + " vezes");

        double preco = 2890.99;
        double temperatura = 31.4;
        meuGPS.espaco();
        System.out.println("O preco do meu notebook foi de " + preco + " reais");
        System.out.println("A temperatura de hoje está medindo " + temperatura + "°C");

        char letra = 'J';
        char simbolo = '&';
        meuGPS.espaco();
        System.out.println("Minha letra favorita: " + letra);
        System.out.println("Meu símbolo favorito: " + simbolo);

        boolean isEstudante = true;
        boolean isEngenheiro = false; 
        meuGPS.espaco();
        System.out.println("Ele é estudante? " + isEstudante);
        System.out.println("Ele é engenheiro? " + isEngenheiro);

        if (isEstudante) {
            System.out.println("Você é estudante");
        } else {
            System.out.println("Você não é estudante");
        }

        if (isEngenheiro) {
            System.out.println("Você é engenheiro");
        } else {
            System.out.println("Você não é engenheiro");
        }

        String nome = "Grazyeli";
        String comida = "Nissin de pimenta";
        String cor = "Roxo";
        meuGPS.espaco();
        System.out.println("Meu nome é " + nome + " e minha comida favorita é " + comida);
        System.out.println("Cor favorita: " + cor);


    }
}
