package br.com.bytebank.banco.teste;

public class TesteString {
    public static void main(String[] args) {
        int a = 3;
        String nome;

        nome = "Alura";

        //String outro = new String("Alura");

//        char c = nome.charAt(2);
        int i = nome.indexOf("ur");
        String sub = nome.substring(1);

        String nome2 = nome.replace("A", "a");

        System.out.println(nome2);
        System.out.println(i);
        System.out.println(sub);
        System.out.println(nome.contains("Alu"));


    }
}
