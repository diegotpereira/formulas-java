import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner teclado = new Scanner(System.in);

        double obterPontos = 0;
        double totalPontos = 0;
        float percentual;

        System.out.println("digite o total de pontos: ");
        totalPontos = teclado.nextDouble();

        System.out.println("digite os pontos obtidos: ");
        obterPontos = teclado.nextDouble();

      

        percentual = (float) ((obterPontos * 100)/totalPontos);

        System.out.println("O percentual dos ponto é: " + percentual + "%");

		teclado.close();

        System.exit(0);
    }
}
