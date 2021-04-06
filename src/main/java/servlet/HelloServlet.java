package servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(
        name = "MyServlet", 
        urlPatterns = {"/sv1"}
    )
public class HelloServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        ServletOutputStream out = resp.getOutputStream();
        String name=request.getParameter("name");
       String services[]=request.getParameter("name");
       StringBuffer serv=new StringBuffer();
        HttpsSession ses=request.getSession(true);
       int amount=0;
      for(int i=0;i<services.length;i++){
        serv.append(services[i]);
       switch(services[i]){
        case "Color":
        amount+=250;
        break;
        case "Hair-Cut":
        amount+=300;
        break;
        case "Head Massage":
        amount+=450;
        break;
        case "Hair-Painting":
        amount+=550;
        break;
    }
}
ses.putValue("name",name);
ses.putValue("amount",name);
ses.putValue("services",serv.toString());
out.println("<html>");
out.println("<body>");
out.println("<form action='sv2.java' method='GET'>");
out.println("Select Your Discount Coupon");
out.println("<select name='disc'>");
out.println("<option value='10'>10%</option>");
out.println("<option value='20'>20%</option>");
out.println("<option value='30'>30%</option>");
out.println("</select>");
out.println("<input type='submit' value='proceed'>");
out.println("<form>");
out.println("</body>");
out.println("</html>");
    }
    
}
