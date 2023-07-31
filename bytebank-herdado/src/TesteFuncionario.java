public class TesteFuncionario {
    public static void main(String[] args) {

        Funcionario mico = new Gerente();

        mico.setNome("Mico");
        mico.setCpf("45685241545");
        mico.setSalario(2050.00);

        System.out.println(mico.getNome());
        System.out.println(mico.getBonificacao());


    }
}
