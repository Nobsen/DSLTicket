<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<%@include file="../navigation.jspf"%>
<div class="container">
	<h1>Urlaubsantrag anzeigen</h1>
	
	<div class="form-horizontal">
	   <div class="form-group">
	       <label for="title" class="control-label col-sm-2">Beschreibung:</label>
	       <div class="col-sm-6">
	       	<span class="form-control" disabled="true">${holidayRequest.getDescription()}</span>
	       </div>
	   </div>
	   <div class="form-group">
	       <label for="title" class="control-label col-sm-2">Von Datum:</label>
	       <div class="col-sm-6">
	       	<span class="form-control" disabled="true"><fmt:formatDate pattern="dd.MM.yyyy HH:mm" value="${holidayRequest.getDateFrom().time}"/></span>
	       </div>
	   </div>
	   <div class="form-group">
	       <label for="title" class="control-label col-sm-2">Bis Datum:</label>
	       <div class="col-sm-6">
	       	<span class="form-control" disabled="true"><fmt:formatDate pattern="dd.MM.yyyy HH:mm" value="${holidayRequest.getDateUntil().time}"/></span>
	       </div>
	   </div>
	   <div class="form-group">
	       <label for="title" class="control-label col-sm-2">Ersteller:</label>
	       <div class="col-sm-6">
	       	<span class="form-control" disabled="true">${holidayRequest.getCreator()}</span>
	       </div>
	   </div>
	   <div class="form-group">
	       <label for="title" class="control-label col-sm-2">Telefonnr.:</label>
	       <div class="col-sm-6">
	       	<span class="form-control" disabled="true">${holidayRequest.getPhoneNo()}</span>
	       </div>
	   </div>
	   <div class="form-group">
	       <label for="title" class="control-label col-sm-2">E-Mail:</label>
	       <div class="col-sm-6">
	       	<span class="form-control" disabled="true">${holidayRequest.getEMail()}</span>
	       </div>
	   </div>
	   <div class="form-group"> 
	   	<label for="title" class="control-label col-sm-2">Aktueller Status:</label>
	   	<div class="col-sm-6">
	   		<span class="form-control" disabled="true">${holidayRequest.currentFlowState.label}</span>
	   	</div>
	   </div>
	   <div class="btn-group col-sm-offset-2"> 
	        <c:url var="editUrl" value="/holidayrequest/edit">
		        <c:param name="id" value="${holidayRequest.id}" />
		    </c:url>
	        <div class="btn">
		        <a class="btn btn-default" href='<c:out value="${editUrl}"/>'>Bearbeiten</a>
		    </div>
	        <c:url var="deleteUrl" value="/holidayrequest/delete">
	            <c:param name="id" value="${holidayRequest.id}" />
	        </c:url>
	        <form:form action="${deleteUrl}" class="btn">
	           <button type="submit" class="btn btn-default">Löschen</button>
	        </form:form>
	        <c:url var="prevStateUrl" value="/holidayrequest/prevState" >
	            <c:param name="id" value="${holidayRequest.id}" />
	        </c:url>
	        <form:form action="${prevStateUrl}" class="btn">
	            <button type="submit" class="btn btn-default"<c:if test="${holidayRequest.currentFlowState.isFirst()}" >disabled="true"</c:if>>Vorheriger Status</button>
	        </form:form>
	        <c:url var="nextStateUrl" value="/holidayrequest/nextState" >
	            <c:param name="id" value="${holidayRequest.id}" />
	        </c:url>
	        <form:form action="${nextStateUrl}" class="btn">
	            <button type="submit" class="btn btn-default" <c:if test="${holidayRequest.currentFlowState.isLast()}" >disabled="true"</c:if>>Nächster Status</button>
	        </form:form>
	    </div>
    </div>
</div>
