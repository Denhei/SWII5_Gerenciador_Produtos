//LUCAS ALEXANDRE - CB3007626 | ELESON OLIVEIRA CB3007235

package produtos.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import produtos.dao.ProdutoDAO;

@WebServlet("/exibeProduto")
public class ExibeProdutoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		
		long id = Long.parseLong(req.getParameter("id"));
		
		ProdutoDAO banco = new ProdutoDAO();
		
		req.setAttribute("produto", banco.buscarProdutosPorId(id));
		
		RequestDispatcher rd = req.getRequestDispatcher("/alterarProduto.jsp");
		rd.forward(req, res);
	}

}
