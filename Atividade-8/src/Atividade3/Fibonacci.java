package Atividade3;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número que limita a sequencia de Fibonacci: ");
        int limite = sc.nextInt();

        int a = 1;
        int b = 1;
        int soma;
        System.out.println("Valores iniciais: " + a);
        System.out.println("Valores iniciais: " + b);

        for(int i = 0; i < limite - 2; i++) {
            soma = a + b;
            a = b;
            b = soma;

            System.out.println("Resto da sequencia: " + soma);
        }
    }

}
