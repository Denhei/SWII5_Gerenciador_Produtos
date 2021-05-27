//LUCAS ALEXANDRE - CB3007626 | ELESON OLIVEIRA CB3007235

package produtos.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import produtos.Produtos;
import produtos.dao.ProdutoDAO;

/*@WebServlet("/NovoProdutoServlet")*/
@WebServlet(urlPatterns = {"/NovoProdutoServlet"})
/*@WebServlet(name = "/servlet123", urlPatterns = { "/servlet123" })*/
public class NovoProdutoServlet extends HttpServlet {
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		
		String nome = req.getParameter("nome");
		int unidadeCompra = Integer.parseInt(req.getParameter("unidadeCompra"));
		String descricao = req.getParameter("descricao");
		double qtdPrevistoMes = Double.parseDouble(req.getParameter("qtdPrevistoMes"));
		double precoMaxComprado = Double.parseDouble(req.getParameter("precoMaxComprado"));
		
		Produtos produto = new Produtos();
		produto.setNome(nome);
		produto.setUnidadeCompra(unidadeCompra);
		produto.setDescricao(descricao);
		produto.setQtdPrevistoMes(qtdPrevistoMes);
		produto.setPrecoMaxComprado(precoMaxComprado);
		
		new ProdutoDAO().adiciona(produto);
		
		req.setAttribute("produto", produto.getNome());
		
		resp.sendRedirect("listaProdutos");
	}

}
