package br.com.bytebank.banco.teste;

import br.com.bytebank.banco.modelo.*;

public class TesteSaca  {
    public static void main(String[] args) {
        ContaCorrente cc = new ContaCorrente(22,223);

        cc.deposita(200);



        try {
            cc.saca(300);
            System.out.println("Saque bem sucedido!");
        }
        catch (SaldoInsuficienteException ex) {
            System.out.println(ex.getMessage());
            System.out.println("Saque mal sucedido!");
            System.out.println();
        }

        System.out.println("Seu Saldo é: " + cc.getSaldo());

    }
}
