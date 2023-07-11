<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>

	<c:out value="JSTL Core 태그 라이브러리" />

<table>
<tr>
  <th>Value</th>
  <th>Square</th>
</tr>
<c:forEach var="x" begin="0" end="10" step="2">
<tr>
  <td><c:out value="${x}"/></td>
  <td><c:out value="${x * x}"/></td>
</tr>
</c:forEach>
</table>

<h1> 푸터 부분입니다.</h1>
<footer>
<h2> &copy; Copyright All right Reserved </h2>
</footer>

</body>

</html>