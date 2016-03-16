package general;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.net.Socket;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class SearchServlet
 */
@WebServlet("/SearchServlet")
public class SearchServlet extends HttpServlet
{
	private static final long serialVersionUID = 1L;

	static String skillsetfromHTML;
	static String searchTypeFromHTML;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		request.getRequestDispatcher("index.html").include(request, response);

		// getting parameters from the HTML form
		skillsetfromHTML = request.getParameter("skillset");
		searchTypeFromHTML = request.getParameter("searchtype");

	}

	public static void sendDataToServer()
	{
		try
		{
			// connecting to serversocket
			Socket clientSocket = new Socket("localhost", 8888);
			System.out.println("Connection successful!");

			// creating outpustream
			ObjectOutputStream outToServer = new ObjectOutputStream(clientSocket.getOutputStream());
			
			//sending object to server
			SocketObject searchData = new SocketObject(skillsetfromHTML, searchTypeFromHTML);
			outToServer.writeObject(searchData);
			
			outToServer.close();
			clientSocket.close();

		} catch (IOException e)
		{
			e.printStackTrace();
		}
	}
}
