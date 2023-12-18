package contaTask.model;

public class MenuTask{
	public static void main(String[] args) {
		
		ContaTask conta1 = new ContaTask("Beyoncé", 145445.05f);
		System.out.println("Titular: " + conta1.titular);
		
		ContaCorrenteModel cc1 = new ContaCorrenteModel("Beyoncé da Silva", 2634.05f, "Conta corrente",214);
		System.out.println("Saldo: " + cc1.getSaldo());
		
		ContaPoupancaModel conp1 = new ContaPoupancaModel("Beyoncé de Oliveira", 211, "Conta Poupança", 154.05f, 2514);
		System.out.println("O número da agencia é: " + conp1.getAgencia());
		
	}
}