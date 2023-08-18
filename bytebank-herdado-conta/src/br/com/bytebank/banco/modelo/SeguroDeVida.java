package br.com.bytebank.banco.modelo;

public class SeguroDeVida implements Tributavel {
    @Override
    public double GetValorImposto() {
        return 42;
    }
}
