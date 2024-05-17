package stmichel;

import java.io.IOException;
import java.net.URL;
import java.nio.charset.Charset;
import org.apache.commons.io.IOUtils;
import org.json.JSONObject;
import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


/**
 * Servlet implementation class convert
 */
public class convert extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public convert() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
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
		
		String amountCHFs = request.getParameter("amountCHF");
        double amountCHF = Double.parseDouble(amountCHFs);
        String amountUSDs = request.getParameter("amountUSD");
        double amountUSD = Double.parseDouble(amountUSDs);
        String amountBTCs = request.getParameter("amountBTC");
        double amountBTC = Double.parseDouble(amountBTCs);
        
        // Appel à l'API de conversion pour obtenir le taux de change
        JSONObject json = new JSONObject(IOUtils.toString(new URL("https://cdn.jsdelivr.net/npm/@fawazahmed0/currency-api@latest/v1/currencies/eur.json"), Charset.forName("UTF-8")));
		JSONObject eur = json.getJSONObject("eur");
		
        //double rateCHF = eur.getDouble("chf");
        double convertedCHF = amountCHF * eur.getDouble("chf");
        request.setAttribute("convertedCHF", convertedCHF);
        double convertedUSD = amountUSD * eur.getDouble("usd");
        request.setAttribute("convertedUSD", convertedUSD);
        double convertedBTC = amountBTC * eur.getDouble("btc");
        request.setAttribute("convertedBTC", convertedBTC);
        
        request.getRequestDispatcher("/result.jsp").forward(request, response);
        //response.sendRedirect(request.getContextPath() + "/result.jsp");
	}
	
}
