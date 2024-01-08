package conta;

import java.util.ArrayList;
import java.util.Scanner;

import conta.controller.ContaController;
import conta.model.Conta;
import conta.model.ContaCorrente;
import conta.model.ContaPoupanca;

public class Menu {

	public static void main(String[] args) {
		ContaController contaController = new ContaController();

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
			System.out.println(" 5 - Sacar");
			System.out.println(" 6 - Depositar");
			System.out.println(" 7 - Transferir");
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
					contaController.cadastrar(conta);
				} else {
					ContaPoupanca conta = new ContaPoupanca(nome, saldo);
					contaController.cadastrar(conta);
				}
				System.out.println("Conta adicionada com sucesso!");
				
			}
			
			if (opcao == 2) {
				ArrayList<Conta> contas = contaController.listarTodas();
				for(int i = 0; i < contas.size(); i++) {
					Conta n = contas.get(i);
					System.out.println(i + " - " + n.getTitular()+ " - R$" + n.getSaldo());
				}
			}
			
			if (opcao == 3) {
				System.out.println("Digite o número correspondente ao cliente: ");
				int clienteAAlterar = scan.nextInt();
				
				System.out.println("Digite o novo saldo: ");
				float novoSaldo = scan.nextFloat();
				
				Conta cliente = contaController.procurarPorNumero(clienteAAlterar);
				cliente.setSaldo(novoSaldo);
				
				contaController.atualizar(cliente, clienteAAlterar);
				System.out.println("Saldo alterado com sucesso!");
			}
			
			if(opcao == 4) {
				System.out.println("Digite o número correspondente ao cliente: ");
				int clienteARemover = scan.nextInt();
				
				contaController.deletar(clienteARemover);
				System.out.println("Conta removida com sucesso!");
			}
			
			if(opcao == 5) {
				System.out.println("Digite o número da conta: ");
				int numeroConta = scan.nextInt();
				
				System.out.println("Digite o valor que deseja sacar: ");
				float saque = scan.nextFloat();
				float novoSaldo = contaController.sacar(numeroConta, saque);
				System.out.println("Seu saldo após o saque: " + novoSaldo);
			}
			
			if(opcao == 6) {
				System.out.println("Digite o número da conta: ");
				int numeroConta = scan.nextInt();
				
				System.out.println("Digite o valor de seu depósito: ");
				float deposito = scan.nextFloat();
				float novoSaldo = contaController.depositar(numeroConta, deposito);
				System.out.println("Seu saldo após o depósito: " + novoSaldo);
			}
			
			if(opcao == 7) {
				System.out.println("Digite o número da sua conta: ");
				int numeroOrigem = scan.nextInt();
				System.out.println("Digite o número da conta para qual que deseja enviar o dinheiro");
				int numeroDestino = scan.nextInt();
				
				System.out.println("Digite o valor que deseja transferir");
				float transferencia = scan.nextFloat();
				
				contaController.transferir(numeroOrigem, numeroDestino, transferencia);
				
				System.out.println("Transferência realizada com sucesso!");
				
			}
			
		} while (opcao != 0);

	}

}
