package Aula2;

public class AnoBissexto {
    public static void main(String[] args) {
        int ano = 2028;

        if((ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0)) {
            System.out.println("O ano " + ano + " é bissexto");
        } else {
            System.out.println("O ano " + ano + " não é bissexto");
        }
    }
}
