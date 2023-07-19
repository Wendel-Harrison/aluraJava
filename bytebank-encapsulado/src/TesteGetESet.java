public class TesteGetESet {
    public static void main(String[] args) {
        Conta conta = new Conta(0, 0);
        conta.setNumero(1337);
        System.out.println(conta.getNumero());

        Cliente wendel = new Cliente();

        wendel.setNome("Wendel Harrison");

        System.out.println(wendel.getNome());

        conta.setTitular(wendel);

        System.out.println(conta.getTitular().getNome());
    }
}
