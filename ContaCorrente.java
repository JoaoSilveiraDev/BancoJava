
public class ContaCorrente extends Conta {
	public static void main(String[] args) {
		Conta Joao = new ContaCorrente();
		Conta Vanessa = new ContaCorrente();
		Joao.setSaldo(1000);
		Joao.transferencia(500, Vanessa);
		
		System.out.println(Vanessa.getSaldo());
	}
	
}
