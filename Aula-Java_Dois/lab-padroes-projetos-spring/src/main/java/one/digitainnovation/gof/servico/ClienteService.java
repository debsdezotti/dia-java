package one.digitainnovation.gof.servico;

import one.digitainnovation.gof.modelo.Cliente;

/**
 * Interface que define o padrão <b>Strategy</b> no domínio de cliente. Com
 * isso, se necessário, podemos ter multiplas implementações dessa mesma
 * interface.
 * 
 * @author falvojr
 */
public interface ClienteService {

	Iterable<one.digitainnovation.gof.modelo.Cliente> buscarTodos();

	one.digitainnovation.gof.modelo.Cliente buscarPorId(Long id);

	void inserir(Cliente cliente);

	void atualizar(Long id, Cliente cliente);

	void deletar(Long id);

}