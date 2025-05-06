import java.util.Scanner;

public class Piroca {

    public static Scanner tecladoScanner = new Scanner(System.in);

    public static void main(String[] args) {
        double baseMaior, baseMenor, altura, area;

        imprimir("Digite a base maior do trapézio: ");
        baseMaior = lerValorReal();

        imprimir("Digite a base menor do trapézio: ");
        baseMenor = lerValorReal();

        imprimir("Digite a altura do trapézio: ");
        altura = lerValorReal();

        area = areaTrap(baseMaior, baseMenor, altura);
        imprimir("A área do trapézio é: " + area);
    }
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
