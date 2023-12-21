package conta.model;

public abstract class Conta {
	private String titular;
	private float saldo;
	
	public Conta (String titular, float saldo) {
		this.titular = titular;
		this.saldo = saldo;	
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public float getSaldo() {
		return saldo;
	}

	public void setSaldo(float novoSaldo) {
		this.saldo = novoSaldo;
	}

}
