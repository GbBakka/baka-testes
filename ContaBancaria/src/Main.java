public class Main {
    public static void main(String[] args) {
        ContaBancaria.setTaxaDeJuros(0.05);

        ContaBancaria conta = ContaBancaria.criarComSaldoZerado();

        conta.depositar(1000.0);
        System.out.println("Saldo após depósito: R$ " + conta.getSaldo());

        conta.sacar(500.0);
        System.out.println("Saldo após saque: R$ " + conta.getSaldo());

        double juros = conta.calcularJuros(12);
        System.out.println("Juros acumulados após 1 ano: R$ " + juros);

        System.out.println("Taxa de juros atual: " + ContaBancaria.getTaxaDeJuros());
    }
}