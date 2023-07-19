public class TestaValores {
    public static void main(String[] args) {
        Conta conta = new Conta(1337, 24226);
        int total = 0;
        System.out.println("Agencia: " + conta.getAgencia());

        Conta conta2 = new Conta(1337, 24226);

        Conta conta3 = new Conta(1337, 24226);

        System.out.println(Conta.getTotal());

    }
}
