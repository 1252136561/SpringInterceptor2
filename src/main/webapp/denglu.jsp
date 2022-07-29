<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>

    <meta http-equiv="Content-Type" content="text/html; charset=utf-8">

    <title>登录页</title>
    <link rel="stylesheet" type="text/css" href="static/css/dengluCss.css">
</head>
<body><center>
<div class="head"><h1>登录界面</h1></div></center>
<div class="box">


    <form action="${pageContext.request.contextPath}/demo/login" method="post">
        <div class="inputlabel">

            <label for="exampleInputEmail1">账号</label>

            <input type="text" class="form-control" id="exampleInputEmail1" placeholder="user" name="user">
        </div>

        <div class="inputlabel">

            <label for="exampleInputPassword1">密码</label>
            <input type="password" class="form-control" id="exampleInputPassword1" name="password" placeholder="Password">
        </div>

        <div class="btloaction ">
        <button type="submit" class="bt ">登录</button>
            <button class="bt "><a href="zhucee.jsp">注册</a></button>
        </div>
    </form>

    <%
        String err= (String)request.getAttribute("err");
        if(err != null){
            System.out.println(err);
    %>
    <script type="text/javascript" language="javascript">
        alert("<%=err%>");
    </script><%}%>
</div>
</body></html>