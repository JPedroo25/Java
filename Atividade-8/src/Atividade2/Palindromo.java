package Atividade2;

import java.util.Scanner;

public class Palindromo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite uma palavra: ");
        String palavra = sc.next().toLowerCase();

        String invertida = "";

        for(int i = palavra.length()-1; i>=0; i--)
        {

            invertida = invertida + palavra.charAt(i);
        }
        System.out.println("A palavra invertida é " + invertida + "!");

        if(invertida.equals(palavra)) {
            System.out.println("A palavra " + invertida + " é um palíndromo!");
        } else {
            System.out.println("A palavra " + invertida + " não é um palíndromo.");

        }
    }
}
