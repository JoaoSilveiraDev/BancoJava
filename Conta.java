
public abstract class Conta implements Autenticacao {
	
	private String nome;
	private String cpf;
	private String profissao;
	private double saldo;
	private double senha = 2222;
	
	public String getNome() {
		return this.nome;
	}
	public String getCpf() {
		return this.cpf;
	}
	public String getProfissao() {
		return this.profissao;
	}
	public double getSaldo() {
		return this.saldo;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public void setProfissao(String profissao) {
		this.profissao = profissao;
	}
	public void setSaldo(double valor) {
		this.saldo = valor;
	}
	
	public void transferencia(double valor, Conta conta) {
		if(this.saldo > 0) {
			conta.saldo = valor;
		}else {
			System.out.println("Seu saldo é insuficiente!");
		}
	}
	@Override
	public boolean autentica(double senha) {
		if(this.senha == senha) {
		System.out.println("AUTORIZADO!");
		return true;
		}else {
			System.out.println("SENHA NEGADA!");
			return false;
		}
	}

}
