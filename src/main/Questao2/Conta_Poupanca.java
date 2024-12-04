package main.Questao2;

//Questão 2

import main.Questao1.Conta_Comum;

import java.time.LocalDate;

public class Conta_Poupanca extends Conta_Comum {

    private int diaAniversarioMensal;

    public Conta_Poupanca(int numeroDaConta, String senha, int diaAniversarioMensal) {
        super(numeroDaConta, senha);
        this.diaAniversarioMensal = diaAniversarioMensal;
    }

    public void aplicarJuros(){
        LocalDate hoje = LocalDate.now(); //Pega o dia de hoje, para testar, mude para o seu dia atual
        if (this.situacao == 1) {
            if(hoje.getDayOfMonth() == this.diaAniversarioMensal){
                this.saldo = this.saldo * 1.01;
                System.out.println("Juros de 1% aplicado, seu novo saldo é: " + getSaldo());
            }else {
                System.out.println("Hoje não é o dia do aniversário da conta");
            }
        } else {
            System.out.println("Conta não habilitada para aplicar juros, pois está encerrada");
        }
    }
}
