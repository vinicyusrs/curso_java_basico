package aulas.aulas01;

public class Variaveis {

    public static void main(String[] args) {

        // -------------------------------------------------------------
        // TIPOS PRIMITIVOS DO JAVA
        // -------------------------------------------------------------

        // boolean: armazena valores verdadeiro ou falso
        boolean ativo = true;
        
        if(ativo == true) {
        	// fazer algo
        }
        
        
        // byte: inteiro curto (-128 a 127)
        byte idadeByte = 25;

        // short: inteiro curto (-32.768 a 32.767)
        short quantidadeShort = 32000;

        // int: inteiro padrão (−2.147.483.648 a 2.147.483.647)
        int quantidade = 1000;

        // long: inteiro grande (necessita do sufixo L)
        long populacao = 8_000_000_000L;

        // float: número decimal pequeno (necessita do sufixo F)
        float precoFloat = 10.99F;

        // double: número decimal padrão (maior precisão)
        double salario = 2800.50;

        // char: armazena UM caractere
        char inicial = 'A';


        // -------------------------------------------------------------
        // TIPOS NÃO PRIMITIVOS
        // -------------------------------------------------------------

        // String: texto (não é primitivo)
        String nome = "Vinícius Rodrigues";

        // Arrays: estrutura para armazenar vários valores do mesmo tipo
        int[] numeros = { 1, 2, 3, 4, 343 };

        
        System.out.println(numeros[4]);
        // Wrappers: versões "objeto" dos tipos primitivos
        Integer idade = 30;
        Double altura = 1.75;
        Boolean aprovado = false;


        // -------------------------------------------------------------
        // VARIÁVEIS CONSTANTES (final)
        // -------------------------------------------------------------

        // final: impede que o valor seja alterado
        final double PI = 3.14159;
        final int ANO_ATUAL = 2025;


        // -------------------------------------------------------------
        // SAÍDA NO CONSOLE
        // -------------------------------------------------------------
        System.out.println("Nome: " + nome);
        System.out.println("Salário: " + salario);
        System.out.println("Idade (wrapper): " + idade);
        System.out.println("Valor de PI: " + PI);
    }
}