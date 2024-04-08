public class Conta {

    private static final String AGENCIA_PADRAO = "0001";
    private static int SEQUENCIAL = 1;

    private String Numero;
    private String Agencia;
    private Double Saldo;
    private Cliente cliente;
    
    public Conta(Cliente cliente) {
        this.Numero = String.valueOf(SEQUENCIAL++);
        this.Agencia = Conta.AGENCIA_PADRAO;
        this.cliente = cliente;
        this.Saldo = 0.0;
    }
    
    public void sacar(double valor) {
        if (this.Saldo >= valor) {
            this.Saldo -= valor;

            System.out.println("Saque de R$" + valor + " realizado com sucesso");
            System.out.println("Saldo atual: R$" + this.Saldo);
        } else {
            System.out.println("Saldo insuficiente");
        }
    }

    public void depositar(double valor) {
        this.Saldo += valor;

        System.out.println("Depósito de R$" + valor + " realizado com sucesso");
        System.out.println("Saldo atual: R$" + this.Saldo);
    }

    public void transferir(Conta contaDestino, double valor) {
        if (this.Saldo >= valor) {
            this.Saldo -= valor;
            contaDestino.depositar(valor);

            System.out.println("Transferência de R$" + valor + " realizada com sucesso");
            System.out.println("Saldo atual: R$" + this.Saldo);
        } else {
            System.out.println("Saldo insuficiente");
        }
    }

    public String getNumero() {
        return Numero;
    }

    public String getAgencia() {
        return Agencia;
    }

    public Double getSaldo() {
        return Saldo;
    }

    public void imprimirInfos() {
        System.out.println("Titular: " + this.cliente.getNome());
        System.out.println("Agência: " + this.Agencia);
        System.out.println("Número: " + this.Numero);
        System.out.println("Saldo: R$" + this.Saldo);
    }
}
