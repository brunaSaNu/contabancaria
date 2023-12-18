package contaTask.model;

public class ContaTask {

	String titular;
	private float saldo;
	
	
	public ContaTask(String titular, float saldo) {
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
	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}
	
	
}