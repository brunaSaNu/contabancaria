package conta;

import java.util.ArrayList;
import java.util.Scanner;

import conta.model.Conta;
import conta.model.ContaCorrente;
import conta.model.ContaPoupanca;

public class Menu {

	public static void main(String[] args) {
		
		ArrayList<Conta> contas = new ArrayList<Conta>();
		
		ContaPoupanca cpou01 = new ContaPoupanca("Ygona Moura", 0.5f);
		ContaCorrente cc01 = new ContaCorrente("Maria José", 15254.0f);
		ContaCorrente cc02 = new ContaCorrente("Inês Brasil", 145232.02f);
		
		contas.add(cpou01);
		contas.add(cc01);
		contas.add(cc02);
		
		int opcao = -1;
		Scanner scan = new Scanner (System.in);
		Scanner leia = new Scanner (System.in);
		
		
		do {
			System.out.println("*************************************************");
			System.out.println("            BEM VINDE AO BANCO KIT COPO           ");
			System.out.println("\n 1 - Adicionar conta no banco KitCopo");
			System.out.println(" 2 - Listar todas as contas do banco KitCopo");
			System.out.println(" 3 - Alterar saldo de uma conta");
			System.out.println(" 4 - Remover conta do banco KitCopo");
			System.out.println(" 0 - Sair");
			System.out.println("**************************************************");
			System.out.println();
			System.out.println("Entre com a opção desejada:");
			opcao = scan.nextInt();

			if (opcao == 1) {
				System.out.println("Digite o nome do cliente: ");
				String nome = leia.nextLine();
				
				System.out.println("Tipo da conta:\n1 - Corrente\n2 - Poupança");
				int tipo = scan.nextInt();
				
				System.out.println("Saldo: ");
				float saldo = scan.nextFloat();
				
				if (tipo == 1) {
					ContaCorrente conta = new ContaCorrente(nome, saldo);
					contas.add(conta);
				} else {
					ContaPoupanca conta = new ContaPoupanca(nome, saldo);
					contas.add(conta);
				}
				System.out.println("Conta adicionada com sucesso!");
				
			}
			
			if (opcao == 2) {
				for(Conta n: contas) {
					System.out.println(n.getTitular() + " - R$" + n.getSaldo());	
				}
			}
			
			if (opcao == 3) {
				for(int i = 0; i < contas.size(); i++) {
					Conta n = contas.get(i);
					System.out.println(i + " - " + n.getTitular());
				}
				System.out.println("Digite o número correspondente ao cliente: ");
				int clienteAAlterar = scan.nextInt();
				
				System.out.println("Digite o novo saldo: ");
				float novoSaldo = scan.nextFloat();
				
				Conta cliente = contas.get(clienteAAlterar);
				
				cliente.setSaldo(novoSaldo);
				System.out.println("Saldo alterado com sucesso!");
			}
			
			if(opcao == 4) {
				for(int i = 0; i < contas.size(); i++) {
					Conta n = contas.get(i);
					System.out.println(i + " - " + n.getTitular());
				}
				System.out.println("Digite o número correspondente ao cliente: ");
				int clienteARemover = scan.nextInt();
				
				contas.remove(clienteARemover);
				System.out.println("Conta removida com sucesso!");
			}
			
		} while (opcao != 0);

	}

}
