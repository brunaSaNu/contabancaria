package conta.repository;

import java.util.ArrayList;

import conta.model.Conta;

public interface IContaRepository {
	Conta procurarPorNumero(int numero);
	ArrayList<Conta> listarTodas();
	void cadastrar(Conta conta);
	void atualizar(Conta conta, int numero);
	void deletar(int numero);
	float sacar (int numero, float valor);
	float depositar (int numero, float valor);
	void transferir (int numeroOrigem, int numeroDestino, float valor);
}
