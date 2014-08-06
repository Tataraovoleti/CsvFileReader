<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.*,com.java.fazalcode.bean.Customer" %>
<% response.addHeader("Content-Disposition","attachment;filename=title.doc"); %>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<%  ArrayList<Customer> al=(ArrayList<Customer>)session.getAttribute("customer");
%>
 <table>
  <tr style="background-color: orange; color:white;">
	  <td>Id</td><td>Name</td><td>Email</td><td>Phone</td><td>City</td>
  </tr>	  
<%
 for(Customer cust:al){  %>
	 <tr>
	  <td><%= cust.getCustomerid() %></td>
	  <td><%= cust.getCustomername() %></td>
	  <td><%= cust.getEmail() %></td>
	  <td><%= cust.getPhone() %></td>
	  <td><%= cust.getCity() %></td>
	  </tr>
 <%
 }
%>
</table>

</body>
</html>