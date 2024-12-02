package Aula4.Desafio2;

public class Usuario {
    private String nome;
    private String cpf;

    public Usuario(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    public void imprimirDetalhes() {
        System.out.println("Usuário: " + nome + ", CPF: " + cpf);
    }
}
