public class TesteReferencias {
    public static void main(String[] args) {
        Gerente g1 = new Gerente();

        g1.setNome("Wendel");
        String nome = g1.getNome();
        g1.setSalario(5000);

        EditorDeVideo e = new EditorDeVideo();
        e.setSalario(2500);

        ControleBonificacao controle = new ControleBonificacao();
        controle.registra(g1);
        controle.registra(e);


        System.out.println(controle.getSoma());
        System.out.println(nome);
    }
}
