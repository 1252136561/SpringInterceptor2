<%--
  Created by IntelliJ IDEA.
  User: ASUS

  Date: 2022/7/28
  Time: 9:37
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>

<body>
<%
    String user = (String)request.getAttribute("user");
    String pass = (String)request.getAttribute("pass");
%>
<h1>账号${user}<%=user%>,密码${pass}</h1>
</body>
</html>
