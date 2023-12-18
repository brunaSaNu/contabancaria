package contaTask.model;

public class ContaPoupancaModel {
	
	String titular;
	private int agencia;
	String tipoDeConta;
	private float saldo;
	private int numeroDeConta;
	
	public ContaPoupancaModel(String titular, int agencia, String tipoDeConta, float saldo, int numeroDeConta) {
		this.titular = titular;
		this.agencia = agencia;
		this.tipoDeConta = tipoDeConta;
		this.saldo = saldo;
		this.numeroDeConta = numeroDeConta;
	}
	
	

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public int getAgencia() {
		return agencia;
	}

	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}

	public String getTipoDeConta() {
		return tipoDeConta;
	}

	public void setTipoDeConta(String tipoDeConta) {
		this.tipoDeConta = tipoDeConta;
	}

	public float getSaldo() {
		return saldo;
	}

	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}

	public int getNumeroDeConta() {
		return numeroDeConta;
	}

	public void setNumeroDeConta(int numeroDeConta) {
		this.numeroDeConta = numeroDeConta;
	}
	
	

}


