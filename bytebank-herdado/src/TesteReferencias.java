public class TesteReferencias {
    public static void main(String[] args) {
        Funcionario g1 = new Gerente();

        g1.setNome("Wendel");
        String nome = g1.getNome();

        System.out.println(nome);
    }
}
