public class TesteContas {
    public static void main(String[] args) throws SaldoInsuficienteException {
        ContaCorrente cc = new ContaCorrente(111, 123);
        cc.deposita(100.0);

        ContaPoupanca cp = new ContaPoupanca(123, 1258);
        cp.deposita(200.0);


        cc.transfere(10, cp);

        System.out.println("conta corrente: " + cc.getSaldo());
        System.out.println("conta poupança: " + cp.getSaldo());

    }
}
