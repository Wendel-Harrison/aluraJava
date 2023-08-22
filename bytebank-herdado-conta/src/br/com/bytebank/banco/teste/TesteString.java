package br.com.bytebank.banco.teste;

public class TesteString {
    public static void main(String[] args) {
        int a = 3;
        String nome;

        nome = "Alura";

        //String outro = new String("Alura");

        String nome2 = nome.replace("A", "a");

        System.out.println(nome2);
    }
}
