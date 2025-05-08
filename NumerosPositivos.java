import java.util.Scanner;

public class NumerosPositivos {

    final static Scanner tecladoScanner = new Scanner(System.in);

    public static void main(String[] args) {
    
    // Variáveis e constantes
        
        int numero = 0;
        String resultado = null;

        int cont = 0;

        int n = 0;


        imprimir("Digite quantos número tem na lista: ");
        n = lerValorInt();


    // entrada de dados

    while (cont < n){
        
        imprimir("digite um número inteiro");
        numero = lerValorInt();

        resultado = classificarNumero(numero);

        imprimir("o valor do número é " + resultado);
        resultado = null;

        cont = cont + 1;
    
    // Processamentos de dados

    // Saídas de Dados

    }
        
    }

    // método que imprime uma msg
    public static void imprimir(String texto) {
        System.out.println(texto);
    }

    // Método que pega um valor inteiro do teclado, coloca na variável valor e retornar o valor
    public static int lerValorInt ( ){
        int valor = 0;

        valor = tecladoScanner.nextInt();

        return valor;
    }

    // Método que recebe um valor inteiro, classifica o valor como sendo positivo, negativo ou zero e retorna
    public static String classificarNumero(int valor){
        String res = null;

        if (valor > 0){
            res = "positivo";
        } else if (valor < 0) {
            res = "negativo";
        } else {
            res = "ZERO!";
        }

        return res;

    }

}




















