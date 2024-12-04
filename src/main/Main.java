package main;

import main.Questao1.Conta_Comum;
import main.Questao2.Conta_Especial;
import main.Questao2.Conta_Poupanca;

public class Main {
    public static void main(String[] args) {
        //Teste questão1
        Conta_Comum conta = new Conta_Comum(1234, "1234");
        conta.abrir_conta();
        conta.conferir_senha("123");
        conta.conferir_senha("1234");
        conta.deposito(100);
        System.out.println(conta.getSaldo());
        conta.saque(50);
        System.out.println(conta.getSaldo());
        conta.saque(100);
        conta.encerrar_conta();

        //Teste questão2

        //Conta Poupança
        Conta_Poupanca poupanca = new Conta_Poupanca(1234, "1234", 4);//dia atual de hoje, 04/12/2024
        poupanca.deposito(100);
        System.out.println(poupanca.getSaldo());
        poupanca.aplicarJuros();

        //Conta Especial
        Conta_Especial especial = new Conta_Especial(1234, "1234", 1000);
        especial.deposito(2500);
        System.out.println(especial.getSaldo());
        especial.saque(3000);
        especial.saque(1000);
        System.out.println(especial.getSaldo());
        especial.saque(1001);

    }
}
