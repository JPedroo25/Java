package Atividade1;

import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o primeiro número: ");
        double num1 = sc.nextDouble();

        System.out.println("Digite o segundo número: ");
        double num2 = sc.nextDouble();

        System.out.println("Digite o operador (+, -, /, *): ");
        char operador = sc.next().charAt(0);

        double resultado = 0;

        switch(operador) {
            case '+':
                resultado = num1 + num2;
                break;
            case '-':
                resultado = num1 - num2;
                break;
            case '/':
                resultado = num1 / num2;
                break;
            case '*':
                resultado = num1 * num2;
                break;
            default:
                System.out.println("Operador inválido!");
                break;
        }

        System.out.println("O resultado é: " + resultado);
    }
}