<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

<ul>
	<c:forEach items="${list}" var="vo" >
	<li>${vo.bno} <a href="${vo.bno}">${vo.title}</a> ${vo.writer} ${vo.regdate} </li>
	</c:forEach>
</ul>

</body>
</html>