package controller;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author MURILOFERREIRALEMEDO
 */

@WebServlet(urlPatterns={"/Entrega_01"})
public class PrimeiroServlet extends HttpServlet {
    
    @Override
    public void doGet(HttpServletRequest req,
                      HttpServletResponse resp){
        try {
            PrintWriter pw = resp.getWriter();
            pw.write(" Entrega 01\n Nome:Murilo Ferreira Leme dos Santos\n RA:1460481811071\n Professor:FABRICIO GALENDE MARQUES DE CARVALHO");
        }catch(IOException ioe){
            System.out.println("Impossivel escrever na resp");    
        }
        
    }
}
