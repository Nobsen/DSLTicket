<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<%@include file="../navigation.jspf"%>
<div class="container">
	<h1>Fehler</h1>
	<table class="table table-striped">
		<thead>
			<tr>
				<th>ID</th>
				<th>Status</th>
				<th>Titel</th>
				<th>Beschreibung</th>
				<th>Kategorie</th>
				<th>Erw. Lösungsdatum</th>
				<th />
			</tr>
		</thead>
		<tbody>
			<c:forEach var="bug" items="${bugs}" varStatus="status">
			    <tr>
			        <c:url var="showUrl" value="/bug/show">
			            <c:param name="id" value="${bug.id}" />
			        </c:url>
					<td>${bug.id}</td>
					<td>${bug.currentFlowState.label}</td>
					<td>${bug.getTitel()}</td>
					<td>${bug.getDescription()}</td>
					<td>${bug.getCategorie().getLabel()}</td>
					<td><fmt:formatDate pattern="dd.MM.yyyy" value="${bug.getExpectedResolutionDate().time}"/></td>
					<td>
					    <a class="btn btn-default btn-xs" href='<c:out value="${showUrl}"/>'>Anzeigen</a>
					</td>
			    </tr>
			</c:forEach>
		</tbody>
	</table>
	
	<c:url var="createUrl" value="/bug/create" />
	<div>
	    <a class="btn btn-default" href='<c:out value="${createUrl}"/>'>Anlegen</a>
	</div>
</div>
