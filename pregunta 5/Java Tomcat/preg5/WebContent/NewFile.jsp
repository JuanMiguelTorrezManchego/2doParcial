<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
int a = 0;
int b = 1;
int c;
String r ="0 , 1";
for  (int i = 0 ; i < 20 ; i++ ){
	c= a+b;
	r= r+ ", "+c;
	a=b;
	b=c;
}
out.println("FIBONACCI");
out.print(r);

%>

</body>
</html>