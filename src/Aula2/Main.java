package Aula2;

import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        byte idade = 24;
        short ano = 2024;
        int populacao = 100000;
        long conta_bancaria = 384_400L;

        /**valor pequeno
         valor medio
         valor grande
         valor enorme, o "L ou l" no final, vira long automaticamente*/

        float preco = 19.999999f;
        double saldo = 12345.67;

        /** float é menor que double, serve para pegar números após a vírgula, e o "F" ou "f" serve pra dizer que é float, mesma lógica do "L"*/

        char letraInicial = 'J';
        char letra = 'A';
        char numero = 'A';

        /** Coleta caracteres */
        /** Aspas simples serve apenas para valores únicos, então basicamente só usamos no "char" */

        boolean estaCalor = true;
        String texto = "Olá, turma!";

        System.out.println(letra);
        System.out.println(numero);

        System.out.println("Idade: " + idade);
        System.out.println("Ano: " + ano);

        System.out.println("O professor é \"Gaúcho\"");
        System.out.printf("Preço: %.2f\n", preco);

        Locale.setDefault(Locale.US);

        /** Isso define o padrão da saída para "." em vez de "," pois usa o padrão americano */
    }
}