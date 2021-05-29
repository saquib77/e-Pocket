package controller;

import BusinessLogic.Business;
import BusinessLogic.Registration;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Properties;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class FrontController extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try {
            String cp = request.getContextPath();
            String sp = request.getServletPath();
            String pi = request.getPathInfo();
            if (pi.equals("/index.jsp")) {
                String path = "https://localhost:8084" + cp + pi;
                response.sendRedirect(path);
            }
            if(pi.contains("view")){
                Properties prop = new Properties();
                File f = new File("/home/saquib/NetBeansProjects/e-Pocket/src/java/controller/view.properties");
                FileInputStream fis = new FileInputStream(f);
                prop.load(fis);
                String viewpath = prop.getProperty(pi.substring(6));
                request.getRequestDispatcher(viewpath).forward(request, response);
            }else{
                Business obj = (Business) Class.forName("BusinessLogic." + pi.substring(1)).newInstance();
                String res = obj.businessLogic(request);
                Properties prop = new Properties();
                File f = new File("/home/saquib/NetBeansProjects/e-Pocket/src/java/controller/view.properties");
                FileInputStream fis = new FileInputStream(f);
                prop.load(fis);
                String viewpath = prop.getProperty(pi.substring(1));
                request.getRequestDispatcher(viewpath).forward(request, response);
            }
        } catch (IOException | ClassNotFoundException | IllegalAccessException | InstantiationException ex) {
            ex.printStackTrace(out);
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
