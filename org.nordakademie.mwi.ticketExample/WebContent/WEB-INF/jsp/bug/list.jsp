<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<%@include file="../navigation.jspf"%>

<h1>Bug list</h1>
<table>
	<thead>
		<tr>
			<th>ID</th>
			<th>Titel</th>
			<th>Beschreibung</th>
		</tr>
	</thead>
<c:forEach var="bug" items="${bugs}" varStatus="status">
    <tr>
        <c:url var="showUrl" value="/bug/show">
            <c:param name="id" value="${bug.id}" />
        </c:url>
		<td>${bug.id}</td>
    	<td>${bug.title}</td>
        <td>${bug.description}</td> 
    	<td>
            <a href='<c:out value="${showUrl}"/>'>Show</a>
        </td>
    </tr>
</c:forEach>
</table>

<c:url var="createUrl" value="/bug/create" />
<div><a href='<c:out value="${createUrl}"/>'>Create</a></div>