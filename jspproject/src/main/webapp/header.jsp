<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>

<h1> 헤더 부분입니다. </h1>

<%!
int pageCount = 0;
void addCount(){
	pageCount++;
}%>

<%
addCount();
%>

<p> 이 사이트의 방문은 <%= pageCount %> 번째 입니다. </p>

</body>
</html>