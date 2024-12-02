package Aula4.Desafio2;

public class ContaBancaria {
    private String numeroConta;
    private Usuario usuario;
    private double saldo;

    public ContaBancaria(String numeroConta, Usuario usuario) {
        this.numeroConta = numeroConta;
        this.usuario = usuario;
        this.saldo = 0.0;
    }

    public void depositar(double valor) {
        if(valor > 0) {
            this.saldo += valor;
            System.out.println("Depósito de R$ " + valor + " realizado");
        } else {
            System.out.println("Valor inválido, precisa ser maior do que zero");
        }
    }

    public void sacar(double valor) {
        if(valor > 0 && valor <= this.saldo) {
            saldo -= valor;
            System.out.println("Saque de R$ " + valor + " realizado");
        } else if (valor > this.saldo) {
            System.out.println("Saldo insuficiente para o saque!");
        } else {
            System.out.println("Valor inválido");
        }
    }

    public void consultarSaldo() {
        System.out.println("Saldo atual R$");
    }
}
