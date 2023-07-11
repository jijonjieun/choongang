<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>main</h1>
	${mame }
	<br> JSTL / EL
	<br>
	<c:forEach begin="1" end="10" var="i">
		<c:choose>
		<c:when test="${i eq 3 }">
		삼입니다.<br>
		</c:when>
		<c:otherwise>
		${i }<br>
		</c:otherwise>
		</c:choose>
		
	</c:forEach>

<c:set var="k" value= "케이"/>
<c:set var="k">새로운값</c:set>
${k }
<br>
out = ${var } <br>
아래출력돼?
<c:out value="글자"></c:out>
밸류뒤에 ${k }이걸 사용해야 변수에 저장된 값이 나옴
out문을 사용해야 나중에 오류가 안뜬대

<hr>
${list }
<br>
<c:forEach items="${list }" var="i">
${i }<br>
</c:forEach>
</body>
</html>