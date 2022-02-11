public class Estudos1 {

    public static void main(String[] args) {
        
        // Suponhamos que um produto que custe R$ 178,00 
        // sofra um acréscimo de 15%. Qual o valor final do produto? 
        
        double valor = 178.00;
        double percentual = 15.0 / 100.0;

        double valorTotal = valor + (percentual * valor);

        System.out.println("O valor final do produto é: " + valorTotal);

        System.exit(0);
    }
}
