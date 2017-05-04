package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Mota;
import service.SMota;

/**
 * Servlet implementation class HMota
 */
@WebServlet("/HMota")
public class HMota extends HttpServlet {
	private static final long serialVersionUID = 1L;
	SMota servMota;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public HMota() {
        super();
        servMota = new SMota();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setAttribute("listaMotas", servMota.getArMota());
		request.getRequestDispatcher("adicionarMota.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
		Mota m = new Mota(
				servMota.getArMota().size(),
				request.getParameter("marca"),
				request.getParameter("modelo"),
				request.getParameter("cc"));
		servMota.getArMota().add(m);
		
	}

}
