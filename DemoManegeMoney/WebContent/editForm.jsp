<!DOCTYPE html>
<html>
<head>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Edit form</title>
</head>
<style>
	#Id{
 
  width:200px;
  margin-left:40px;
  margin: 0 0 0 137px;
}
#loai_tc{
  
  width:205px;
  margin :0 0 0 63px;
}

#ten_tc{
  color:blue;
   width:200px;
 margin:0 0 0 20px;
  

}
#number{
  width:200px;
   margin:0 0 0 40px;
  
}
#mo_ta{
  width:198px;
  margin:0 0 0 164px;
}
#mota{margin:0 0 0 -320px;}

#submit{
margin:0 0 0 130px
}

</style>
<body>
	<%
	    String username = (String)session.getAttribute("username"); 
		String id = request.getParameter("id");
		
		if (username == null || username.length() == 0) {
		    out.print("I see! You don't have a name.. well.. Hello no name");   
		} else {
		%>
		   <center>
				<h2>Sửa thông tin các khoản thu chi</h2>
				<form method="post" action="EditServlet">
					ID:
					<input type="number" readonly="true"  name="id_tc" id="Id" value=<%=id%> />
					<br/>
					<br/>
					Loại Thu/Chi:
					<select name="loai_tc" id="loai_tc">
						<option value="thu">thu</option>
						<option value="chi">chi</option>
					</select>
					<br/> <br/> 
					Tên Khoản Thu Chi: 
					<input type="text" name="ten_tc"  id="ten_tc">
					<br/><br/>
					 Số Tiền Thu Chi:
					 <input type="number" name="so_tien" id="number">
					 <br/><br/>
					<a id="mota">Mô tả:</a>
						<br/><textarea rows="6" cols="50" id="mo_ta">

						</textarea><br/><br/>
				<a id="submit"><input type="submit" name="edit_submit" value="Submit"></a>
				</form>
			</center>
		 <%} %>
</body>
</html>