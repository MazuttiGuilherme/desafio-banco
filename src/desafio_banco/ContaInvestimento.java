package desafio_banco;

public class ContaInvestimento extends Conta {
    private double taxaRendimento;

    public ContaInvestimento(Cliente cliente, double taxaRendimento) {
        super(cliente);
        this.taxaRendimento = taxaRendimento;
    }

    public double getTaxaRendimento() {
        return taxaRendimento;
    }

    public void setTaxaRendimento(double taxaRendimento) {
        this.taxaRendimento = taxaRendimento;
    }

    public void calcularRendimento() {
        double rendimento = saldo * taxaRendimento / 100;
        saldo += rendimento;
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("=== Extrato Conta Investimento ===");
        System.out.println("Rendimento calculado: " + taxaRendimento);
        imprimirInfosComuns();
    }
}

