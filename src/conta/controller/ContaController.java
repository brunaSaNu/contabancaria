package conta.controller;

import java.util.ArrayList;

import conta.model.Conta;
import conta.model.ContaCorrente;
import conta.model.ContaPoupanca;
import conta.repository.ContaRepository;
import conta.repository.IContaRepository;

public class ContaController {
	
	private IContaRepository contaRepository;
	
	public ContaController() {
		contaRepository = new ContaRepository();
	}
	
	public Conta procurarPorNumero(int numero) {
		return contaRepository.procurarPorNumero(numero);
	}

	public ArrayList<Conta> listarTodas() {
		return contaRepository.listarTodas();
	}
	
	public void cadastrar(Conta conta) {
		contaRepository.cadastrar(conta);
		
	}
	public void atualizar(Conta conta, int numero) {
		contaRepository.atualizar(conta, numero);
	}
	public void deletar(int numero) {
		contaRepository.deletar(numero);
	}

	public float sacar (int numero, float valor) {
		return contaRepository.sacar(numero, valor);
	}

	public float depositar (int numero, float valor) {
		return contaRepository.depositar(numero, valor);
	}

	public void transferir (int numeroOrigem, int numeroDestino, float valor) {
		contaRepository.transferir(numeroOrigem, numeroDestino, valor);
	} 

}
