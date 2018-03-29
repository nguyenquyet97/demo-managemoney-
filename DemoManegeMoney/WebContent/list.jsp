<!DOCTYPE html>
<html>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<head>
<style>
table {
	font-family: arial, sans-serif;
	border-collapse: collapse;
	width: 80%;
	height: 90px;
}

td, th {
	border: 2px solid #dddddd;
	text-align: left;
	padding: 10;
}

tr:nth-child(even) {
	background-color: #dddddd;
}
a {
	background-color: #dddddd;		
	
	
	
}
</style>

</head>
<body>

	<%@ page import="java.sql.ResultSet"%>
	<%@ page import="java.sql.Statement"%>
	<%@ page import="java.sql.Connection"%>
	<%@ page import="java.sql.DriverManager"%>
	<center>
		<form method="post" action="ManageControll">

			<table border="1">
				<tr>
					<td>ID</td>
					<td>Loại Thu/Chi</td>
					<td>Ten Khoản Thu/Chi</td>
					<td>Số Tiền Thu/Chi</td>
					
					<td>Action</td>
					<td>Action</td>
					<td>Action</td>
					
					

			
				</tr>
					<h1>List thu chi</h1>
					<h2><a href="thongke.jsp">Thong ke</a></h2>
	              <a href="addnew.jsp">add new</a>
	
	
				
				
				

				<%
   try
   {
       Class.forName("com.mysql.jdbc.Driver");
       String url="jdbc:mysql://localhost:3306/managemomey";
       String userName="root";
       String password="1234";
       String query="select * from manage";
       
       Connection conn=DriverManager.getConnection(url, userName, password);
       Statement stmt=conn.createStatement();
       ResultSet rs=stmt.executeQuery(query);
       while(rs.next())
    	   
       {
   %>
				<tr>
					<td>
						<%out.println(rs.getInt("id")); %>
					</td>
					<td>
						<%out.println(rs.getString("loai_tc")); %>
					</td>
					<td>
						<%out.println(rs.getString("ten_tc")); %>
					</td>
					<td>
						<%out.println(rs.getInt("st_tc")); %>
					</td>
					<td><a href="editForm.jsp?id=<%=rs.getString(1)%>">Sửa</a></td>
					<td><a href="Del?id=<%=rs.getString(1)%>">Xóa</a></td>
					<td><a href="Del?id=<%=rs.getString(1)%>">Chi Tiết</a></td>
				</tr>
				<%
       }
   %>
			</table>
			<%
        rs.close();
        stmt.close();
        conn.close();
   }
   catch(Exception e)
   {
        e.printStackTrace();
   }
   
   %>
		</form>
		
	</center>
</body>
</html>