package Atividade5;

import java.util.Arrays;
import java.util.Scanner;

public class Anagrama {
    public static boolean verificarAnagrama(String palavra1, String palavra2) {

        if (palavra1.length() != palavra2.length()) {
            System.out.println("Não é um anagrama por ter o número de letras diferentes.");
            return false;
        } else {

            char[] palavra1Array = palavra1.toLowerCase().toCharArray();
            char[] palavra2Array = palavra2.toLowerCase().toCharArray();

            Arrays.sort(palavra1Array);
            Arrays.sort(palavra2Array);

            return Arrays.equals(palavra1Array, palavra2Array);
        }


    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a primeira palavra: ");
        String palavra1 = sc.nextLine();

        System.out.println("Digite a segunda palavra: ");
        String palavra2 = sc.nextLine();

        if (verificarAnagrama(palavra1, palavra2)) {
            System.out.println(palavra1 + " e " + palavra2 + " são anagramas.");
        } else {
            System.out.println(palavra1 + " e " + palavra2 + " não são anagramas.");
        }

        sc.close();
    }
}