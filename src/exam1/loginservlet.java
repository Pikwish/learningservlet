package exam1;

import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class loginservlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response){
        User u = new User();
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        u.setUsername(username);
        u.setPassword(password);
        if (u.getUsername().equals("admin") & u.getPassword().equals("admin")){


        }

    }

}
