import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MainServlet extends HttpServlet {
	
	@Override protected void doGet(HttpServletRequest req, HttpServletResponse resp)
	throws SecurityException, IOException{
		
		PrintWriter writer = resp.getWriter();
		writer.println("MEU PRIMEIRO APP WEB");
		writer.print("<br><br>");
		
		resp.setContentType("text/html");
		writer.print("<h1>Meu cadastro de livros</h1>");
		
		writer.print("<br><label> Nome do livro: </label>"); 
		writer.print("<input type=\"text\" name=\"vlr2\">");
		
		
		writer.print("<label> Autor: </label>"); 
		writer.print("<input type=\"text\" name=\"vlr2\">");
		
		writer.print("<label> ISBN: </label>"); 
		writer.print("<input type=\"text\" name=\"vlr2\">");
		
		writer.print("<br><br><label> Valor: </label>"); 
		writer.print("<input type=\"text\" name=\"vlr2\">");
		
		writer.print("<label> Data da Compra: </label>"); 
		writer.print("<input type=\"text\" name=\"vlr2\">");

		
		writer.print("<br><input type=\"submit\" value=\"Cadastrar\">");

		

	}
}
