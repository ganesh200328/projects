<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%! 
int x,y;
%>

<%
x=Integer.parseInt(request.getParameter("x"));
y=Integer.parseInt(request.getParameter("y"));
%>
<%!
int add(int a,int b){
	return a+b;
}
%>

<%!
int Sub(int a,int b){
	return a-b;
}
%>

<%!
int Mul(int a,int b){
	return a*b;
}
%>

<%!
int div(int a,int b){
	return a/b;
}
%>

<table border=1>
<thead>
	<tr>
		<th>Addition</th>
		<th>Subtraction</th>
		<th>Multiplication</th>
		<th>Division</th>
	</tr>
</thead>
<tbody>
	<tr>
		<td> <%out.println(add(x,y));%> </td>
		<td> <%out.println(Sub(x,y));%> </td>	
		<td> <%out.println(Mul(x,y));%> </td>
		<td> <%out.println(div(x,y));%> </td>
	</tr>
</tbody>

</table>
</body>
</html>