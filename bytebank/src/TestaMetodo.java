public class TestaMetodo {
    public static void main(String[] args) {
        Conta conta = new Conta();
        conta.saldo = 100;
        conta.deposita(70);

        System.out.println(conta.saldo);

        boolean conseguiuSacar = conta.saca(120);

        System.out.println("novo saldo: " + conta.saldo);
        System.out.println(conseguiuSacar);

        Conta contaDaMarcela = new Conta();
        contaDaMarcela.deposita(1000);

        if(contaDaMarcela.transfere(3000, conta)) {
            System.out.println("transferencia com sucesso");
        } else  {
            System.out.println("faltou money");
        }

        System.out.println("Conta da marcela" + contaDaMarcela.saldo);
        System.out.println("Conta " + conta.saldo);
    }
}
