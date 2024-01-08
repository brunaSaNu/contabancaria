package conta.repository;

import java.util.ArrayList;

import conta.model.Conta;
import conta.model.ContaCorrente;
import conta.model.ContaPoupanca;

public class ContaRepository implements IContaRepository {
	private ArrayList<Conta> contas;
	
	public ContaRepository() {
		contas = new ArrayList<Conta>();
		
		ContaPoupanca cpou01 = new ContaPoupanca("Ygona Moura", 0.5f);
		ContaCorrente cc01 = new ContaCorrente("Maria José", 15254.0f);
		ContaCorrente cc02 = new ContaCorrente("Inês Brasil", 145232.02f);
		
		contas.add(cpou01);
		contas.add(cc01);
		contas.add(cc02);
	}

	public Conta procurarPorNumero(int numero) {
		return contas.get(numero);
	}

	@Override
	public ArrayList<Conta> listarTodas() {
		return contas;
	}
	
	public void cadastrar(Conta conta) {
		contas.add(conta);
		
	}
	public void atualizar(Conta conta, int numero) {
		contas.set(numero, conta);
	}
	public void deletar(int numero) {
		contas.remove(numero);
	}
    
	public float sacar (int numero, float valor) {
		Conta conta = contas.get(numero);
		float novoSaldo = conta.getSaldo() - valor;
		conta.setSaldo(novoSaldo);
		return novoSaldo;
	}

	public float depositar (int numero, float valor) {
		Conta conta = contas.get(numero);
		float novoSaldo = conta.getSaldo() + valor;
		conta.setSaldo(novoSaldo);
		return novoSaldo;
	}

	public void transferir (int numeroOrigem, int numeroDestino, float valor) {
		Conta contaOrigem = contas.get(numeroOrigem);
		Conta contaDestino = contas.get(numeroDestino);
		contaOrigem.setSaldo(contaOrigem.getSaldo() - valor);
		contaDestino.setSaldo(contaDestino.getSaldo() + valor);
	}
}
