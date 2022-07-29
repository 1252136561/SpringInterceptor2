<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>

  <meta http-equiv="Content-Type" content="text/html; charset=utf-8">

  <title>登录页</title>
  <link rel="stylesheet" type="text/css" href="static/css/dengluCss.css">
</head>
<body>
<center><div class="head"><h1>注册界面</h1></div></center>

<div class="box">

  <form action="${pageContext.request.contextPath}/demo/zhucee" method="post">

    <div class="inputlabel">
      <label for="user">账号</label>

      <input type="text" class="form-control" id="user" name="user" placeholder="User">
    </div>

    <div class="inputlabel">
      <label for="password">密码</label>
      <input type="password" class="form-control" id="password" name="pass" placeholder="Password">
    </div>

    <div class="inputlabel">
      <label for="repassword">确认密码</label>
      <input type="password" class="form-control inputlabel2" id="repassword" placeholder="rePassword" >
    </div>



    <div class="inputlabel">
      <label for="exampleInputFile" class="inputlabel">头像上传</label>
      <input type="file" id="exampleInputFile" class="inputlabel">
    </div>
    <div class="btloaction ">
      <button type="submit" class="bt ">确定</button>
      <button class="bt " ><a href="denglu.jsp" class="a">返回</a></button>
    </div>
  </form>
</div>
</body>
</html>
