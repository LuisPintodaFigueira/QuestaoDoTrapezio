import java.util.Scanner;

public class piroca {

    public static Scanner tecladoScanner = new Scanner(System.in);

    public static void imprimir(String saida) {
        System.out.println(saida);
    }

    public static double areaTrap (double baseMaior, double baseMenor, double altura) {
        double resultado;
        resultado = ((baseMaior + baseMenor) * altura) / 2;
        return resultado;
    }
    public static double lerValorReal() {
        double valor;
        valor = tecladoScanner.nextDouble();
        return valor;
    }
}
