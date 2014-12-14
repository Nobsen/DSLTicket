<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<%@include file="../navigation.jspf"%>
<div class="container">
	<h1>Fehler anzeigen</h1>
	
	<div class="form-horizontal">
		<div class="form-group">
	   	    <label for="title" class="control-label col-sm-2">Erstellt:</label>
	   	    <div class="col-sm-6">
   	    		<span class="form-control" disabled="true"><fmt:formatDate pattern="dd.MM.yyyy HH:mm" value="${bug.getCreated().time}"/></span>
	   	    </div>
	   	</div>
	   <div class="form-group">
	       <label for="title" class="control-label col-sm-2">Titel:</label>
	       <div class="col-sm-6">
	       	<span class="form-control" disabled="true">${bug.getTitel()}</span>
	       </div>
	   </div>
	   <div class="form-group">
	       <label for="title" class="control-label col-sm-2">Beschreibung:</label>
	       <div class="col-sm-6">
	       	<span class="form-control" disabled="true">${bug.getDescription()}</span>
	       </div>
	   </div>
	   <div class="form-group">
	       <label for="title" class="control-label col-sm-2">Kategorie:</label>
	       <div class="col-sm-6">
	       	<span class="form-control" disabled="true">${bug.getCategorie().getLabel()}</span>
	       </div>
	   </div>
	   <div class="form-group">
	       <label for="title" class="control-label col-sm-2">Ersteller:</label>
	       <div class="col-sm-6">
	       	<span class="form-control" disabled="true">${bug.getCreator()}</span>
	       </div>
	   </div>
	   <div class="form-group">
	       <label for="title" class="control-label col-sm-2">Erw. Lösungsdatum:</label>
	       <div class="col-sm-6">
	       	<span class="form-control" disabled="true"><fmt:formatDate pattern="dd.MM.yyyy" value="${bug.getExpectedResolutionDate().time}"/></span>
	       </div>
	   </div>
	   <div class="form-group">
	       <label for="title" class="control-label col-sm-2">Erw. Aufwand in Std.:</label>
	       <div class="col-sm-6">
	       	<span class="form-control" disabled="true">${bug.getExpectedEffortInHours()}</span>
	       </div>
	   </div>
	   <div class="form-group">
	       <label for="title" class="control-label col-sm-2">Betriebssystem:</label>
	       <div class="col-sm-6">
	       	<span class="form-control" disabled="true">${bug.getOperatingSystem().getLabel()}</span>
	       </div>
	   </div>
	   <div class="form-group">
	       <label for="title" class="control-label col-sm-2">Anzahl Anrufe:</label>
	       <div class="col-sm-6">
	       	<span class="form-control" disabled="true">${bug.getNoOfCalls()}</span>
	       </div>
	   </div>
	   <div class="form-group">
	       <label for="title" class="control-label col-sm-2">Telefonnr.:</label>
	       <div class="col-sm-6">
	       	<span class="form-control" disabled="true">${bug.getPhoneNo()}</span>
	       </div>
	   </div>
	   <div class="form-group">
	       <label for="title" class="control-label col-sm-2">E-Mail:</label>
	       <div class="col-sm-6">
	       	<span class="form-control" disabled="true">${bug.getEMail()}</span>
	       </div>
	   </div>
	   <div class="form-group">
	       <label for="title" class="control-label col-sm-2">Abschlusszeitpunkt:</label>
	       <div class="col-sm-6">
	       	<span class="form-control" disabled="true"><fmt:formatDate pattern="dd.MM.yyyy HH:mm" value="${bug.getSolveDate().time}"/></span>
	       </div>
	   </div>
	   <div class="form-group"> 
	   	<label for="title" class="control-label col-sm-2">Aktueller Status:</label>
	   	<div class="col-sm-6">
	   		<span class="form-control" disabled="true">${bug.currentFlowState.label}</span>
	   	</div>
	   </div>
	   <div class="btn-group col-sm-offset-2"> 
	        <c:url var="editUrl" value="/bug/edit">
		        <c:param name="id" value="${bug.id}" />
		    </c:url>
	        <div class="btn">
		        <a class="btn btn-default" href='<c:out value="${editUrl}"/>'>Bearbeiten</a>
		    </div>
	        <c:url var="deleteUrl" value="/bug/delete">
	            <c:param name="id" value="${bug.id}" />
	        </c:url>
	        <form:form action="${deleteUrl}" class="btn">
	           <button type="submit" class="btn btn-default">Löschen</button>
	        </form:form>
	        <c:url var="prevStateUrl" value="/bug/prevState" >
	            <c:param name="id" value="${bug.id}" />
	        </c:url>
	        <form:form action="${prevStateUrl}" class="btn">
	            <button type="submit" class="btn btn-default"<c:if test="${bug.currentFlowState.isFirst()}" >disabled="true"</c:if>>Vorheriger Status</button>
	        </form:form>
	        <c:url var="nextStateUrl" value="/bug/nextState" >
	            <c:param name="id" value="${bug.id}" />
	        </c:url>
	        <form:form action="${nextStateUrl}" class="btn">
	            <button type="submit" class="btn btn-default" <c:if test="${bug.currentFlowState.isLast()}" >disabled="true"</c:if>>Nächster Status</button>
	        </form:form>
	    </div>
    </div>
</div>
