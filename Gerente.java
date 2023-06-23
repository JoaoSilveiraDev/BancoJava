
public class Gerente extends Conta implements Autenticacao {
	public static void main(String[] args) {
		Conta gerente = new Gerente();
		System.out.println(gerente.autentica(2222));
		Conta cliente = new ContaCorrente();
		gerente.setSaldo(5000);
		gerente.transferencia(3000, cliente);
		System.out.println(cliente.getSaldo());
	}

}
