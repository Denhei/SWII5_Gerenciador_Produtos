
//LUCAS ALEXANDRE - CB3007626 | ELESON OLIVEIRA CB3007235
package produtos.servlet;

import java.io.IOException;

import produtos.Produtos;
import produtos.dao.ProdutoDAO;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/AlterarProduto")
public class AlteraProdutoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		
		long id = Long.parseLong(req.getParameter("id"));
		String nome = req.getParameter("nome");
		int unidadeCompra = Integer.parseInt(req.getParameter("unidadeCompra"));
		String descricao = req.getParameter("descricao");
		double qtdPrevistoMes = Double.parseDouble(req.getParameter("qtdPrevistoMes"));
		double precoMaxComprado = Double.parseDouble(req.getParameter("precoMaxComprado"));
		
		ProdutoDAO banco = new ProdutoDAO();
		
		Produtos produto = banco.buscarProdutosPorId(id);
		produto.setNome(nome);
		produto.setUnidadeCompra(unidadeCompra);
		produto.setDescricao(descricao);
		produto.setQtdPrevistoMes(qtdPrevistoMes);
		produto.setPrecoMaxComprado(precoMaxComprado);
		
		res.sendRedirect("listaProdutos");
	}

}
