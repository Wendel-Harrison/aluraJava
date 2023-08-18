public class TestaConexao {
    public static void main(String[] args) {

        Conexao conexao = null;
        try {
            conexao = new Conexao();
            conexao.leDados();
        } catch (Exception ex) {
            System.out.println("Deu erro na conexão");
        } finally {
            conexao.fecha();
        }
    }
}
