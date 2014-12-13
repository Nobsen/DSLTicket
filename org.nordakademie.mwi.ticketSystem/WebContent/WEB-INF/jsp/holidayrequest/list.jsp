<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<%@include file="../navigation.jspf"%>
<div class="container">
	<h1>Urlaubsantrag</h1>
	<table class="table table-striped">
		<thead>
			<tr>
				<th>ID</th>
				<th>Status</th>
				<th>Beschreibung</th>
				<th>Von Datum</th>
				<th>Bis Datum</th>
				<th>Ersteller</th>
				<th>Telefonnr.</th>
				<th>E-Mail</th>
				<th />
			</tr>
		</thead>
		<tbody>
			<c:forEach var="holidayRequest" items="${holidayRequests}" varStatus="status">
			    <tr>
			        <c:url var="showUrl" value="/holidayrequest/show">
			            <c:param name="id" value="${holidayRequest.id}" />
			        </c:url>
					<td>${holidayRequest.id}</td>
					<td>${holidayrequest.currentFlowState.label}</td>
					<td>${holidayRequest.getDescription()}</td>
					<td><fmt:formatDate pattern="dd.MM.yyyy HH:mm" value="${holidayRequest.getDateFrom().time}"/></td>
					<td><fmt:formatDate pattern="dd.MM.yyyy HH:mm" value="${holidayRequest.getDateUntil().time}"/></td>
					<td>${holidayRequest.getCreator()}</td>
					<td>${holidayRequest.getPhoneNo()}</td>
					<td>${holidayRequest.getEMail()}</td>
					<td>
					    <a class="btn btn-default btn-xs" href='<c:out value="${showUrl}"/>'>Anzeigen</a>
					</td>
			    </tr>
			</c:forEach>
		</tbody>
	</table>
	
	<c:url var="createUrl" value="/holidayrequest/create" />
	<div>
	    <a class="btn btn-default" href='<c:out value="${createUrl}"/>'>Anlegen</a>
	</div>
</div>
