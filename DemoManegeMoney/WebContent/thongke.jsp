<!DOCTYPE html>
<%@page import="com.mysql.fabric.xmlrpc.base.Value"%>
<html>
<head>
<style>
h2{
 color: black;
}
table {
    font-family: arial, sans-serif;
    border-collapse: collapse;
    width: 100%;
    color: black;
}
td, th {
    border: 1px solid #dddddd;
    text-align: left;
    padding: 8px;
}

tr:nth-child(even) {
    background-color: #dddddd;
}
</style>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
</head>
<body>
<%@ page import="java.sql.ResultSet"%>
	<%@ page import="java.sql.Statement"%>
	<%@ page import="java.sql.Connection"%>
	<%@ page import="java.sql.DriverManager"%>
	
	
<center>
<h2>Thong ke thu chi</h2>
<table>
  <tr>
    <th>id</th>
    <th>loai_tc</th>
    <th>ten_tc</th>
    <th>so tien</th>
    <th>ngay tao</th>
    <th >nguoi tao</th>
    <th>ngay sua</th>
    <th>nguoi sua</th>
    <th>mo ta</th>
  </tr>
  <%
  Integer sum1 = 0;
  Integer sum2 = 0;
   try{
       Class.forName("com.mysql.jdbc.Driver");
       String url="jdbc:mysql://localhost:3306/managemomey";
       String username="root";
       String password="1234";
       String query="select * from manage"; 
       Connection conn=DriverManager.getConnection(url, username, password);
       Statement stmt=conn.createStatement();
       ResultSet rs=stmt.executeQuery(query);
       while(rs.next()){
    	   if(rs.getString("loai_tc").equals("thu")) sum1 += rs.getInt("st_tc");
    	   if(rs.getString("loai_tc").equals("chi")) sum2 += rs.getInt("st_tc");
    	  
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
					<td>
						<%out.println(rs.getDate("ngay_tao")); %>
					</td>
					
					
					<td>					
						<%out.println(rs.getString("nguoi_tao")); %>
					</td>
					<td>
						<%out.println(rs.getString("ngay_sua")); %>
					</td>
					<td>
						<%out.println(rs.getString("nguoi_sua")); %>
					</td>
					<td>
						<%out.println(rs.getString("mo_ta")); %>
					</td>

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
   catch(Exception e){
        e.printStackTrace();
   }   
  
   %>
</table>

</center>


<h3>Tong tien thu:<%=sum1%> USD</h3>
<h3>Tong tien chi:<%=sum2%>USD</h3>
</body>
</html>

