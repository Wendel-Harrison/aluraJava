package br.com.bytebank.banco.modelo;

public class ContaCorrente extends Conta implements Tributavel {

    @Override
    public double GetValorImposto() {
        return super.saldo * 0.01;
    }

    public ContaCorrente(int agencia, int numero) {
        super(agencia, numero);
    }

    @Override
    public void deposita(double valor) {
        super.saldo += valor;
    }

    @Override
    public void saca(double valor) throws SaldoInsuficienteException {
        super.saca(valor + 0.2);
    }


}
