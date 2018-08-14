<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/08/14
  Time: 17:27
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>First Servlet</title>
  </head>
  <body>
  <a href="/servlet/HelloServlet">点击通过Get请求</a>

  <form action="/servlet/HelloServlet" method="post">
    <p>name: <input type="text" name="name"></p>
    <p><input type="submit" value="提交使用Post请求"></p>
  </form>

  

  </body>
</html>
