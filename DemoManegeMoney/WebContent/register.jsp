<!DOCTYPE html>
<html>
	<%@page contentType="text/html" pageEncoding="UTF-8"%>
	
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Register</title>
        <script language="javascript"> 
         function validate()
         {
           
           var user_name= /^[a-z A-Z]+$/; //pattern allowed alphabet a-z or A-Z 
           var password_valid=/^[A-Z a-z 0-9]{6,12}$/; //pattern password allowed A to Z, a to z, 0-9 and 6 to 12 range
            
         
           var username = document.getElementById("uname"); //textbox id email
           var password = document.getElementById("password"); //textbox id password
    
          
           if(!user_name.test(uname.value) || uname.value=='') //apply if condition using test() method match the parameter for pattern allow alphabet only
           {
              alert("Enter Username Alphabet Only....!"); //alert message
              uname.focus();
              uname.style.background = '#f08080'; //set textbox color
              return false;                    
           }
           if(!password_valid.test(password.value) || password.value=='') //apply if condition using test() method match the parameter for pattern passoword allow 6 to 12 range 
           {
              alert("Password Must Be 6 to 12 character"); //alert message
              password.focus();
              password.style.background = '#f08080'; //set textbox color
              return false;                    
           }
        }  
      </script>
    </head>
    <body>
        
        <center>
            
            <h2>Register</h2>
            
            <form method="post" action="RegisterControll" onsubmit="return validate();">
                
               
                Username    <input type="text" name="username" id="username"></br></br>
                Password    <input type="password" name="password" id="password"></br></br>
                
                <input type="submit" name="btn_register" value="Register">
                
                <h3>You have a account? <a href="index.jsp">Login</a></h3>
                
            </form>
            
            <h3 style="color:red">
               
            </h3>
            
        </center>
    
    </body>
    
</html>
