
<!DOCTYPE html>
<html>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>insert</title>


</head>
<style>

#loai_tc{
  color:red;
  width:200px;
  margin :0 0 0 63px;
}

#ten_tc{

   width:198px;
 margin:0 0 0 20px;
  

}
#so_tien{
  width:200px;
   margin:0 0 0 40px;
  
}
#mo_ta{
  width:200px;
  margin:0 0 0 220px;
}

{

 #mota{
 margin:0 0 0 500px;
 
 }
body{
  
  text-align:center;
}

</style>

<body>
		<%
	    String username = (String)session.getAttribute("username"); 
		String id = request.getParameter("id");
		
		if (username == null || username.length() == 0) {
		    out.print("you must login");   
		} else {
		%>

	<center>

		<h2>Thêm mới khoản thu chi</h2>

		<form method="post" action="ManageControll">

			Loại Thu/Chi 
			<select name="txt_type_TC" id="loai_tc">
				<option value="thu">thu</option>
				<option value="chi">chi</option>
			</select>
			<br> <br> 
			
			Tên Khoản Thu Chi <input type="text" name="txt_Ten_Khoan_TC" id="ten_tc">
			</br> </br> 		
				
			
			Số  Tiền Thu Chi <input type="number" name="number_sotien" id="so_tien">
			</br> </br> 
			Date<input type="date" name="ngay_tao"><br ><br/>
			Mô tả
			<br/>
			
			<textarea rows="6" cols="50" id="mo_ta" name="mo_ta">

			</textarea>
			
			
			<input type="submit"name="btn_submit" value="Submit">
			
			
			
		</form>

		

	</center>
	<%} %>

</body>

</html>
