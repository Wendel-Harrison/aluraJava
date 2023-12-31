public class FluxoComTratamento {
    public static void main(String[] args) {
        System.out.println("ini do main");
        metodo1();
        System.out.println("Fim do main");
    }

    private static void metodo1() {
        System.out.println("Ini do metodo1");
        try {
            metodo2();
        } catch (ArithmeticException | NullPointerException ex) {
            String msg = ex.getMessage();
            System.out.println(" Exception " + msg);
            ex.printStackTrace();
        }

        System.out.println("Fim do metodo1");
    }

    private static void metodo2() {
        System.out.println("Ini do metodo2");

        ArithmeticException ex = new ArithmeticException();

        System.out.println("Fim do metodo2");
    }
}
