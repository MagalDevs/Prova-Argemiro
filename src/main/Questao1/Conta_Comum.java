package main.Questao1;

//Questão 1

import java.time.LocalDate;

public class Conta_Comum {
    protected int numeroDaConta;
    protected String dataAbertura;
    protected String dataEncerramento;
    protected int situacao; // 1 - ativa, 2 - encerrada
    protected String senha;
    protected double saldo;

    //métodos

    public void deposito(double valor){
        if (valor <= 0) {
            System.out.println("Valor inválido");
            return;
        }

        if (this.situacao == 1) {
            this.saldo += valor;
        } else {
            System.out.println("Conta não habilitada para depósito, pois está encerrada");
        }
    }

    public void saque(double valor){

        if(valor <=0){
            System.out.println("Valor inválido");
            return;
        }

        if (this.situacao == 1) {
            if (this.saldo >= valor) {
                this.saldo -= valor;
            } else {
                System.out.println("Saldo insuficiente");
            }
        } else {
            System.out.println("Conta não habilitada para saque, pois está encerrada");
        }
    }

    public void data_de_abertura(){
        System.out.println("Data de abertura: " + this.dataAbertura);
    }

    public void data_de_encerramento(){
        System.out.println("Data de encerramento: " + this.dataEncerramento);
    }

    public void conferir_senha(String senha){
       if(this.situacao == 1){
            if (this.senha.equals(senha)) {
                System.out.println("Senha correta");
            } else {
                System.out.println("Senha incorreta");
            }
       }else{
              System.out.println("Conta está encerrada");
       }
    }

    public void abrir_conta(){
        if(this.situacao == 2){
            this.situacao = 1;
            System.out.println("Conta aberta");
            this.dataAbertura = LocalDate.now().toString();
        }else{
            System.out.println("Conta já está aberta");
        }
    }

    public void encerrar_conta(){
        if(this.situacao == 1){
            this.situacao = 2;
            System.out.println("Conta encerrada");
            this.dataEncerramento = LocalDate.now().toString();
        }else{
            System.out.println("Conta já está encerrada");
        }
    }



    //Construtor
    public Conta_Comum(int numeroDaConta, String senha) {
        this.numeroDaConta = numeroDaConta;
        this.dataAbertura = LocalDate.now().toString();
        this.situacao = 1;
        this.senha = senha;
        this.saldo = 0.0;
    }
    //getters e Setters
    public int getNumeroDaConta() {
        return numeroDaConta;
    }

    public void setNumeroDaConta(int numeroDaConta) {
        this.numeroDaConta = numeroDaConta;
    }

    public String getDataAbertura() {
        return dataAbertura;
    }

    public void setDataAbertura(String dataAbertura) {
        this.dataAbertura = dataAbertura;
    }

    public String getDataEncerramento() {
        return dataEncerramento;
    }

    public void setDataEncerramento(String dataEncerramento) {
        this.dataEncerramento = dataEncerramento;
    }

    public int getSituacao() {
        return situacao;
    }

    public void setSituacao(int situacao) {
        this.situacao = situacao;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}
