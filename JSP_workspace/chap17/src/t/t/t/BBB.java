package t.t.t;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class BBB
 */
@WebServlet("/test")
public class BBB extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private static final String dbUser = "SCOTT";
	private static final String dbPW = "TIGER";
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public BBB() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
    
	//어떤...
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("bbbbbbbbbbbbbbBBBBBBB");
		
		//String dbUser = "SCOTT";
		//String dbPW = "TIGER";
		String dbUser = getInitParameter("dbUser");
		String dbPW = getInitParameter("dbPW");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
