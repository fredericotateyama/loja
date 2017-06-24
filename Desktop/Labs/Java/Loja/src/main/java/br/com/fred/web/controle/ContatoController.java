package br.com.fred.web.controle;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.fred.web.entidade.Contato;
import br.com.fred.web.persistencia.ContatoDAO;

@WebServlet("/contatocontroller")
public class ContatoController extends HttpServlet {

	public ContatoController() {
		System.out.println("Construtor..");
	}

	@Override
	public void init() throws ServletException {
		System.out.println("Init..");
		super.init();
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("doPost" + " : " + req);
		PrintWriter out = resp.getWriter();

		String id = req.getParameter("id");
		String nm = req.getParameter("nome");
		String end = req.getParameter("endereco");
		String em = req.getParameter("email");
		Contato ctt = new Contato();
		if (id != null) {
			ctt.setId(Integer.parseInt(id));
		}
		ctt.setNome(nm);
		ctt.setEndereco(end);
		ctt.setEmail(em);

		ContatoDAO dao = new ContatoDAO();
		dao.salvar(ctt);
		System.out.println("Salvo!");
		out.println("<html>");
		out.println("<body>");
		out.println("Contato:" + " " + ctt.getNome() + " " + " adicionado com sucesso");
		out.println("</html>");
		out.println("</body>");
	}

	@Override
	public void destroy() {
		System.out.println("Destroy..");
		super.destroy();
	}
}
