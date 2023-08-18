public class TestaConexao {
    public static void main(String[] args) {

        try(Conexao con = new Conexao()) {
            con.leDados();
        }
        catch (Exception ex) {
            System.out.println("Deu erro na conexão");
        }

        //--------------------------------------

//        Conexao conexao = null;
//        try {
//            conexao = new Conexao();
//            conexao.leDados();
//        } catch (Exception ex) {
//            System.out.println("Deu erro na conexão");
//        } finally {
//            conexao.close();
//        }
    }
}
