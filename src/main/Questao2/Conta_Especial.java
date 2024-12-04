package main.Questao2;

//Questão 2

import main.Questao1.Conta_Comum;

public class Conta_Especial extends Conta_Comum {
    private double limite;

    public Conta_Especial(int numeroDaConta, String senha, double limite) {
        super(numeroDaConta, senha);
        this.limite = limite;
    }

    @Override
    public void saque(double valor) {
        if (valor <= 0) {
            System.out.println("Valor inválido");
            return;
        }

        if (this.situacao == 1) {
            if (this.saldo >= valor || this.limite >= valor) {
                this.saldo -= valor;
            } else {
                if (this.saldo < valor && this.limite < valor) {
                    System.out.println("Saldo e limite insuficientes");
                } else if (this.limite < valor) {
                    System.out.println("Limite insuficiente");
                } else if (this.saldo < valor) {
                    System.out.println("Saldo insuficiente");
                }
            }
        } else {
            System.out.println("Conta não habilitada para saque, pois está encerrada");
        }
    }

    public double getLimite() {
        return limite;
    }
}
