package Atividade6;

import java.util.Scanner;

public class JogoDe1A50 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double doubleNumeroSorteado = Math.random() * 50;

        int numeroSorteado = (int)doubleNumeroSorteado;

        //Caso queira visualizar o número a fim de testes, basta tirar os comentários da linha abaixo.
        //System.out.println("O número sorteado é: " + numeroSorteado);

        int numeroUsuario = 0;


            while (numeroUsuario != numeroSorteado) {
                System.out.println("Tente adivinhar o número entre 1 e 50: ");
                numeroUsuario = sc.nextInt();

                if(numeroUsuario == numeroSorteado) {
                    System.out.println("Você acertou, parabéns!");
                    break;
                } else {
                    System.out.println("Você errou, tente novamente!");
            }
        }
    }
}