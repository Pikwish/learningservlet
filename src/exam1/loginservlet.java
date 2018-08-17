package exam1;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class loginservlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException,ServletException {
        User u = new User();
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        u.setUsername(username);
        u.setPassword(password);
        if (u.getUsername().equals("admin") & u.getPassword().equals("admin")){
            response.sendRedirect(request.getContextPath()+"/scripts/login_success.jsp");
        }

    }

}
