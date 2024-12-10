package Atividade4;

import java.util.Scanner;

public class InverterNumero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int numero = sc.nextInt();

        int i = 0;

        while (numero != 0) {
            i *= 10;
            i += (numero % 10);
            numero /= 10;
        }

        System.out.println("O número invertido é: " + i);
    }
}