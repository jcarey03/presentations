package tutorial;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Simple servlet that forwards to a JSP page.  The JSP page displays a message 
 * containing the current time.
 */
@SuppressWarnings("serial")
public class GetMessageServlet extends HttpServlet {

	/** the JSP page to forward to */
	private static final String PAGE_FORWARD = "/WEB-INF/jsp/GetMessage.jsp";
	
	/** the name of the request attribute storing the current date value */
	private static final String CURRENT_DATE_ATTR = "currentDate";
	
	/** the format of the current date */
	private static final SimpleDateFormat dateFormatter = 
		new SimpleDateFormat("MMMM dd, yyyy h:mm:ss");
	
	public void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		
		/*
		 * You would normally parse request parameters here, but this simple
		 * example does not use any request parameters.  It simply forwards
		 * to a JSP page.
		 */
		
		// turn page caching off
		resp.setHeader("Cache-Control", "no-cache");
	    resp.setHeader("Pragma", "no-cache");
		
		// set date attribute for use in JSP
		String currentDate = dateFormatter.format(new Date());
		req.setAttribute(CURRENT_DATE_ATTR, currentDate);
		
		// forward to JSP
		RequestDispatcher dispatcher = req.getRequestDispatcher(PAGE_FORWARD);
		dispatcher.forward(req, resp);
	}

	public void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		doGet(req, resp);
	}
	
}
