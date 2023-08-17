public class TesteTributaveis {
    public static void main(String[] args) {
        ContaCorrente cc = new ContaCorrente(22,2323);
        cc.deposita(100);

        SeguroDeVida sdv = new SeguroDeVida();

        CalculadorDeImposto ci = new CalculadorDeImposto();

        ci.registra(cc);
        ci.registra(sdv);

        System.out.println(ci.getTotalImposto());
    }
}
