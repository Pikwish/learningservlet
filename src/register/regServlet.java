package register;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Date;

public class regServlet extends HttpServlet {




    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response){

    }



    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response){
        User u = new User();
        u.setUsername(request.getParameter("username"));
        u.setPassword(request.getParameter("passwd"));
        u.setEmail(request.getParameter("email"));
        u.setGender(request.getParameter("gender"));



    }



}
