<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="java.sql.*,javax.sql.*,javax.naming.*" %>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>测试JNDI</title>
</head>
<body>
	<%
	 	Connection connection = null;
		try{
			 
			Context ctx = new InitialContext();
			DataSource ds = (DataSource)ctx.lookup("java:comp/env/mysqlDataSource");
			System.out.println("cehi:"+ds);
			connection = ds.getConnection();
			
			} catch (NamingException e) {
			      System.out.println(e.getMessage());
			} catch (SQLException e) {
			       e.printStackTrace();
			       System.out.println(e.getMessage());
			 } finally {
			      if(connection!=null){
			    	  connection.close();
			      } 
				 
			 }
		
	
	%>
</body>
</html>