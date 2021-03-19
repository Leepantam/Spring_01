<%@page import="com.leepantam.s1.member.MemberDTO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%
    MemberDTO mDto = (MemberDTO)request.getAttribute("dto");
 %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>Member Page</h1>
	<h1><%= mDto.getEmail() %></h1>
</body>
</html>