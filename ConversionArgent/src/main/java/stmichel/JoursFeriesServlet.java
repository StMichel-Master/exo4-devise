package stmichel;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import java.io.IOException;
import java.util.Map;

public class JoursFeriesServlet extends HttpServlet {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JoursFeriesService service = new JoursFeriesService();

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String annee = request.getParameter("annee");
        if (annee != null && !annee.isEmpty()) {
            int year = Integer.parseInt(annee);
            Map<String, String> joursFeries = service.getJoursFeries(year);
            request.setAttribute("joursFeries", joursFeries);
            request.setAttribute("annee", annee);
            RequestDispatcher dispatcher = request.getRequestDispatcher("resultyear.jsp");
            dispatcher.forward(request, response);
        } else {
            response.sendRedirect("index.jsp");
        }
    }
}
