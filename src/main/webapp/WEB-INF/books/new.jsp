<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%> 
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>New Book</h1>
	<form:form action="/books" method="post" modelAttribute="book">
	    <p>
            <form:label path="title">Title</form:label>
            <form:input path="title"/>
            <form:errors path="title"/>
        </p>
        <p>
            <form:label path="description">Description</form:label>
            <form:textarea path="description"/>
            <form:errors path="description"/>
        </p>
        <p>
            <form:label path="language">Language</form:label>
            <form:input path="language"/>
            <form:errors path="language"/>
        </p>
        <p>
            <form:label path="numberOfPages">Pages</form:label>
            <form:input type="number" path="numberOfPages"/>
            <form:errors path="numberOfPages"/>     
        </p>   
	    <input type="submit" value="Submit"/>
	</form:form>    
</body>
</html>