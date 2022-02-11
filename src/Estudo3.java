import org.apache.commons.math3.util.Precision;

public class Estudo3 {
    
    public static void main(String[] args) {

        // Um aparelho de CD foi adquirido por R$ 300,00 
        // e revendido por R$ 240,00. 
        // Qual foi a porcentagem de lucro na transação?
        
        double valorAnterior = 300.0;
        double valor_revenda = 340.0;
        double valorDoLucro = 0.0;

        while (valorAnterior + ((valorDoLucro /100.0) * valorAnterior) < valor_revenda) {
            
            valorDoLucro = valorDoLucro + 0.1;
        }

        Double valorAlterado = Precision.round(valorDoLucro, 2);

        System.out.println("O valor do lucro na venda foi de: " + valorAlterado + "%");

        System.exit(0);
    }
}
