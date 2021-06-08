package org.apache.jsp.WEB_002dINF.view;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class RegistrationView_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(2);
    _jspx_dependants.add("/WEB-INF/view/include/header.jsp");
    _jspx_dependants.add("/WEB-INF/view/include/footer.jsp");
  }

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("\n");
      out.write("<head>\n");
      out.write("\t<title>e-Pocket</title>\n");
      out.write("\t<meta charset=\"UTF-8\">\n");
      out.write("\t<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("\t<!--===============================================================================================-->\n");
      out.write("\t<link rel=\"icon\" type=\"image/png\" href=\"../../image/icons/favicon.ico\" />\n");
      out.write("\t<!--===============================================================================================-->\n");
      out.write("\t<link rel=\"stylesheet\" type=\"text/css\" href=\"../../vendor/bootstrap/css/bootstrap.min.css\">\n");
      out.write("\t<!--===============================================================================================-->\n");
      out.write("\t<link rel=\"stylesheet\" type=\"text/css\" href=\"../../fonts/font-awesome-4.7.0/css/font-awesome.min.css\">\n");
      out.write("\t<!--===============================================================================================-->\n");
      out.write("\t<link rel=\"stylesheet\" type=\"text/css\" href=\"../../fonts/Linearicons-Free-v1.0.0/icon-font.min.css\">\n");
      out.write("\t<!--===============================================================================================-->\n");
      out.write("\t<link rel=\"stylesheet\" type=\"text/css\" href=\"../../vendor/animate/animate.css\">\n");
      out.write("\t<!--===============================================================================================-->\n");
      out.write("\t<link rel=\"stylesheet\" type=\"text/css\" href=\"../../vendor/css-hamburgers/hamburgers.min.css\">\n");
      out.write("\t<!--===============================================================================================-->\n");
      out.write("\t<link rel=\"stylesheet\" type=\"text/css\" href=\"../../vendor/animsition/css/animsition.min.css\">\n");
      out.write("\t<!--===============================================================================================-->\n");
      out.write("\t<link rel=\"stylesheet\" type=\"text/css\" href=\"../../vendor/select2/select2.min.css\">\n");
      out.write("\t<!--===============================================================================================-->\n");
      out.write("\t<link rel=\"stylesheet\" type=\"text/css\" href=\"../../vendor/daterangepicker/daterangepicker.css\">\n");
      out.write("\t<!--===============================================================================================-->\n");
      out.write("\t<link rel=\"stylesheet\" type=\"text/css\" href=\"../../css/util.css\">\n");
      out.write("\t<link rel=\"stylesheet\" type=\"text/css\" href=\"../../css/main.css\">\n");
      out.write("\t<!--===============================================================================================-->\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("    <nav class=\"navbar navbar-default\">\n");
      out.write("\t<div class=\"container\">\n");
      out.write("            <div class=\"navbar-header\">\n");
      out.write("\t\t<button type=\"button\" class=\"navbar-toggle collapsed\" data-toggle=\"collapse\" data-target=\"#bs-nav-demo\" aria-expanded=\"false\">\n");
      out.write("                    <span class=\"sr-only\">Toggle navigation</span>\n");
      out.write("                    <span class=\"icon-bar\"></span>\n");
      out.write("                    <span class=\"icon-bar\"></span>\n");
      out.write("                    <span class=\"icon-bar\"></span>\n");
      out.write("      \t\t</button>\n");
      out.write("\t\t<a href=\"/home\" class=\"navbar-brand\">e-Pocket</a>\n");
      out.write("            </div>\n");
      out.write("            <div>\n");
      out.write("                <div class=\"collapse navbar-collapse\" id=\"bs-nav-demo\">\n");
      out.write("                    <ul class=\"nav navbar-nav\">\n");
      out.write("                        <li><a href=\"#\">About</a></li>\n");
      out.write("                        <li><a href=\"#\">Contact</a></li>\n");
      out.write("                        <li><a href=\"#\">Privacy & Policies</a></li>\n");
      out.write("                    </ul>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("    </nav>\n");
      out.write("\n");
      out.write("    <div class=\"limiter\">\n");
      out.write("        <div class=\"container-login100\">\n");
      out.write("            <div class=\"wrap-login100\">\n");
      out.write("                <div class=\"login100-form-title\" style=\"background-image: url(../../image/bg-01.jpg);\">\n");
      out.write("                    <span class=\"login100-form-title-1\">Sign Up</span>\n");
      out.write("\t\t</div>\n");
      out.write("                    <form action=\"Verify\" class=\"login100-form validate-form\" method=\"POST\">\n");
      out.write("                        <div class=\"wrap-input100 validate-input m-b-26\" data-validate=\"First Name is required\">\n");
      out.write("                            <span class=\"label-input100\">First Name</span>\n");
      out.write("                            <input class=\"input100\" type=\"text\" name=\"firstname\" placeholder=\"Enter First Name\">\n");
      out.write("                            <span class=\"focus-input100\"></span>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"wrap-input100 validate-input m-b-26\" data-validate=\"Last Name is required\">\n");
      out.write("                            <span class=\"label-input100\">Last Name</span>\n");
      out.write("                            <input class=\"input100\" type=\"text\" name=\"lastname\" placeholder=\"Enter Last Name\">\n");
      out.write("                            <span class=\"focus-input100\"></span>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"wrap-input100 validate-input m-b-26\" data-validate=\"Email is required\">\n");
      out.write("                            <span class=\"label-input100\">Email</span>\n");
      out.write("                            <input class=\"input100\" type=\"text\" name=\"email\" placeholder=\"Enter Email\">\n");
      out.write("                            <span class=\"focus-input100\"></span>\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                        <div class=\"wrap-input100 validate-input m-b-18\" data-validate=\"Password is required\">\n");
      out.write("                            <span class=\"label-input100\">Password</span>\n");
      out.write("                            <input class=\"input100\" type=\"password\" name=\"pass\" placeholder=\"Enter password\">\n");
      out.write("                            <span class=\"focus-input100\"></span>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"wrap-input100 validate-input m-b-26\" data-validate=\"Phone Num is required\">\n");
      out.write("                            <span class=\"label-input100\">Phone Number</span>\n");
      out.write("                            <input class=\"input100\" type=\"text\" name=\"phnum\" placeholder=\"Enter Your Phone Number\">\n");
      out.write("                            <span class=\"focus-input100\"></span>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"wrap-input100 validate-input m-b-26\" data-validate=\"City Name is required\">\n");
      out.write("                            <span class=\"label-input100\">City Name</span>\n");
      out.write("                            <input class=\"input100\" type=\"text\" name=\"city_name\" placeholder=\"Enter City Name\">\n");
      out.write("                            <span class=\"focus-input100\"></span>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"wrap-input100 validate-input m-b-26\" data-validate=\"State Name is required\">\n");
      out.write("                            <span class=\"label-input100\">State Name</span>\n");
      out.write("                            <input class=\"input100\" type=\"text\" name=\"state_name\" placeholder=\"Enter State Name\">\n");
      out.write("                            <span class=\"focus-input100\"></span>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"wrap-input100 validate-input m-b-26\" data-validate=\"Country Name is required\">\n");
      out.write("                            <span class=\"label-input100\">Country Name</span>\n");
      out.write("                            <input class=\"input100\" type=\"text\" name=\"country_name\" placeholder=\"Enter Country Name\">\n");
      out.write("                            <span class=\"focus-input100\"></span>\n");
      out.write("                        </div>\n");
      out.write("                        \n");
      out.write("                        <div class=\"wrap-input100 validate-form m-b-26\" data-validate=\"Gender Required\">\n");
      out.write("                            <span class=\"label-input100\">Gender</span>\n");
      out.write("                            <select class=\"input100\" name=\"gender\">\n");
      out.write("                                <option value=\"male\">Male</option>\n");
      out.write("                                <option value=\"female\">Female</option>\n");
      out.write("                                <option value=\"other\">Other</option>\n");
      out.write("                            </select>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"wrap-input100 validate-form m-b-26\" data-validate=\"Gender Required\">\n");
      out.write("                            <span class=\"label-input100\">Security Questions</span>\n");
      out.write("                            <select class=\"input100\" name=\"que\">\n");
      out.write("                                <option value=\"1que\">What is Your School Name?</option>\n");
      out.write("                                <option value=\"2que\">What is Your Birth Place?</option>\n");
      out.write("                                <option value=\"3que\">What is Your School Tifin Color?</option>\n");
      out.write("                            </select>\n");
      out.write("                            <input class=\"input100\" type=\"text\" name=\"ans\" placeholder=\"Enter your answer\">\n");
      out.write("                            <span class=\"focus-input100\"></span>\n");
      out.write("                        </div>\n");
      out.write("                        \n");
      out.write("                        <div class=\"flex-sb-m w-full p-b-30\">\n");
      out.write("                            <div class=\"contact100-form-checkbox\">\n");
      out.write("                                <input class=\"input-checkbox100\" id=\"ckb1\" type=\"checkbox\" name=\"remember-me\">\n");
      out.write("                                <label class=\"label-checkbox100\" for=\"ckb1\">Remember me</label>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"container-login100-form-btn\">\n");
      out.write("                            <button class=\"login100-form-btn\">Sign Up</button>\n");
      out.write("                        </div>\n");
      out.write("                </form>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("<!--===============================================================================================-->\n");
      out.write("\t<script src=\"../vendor/jquery/jquery-3.2.1.min.js\"></script>\n");
      out.write("\t<!--===============================================================================================-->\n");
      out.write("\t<script src=\"../vendor/animsition/js/animsition.min.js\"></script>\n");
      out.write("\t<!--===============================================================================================-->\n");
      out.write("\t<script src=\"../vendor/bootstrap/js/popper.js\"></script>\n");
      out.write("\t<script src=\"../vendor/bootstrap/js/bootstrap.min.js\"></script>\n");
      out.write("\t<!--===============================================================================================-->\n");
      out.write("\t<script src=\"../vendor/select2/select2.min.js\"></script>\n");
      out.write("\t<!--===============================================================================================-->\n");
      out.write("\t<script src=\"../vendor/daterangepicker/moment.min.js\"></script>\n");
      out.write("\t<script src=\"../vendor/daterangepicker/daterangepicker.js\"></script>\n");
      out.write("\t<!--===============================================================================================-->\n");
      out.write("\t<script src=\"../vendor/countdowntime/countdowntime.js\"></script>\n");
      out.write("\t<!--===============================================================================================-->\n");
      out.write("\t<script src=\"../js/main.js\"></script>\n");
      out.write("\n");
      out.write("</body>\n");
      out.write("\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
