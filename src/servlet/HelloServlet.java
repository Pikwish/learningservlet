package servlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class HelloServlet extends HttpServlet {


        @Override
        protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
            System.out.println("处理Get请求！");
            //设置返回的内容为html文档
            response.setContentType("text/html; charset = utf-8");
            PrintWriter out = response.getWriter();
            out.println("<h1>Hello,Servlet!</h1>");
            out.flush();
            out.close();
        }

        //用来接收传入的用户名

        private String name;
        public String getName() {
            return name;
        }
        public void setName(String name) {
            this.name = name;
        }




        @Override
        protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException,IOException {
            System.out.println("处理Post请求");
            response.setContentType("text/html; charset = utf-8");
            PrintWriter out = response.getWriter();
            setName(request.getParameter("name"));
            out.println("<h1>Hello"+getName()+"</h1>");
            out.flush();
            out.close();

        }
}
