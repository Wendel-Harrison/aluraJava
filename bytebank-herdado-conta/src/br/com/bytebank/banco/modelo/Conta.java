package br.com.bytebank.banco.modelo;

/*
* Classe representa a moldura de uma Conta
* */
public abstract class Conta {
    protected double saldo;
    private int agencia;
    private int numero;
    private Cliente titular ;
    private static int total;

    /*
    Construtor para inicializar um objeto a partir de uma agencia e um numero

     */
    public Conta(int agencia, int numero) {
        Conta.total++;
        //System.out.println("O total de contas é: " + total);
        this.agencia = agencia;
        this.numero = numero;
        //System.out.println("br.com.bytebank.br.com.bytebank.banco.modelo.Conta criada");
    }


    public abstract void deposita(double valor);

    public void saca(double valor) throws SaldoInsuficienteException {


        if(this.saldo < valor) {
            throw new SaldoInsuficienteException("Saldo: " + this.saldo + ", valor: " + valor);
        }

        this.saldo -= valor;
    }

    public void transfere(double valor, Conta destino) throws SaldoInsuficienteException {
        this.saca(valor);
        destino.deposita(valor);
    }

    public double getSaldo() {
        return this.saldo;
    }

    public int getNumero() {
        return this.numero;
    }

    public void setNumero(int numero) {
        if(numero <= 0) {
            System.out.println("não pode valor negativo");
            return;
        }
        this.numero = numero;
    }

    public int getAgencia() {
        return this.agencia;
    }

    public void setAgencia(int agencia) {
        if(agencia <= 0) {
            System.out.println("não pode valor negativo");
            return;
        }
        this.agencia = agencia;
    }

    public void setTitular(Cliente titular) {
        this.titular = titular;
    }

    public Cliente getTitular() {
        return titular;
    }

    public static int getTotal() {
        return Conta.total;
    }
}
