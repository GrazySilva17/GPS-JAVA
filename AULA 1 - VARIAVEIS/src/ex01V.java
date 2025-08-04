public class ex01V {
  public static void main(String[] args) {
    String produto = "Notebook";
    double valor = 2890.99;
    int quantidade = 2;

    double total = quantidade * valor;

    System.out.println("Produto: " + produto);
    System.out.printf("Valor do produto: R$%.2f\n", valor);
    System.out.printf("Valor total da compra: R$%.2f\n", total);
    
  }  
}
