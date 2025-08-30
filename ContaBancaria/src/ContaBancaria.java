public class ContaBancaria {
    private static double taxaDeJuros;
    private double saldo;

    public static double getTaxaDeJuros() {
        return taxaDeJuros;
    }

    public static void setTaxaDeJuros(double taxa) {
        taxaDeJuros = taxa;
    }

    public ContaBancaria(double saldoInicial) {
        this.saldo = saldoInicial;
    }

    public static ContaBancaria criarComSaldoZerado() {
        return new ContaBancaria(0.0);
    }

    public void depositar(double valor) {
        this.saldo += valor;
    }

    public boolean sacar(double valor) {
        if (saldo - valor < 0) {
            return false;
        } else {
            this.saldo -= valor;
            return true;
        }
    }

    public double calcularJuros(int meses) {
        return this.saldo * taxaDeJuros * meses;
    }

    public double getSaldo() {
        return saldo;
    }
}
