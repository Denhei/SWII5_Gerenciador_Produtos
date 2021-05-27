//LUCAS ALEXANDRE - CB3007626 | ELESON OLIVEIRA CB3007235

package produtos.dao;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import produtos.Produtos;

public class ProdutoDAO {

	private static List<Produtos> listaProdutos = new ArrayList<Produtos>();
	private static Integer chaveSequencial = 1;	

	public List<Produtos> listarProdutos() {
		return this.listaProdutos;
	}
	
	public void adiciona(Produtos produto) {
		adicionarNoBanco(produto);
	}

	private static void adicionarNoBanco(Produtos produto) {
		produto.setId(chaveSequencial++);
		listaProdutos.add(produto);
	}
	
	public void remover(long id) {
		Iterator<Produtos> iProdutos = listaProdutos.iterator();
		
		while(iProdutos.hasNext()) {
			Produtos produto = iProdutos.next();
			
			if(produto.getId() == id) {
				iProdutos.remove();
			}
		}
	}
	
	public Produtos buscarProdutosPorId(long id) {
		for(Produtos produto : listaProdutos) {
			if(produto.getId() == id) {
				return produto;
			}
		}
		
		return null;
	}
}
