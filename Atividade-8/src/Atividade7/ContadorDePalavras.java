package Atividade7;

import java.util.Scanner;

public class ContadorDePalavras {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite uma frase: ");
        String frase = sc.nextLine();

        //Divide a frase em palavras usando o espaço como delimitador
        String[] palavras = frase.split("\\s+");

        int numeroDePalavras = palavras.length;

        System.out.println("Nesta frase temos " + numeroDePalavras + " palavras.");

        sc.close();
    }
}
