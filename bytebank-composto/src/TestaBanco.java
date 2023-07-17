public class TestaBanco {
    public static void main(String[] args) {
        Cliente wendel = new Cliente();
        wendel.nome = "Wendel Harrison";
        wendel.cpf = "42680145782";
        wendel.profissao = "Programador";

        Conta contaDoWendel = new Conta();
        contaDoWendel.deposita(100);

//        associa o cliente com a conta
        contaDoWendel.titular = wendel;

        System.out.println(contaDoWendel.titular.nome);
    }
}
