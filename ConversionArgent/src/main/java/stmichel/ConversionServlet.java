package stmichel;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
/**
 * Servlet implementation class ConversionServlet
 */
public class ConversionServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ConversionServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		String amountStr = request.getParameter("amount");
        double amount = Double.parseDouble(amountStr);
        // Appel à l'API de conversion pour obtenir le taux de change
        double rate = getExchangeRate();
        double convertedAmount = amount * rate;
        
        request.setAttribute("convertedAmount", convertedAmount);
        request.getRequestDispatcher("/result.jsp").forward(request, response);
	}
	
	private double getExchangeRate() {
        // Utilisez HttpClient pour appeler l'API de JsDelivr et récupérer le taux de change EUR-CHF
        // Pseudo-code, à remplacer par une véritable implémentation
        return 1.1; // Supposons 1.1 comme taux de change pour l'exemple
    }
}
