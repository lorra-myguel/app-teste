/**
 * Autor Lorrã myguel
 * Programa:Programa de Teste
 * Data: 24/09/2026
 */
class Programa {

    // Método princial do programa
    public static void main(String[] args) {
       
        // Declaração de variaveis
        int num1;
        int primeirovalor;
        int resultado;
        int resultado1;
        float resultado2;
        int resultado3;

        // Atribuindo valores para variáveis
        num1 = 3;

        primeirovalor = 3;

        resultado = num1 + primeirovalor;

        resultado1 = num1 - primeirovalor;

        resultado2 = num1 / primeirovalor;

        resultado3 = num1 * primeirovalor;

        // Exibe uma mensagem no terminal
        System.out.println("A soma de " + num1 + " + " + primeirovalor + " é " + resultado);
        System.out.println("A subtração de " + num1 + " - " + primeirovalor + " é " + resultado1);
        System.out.println("A divisão de " + num1 + " / " + primeirovalor + " é " + resultado2);
        System.out.println("A multiplicação de " + num1 + " * " + primeirovalor + " é " + resultado3);


    }
}