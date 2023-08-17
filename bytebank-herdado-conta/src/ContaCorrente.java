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
    public boolean saca(double valor) {
        return super.saca(valor + 0.2);
    }


}
