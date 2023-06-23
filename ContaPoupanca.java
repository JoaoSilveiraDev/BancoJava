
public class ContaPoupanca extends Conta {
	public static void main(String[] args) {
		Conta Joaquim = new ContaPoupanca();
		Conta Fernanda = new ContaPoupanca();
		
		Joaquim.setSaldo(5000);
		Joaquim.transferencia(3000, Fernanda);
		
		System.out.println(Fernanda.getSaldo());
	}
}
