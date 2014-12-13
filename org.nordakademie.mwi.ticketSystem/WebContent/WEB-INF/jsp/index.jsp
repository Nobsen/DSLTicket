<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<%@include file="navigation.jspf"%>

<div class="container">
	<h1>Übersicht</h1>

	<table class="table table-striped">
		<thead>
			<tr>
				<th>Kategorie</th>
				<th>Anzahl</th>
			</tr>
		</thead>
		<tbody>
			<tr>
				<c:url var="bugUrl" value="/bug/list" />
				<td><a href='<c:out value="${bugUrl}"/>'>Fehler</a></td>
				<td>${bugCount}</td>
			</tr>
			<tr>
				<c:url var="holidayRequestUrl" value="/holidayrequest/list" />
				<td><a href='<c:out value="${holidayRequestUrl}"/>'>Urlaubsantrag</a></td>
				<td>${holidayRequestCount}</td>
			</tr>
		</tbody>
	</table>
</div>
