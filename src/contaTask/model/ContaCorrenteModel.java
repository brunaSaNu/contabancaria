package contaTask.model;

public class ContaCorrenteModel {

	String titular;
	private float saldo;
	String tipoDeConta;
	private int numeroCC;
	
	public ContaCorrenteModel(String titular, float saldo, String tipoDeConta, int numeroCC) {
		this.titular = titular;
		this.saldo = saldo;
		this.tipoDeConta = tipoDeConta;
		this.numeroCC = numeroCC;
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

	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}

	public String getTipoDeConta() {
		return tipoDeConta;
	}

	public void setTipoDeConta(String tipoDeConta) {
		this.tipoDeConta = tipoDeConta;
	}

	public int getNumeroCC() {
		return numeroCC;
	}

	public void setNumeroCC(int numeroCC) {
		this.numeroCC = numeroCC;
	}
	
	

}
