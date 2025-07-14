public class ex005 {
    public static void main(String[] args) {
        double temperatura = 29.0;
        boolean Chovendo = false;
        String clima = "nublado"; 

        System.out.println("Hoje está " + clima + " com " + temperatura + ". Está chovendo? " + Chovendo);
        
        if (Chovendo) {
        System.out.println("Leve o guarda-chuva!");
        } else {
        System.out.println("Pode sair de boa!");
        }

    }
}
