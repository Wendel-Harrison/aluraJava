public class TestaMetodo {
    public static void main(String[] args) {
        Conta conta = new Conta();
        conta.saldo = 100;
        conta.deposita(70);

        System.out.println(conta.saldo);

        boolean conseguiuSacar = conta.saca(120);

        System.out.println("novo saldo: " + conta.saldo);
        System.out.println(conseguiuSacar);
    }
}
