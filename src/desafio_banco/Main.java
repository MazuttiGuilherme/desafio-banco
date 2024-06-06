package desafio_banco;

public class Main {

	public static void main(String[] args) {
		Cliente mazutti = new Cliente();
		mazutti.setNome("Mazutti");
		
		Conta cc = new ContaCorrente(mazutti);
		Conta poupanca = new ContaPoupanca(mazutti);
		Conta investimento = new ContaInvestimento(mazutti, 5.0);
		
		cc.depositar(100);
		cc.transferir(100, poupanca);
		cc.depositar(200);
		investimento.depositar(1000);
		investimento.calcularRendimento();
		investimento.imprimirExtrato();
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
		
	}
}
