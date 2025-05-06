
import java.util.Scanner;

public class PrimeiraT {

    public static Scanner tecladoScanner = new Scanner (System.in);

    public static void imprimir(String saida) {
        System.out.println(saida);
    }

    public static double lerValorReal(){
        double valor;
        valor = tecladoScanner.nextDouble();
        return valor;
    }

    public static double lerValorInteiro(){
        int valor;
        valor = tecladoScanner.nextInt();
        return valor;
    }

    public static double calcularAlturaPredio(double alturaAndares, int qntAndares){
        double resultado;
        resultado = alturaAndares * qntAndares;
        return resultado;
    }
        
    public static void main(String[] args) {
        double alturaAndares;
        int qntAndares;
        double alturaPredio;
        String saida;

        //entrada
        imprimir("digite a altura do prédio");
        alturaAndares = tecladoScanner.nextDouble();
        qntAndares = tecladoScanner.nextInt();

        //processamento
        alturaPredio = calcularAlturaPredio(alturaAndares, qntAndares);

        //saida
        saida = "altura do prédio é " + alturaPredio;
        imprimir(saida);
    }
}