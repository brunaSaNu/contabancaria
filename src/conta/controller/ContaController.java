package conta.controller;

import java.util.ArrayList;

import conta.model.Conta;
import conta.model.ContaCorrente;
import conta.model.ContaPoupanca;

public class ContaController {
	
	private ArrayList<Conta> contas;
	
	public ContaController() {
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

}
