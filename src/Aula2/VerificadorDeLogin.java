package Aula2;

import java.util.Scanner;

public class VerificadorDeLogin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int count = 0;

        while(true){
            if(count == 3){
                System.out.println("Excedeu o limite de tentativas");
                break;
            }

            System.out.println("Informe o usuário: ");
            String user = sc.next();

            System.out.println("Informe a senha: ");
            String password = sc.next();

            if(user.equals("Teste") && password.equals("1234")) {
                System.out.println("login efetuado com sucesso!");
            } else {
                System.out.println("Senha ou usuário incorreto!");
                count++;
            }
        }
    }
}