package servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/ServletSaludos")
public class ServletSaludos extends HttpServlet {

	// Estamos re-escribiendo el método 'service' de HttpServlet, que es un método abstracto
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// NO hemos utilizado request aún, sólo response.
		// Este código se va a ejecutar con cada petición del cliente
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		out.println("<html>");
		out.println("<body><center>");
		
		for (int i=1; i<=6; i++) {
			out.println("<h" + i + "> Bienvenido a mi servlet otra vez <h" + i + ">");
		}
		out.println("</center></body>");
		out.println("</html>");
		out.close();                           // es buena costumbre el hacerlo
	}

}
