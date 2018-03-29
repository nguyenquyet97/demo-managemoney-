<%
    if(session.getAttribute("login")!=null)
    {
        response.sendRedirect("welcome.jsp"); //session login user not back to index.jsp page or not type direct in url
    }
%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login</title>
       
    </head>
    <body>
        
        <center>
            
            <h2>Login</h2>
            
            <form method="post" action="LoginControll" name="LoginForm" onsubmit="return validate();">
                
                Username    :<input type="text" name="txt_username">
                Password    :<input type="password" name="txt_password">
                
                <input type="submit" name="btn_login" value="Login">
                
                
                <h1>you don't have accuont <a href="register.jsp">register now</a></h1>
            </form>
        
                
        </center>
    
    </body>
</html>