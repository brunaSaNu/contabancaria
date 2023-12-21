package conta.model;

public class Conta {
	private String tipo;
	private String titular;
	private float saldo;
	
	public Conta (String tipo, String titular, float saldo) {
		this.tipo = tipo;
		this.titular = titular;
		this.saldo = saldo;	
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
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
