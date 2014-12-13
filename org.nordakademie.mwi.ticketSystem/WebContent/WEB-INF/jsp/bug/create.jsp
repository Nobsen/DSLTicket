<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<%@include file="../navigation.jspf"%>

<div class="container">
	<h1>Fehler anlegen</h1>
	
	<c:url var="url" value="/bug/create" /> 
	<form:form action="${url}" commandName="bug" class="form-horizontal" role="form">
	   <form:hidden path="id"/>
	   <form:errors path="titel" class="col-sm-offset-2 text-danger" element="div"></form:errors>
	   <div class="form-group">
	       <label for="title" class="control-label col-sm-2">Titel:</label>
	       <div class="col-sm-6">
	       	<div class="required-field-block">				   	    
	       		<form:input class="form-control" path="titel" />
	           	<div class="required-icon">
	           		<div class="text">*</div>
	           	</div>
	           </div>
	       </div>
	   </div>
	   <form:errors path="description" class="col-sm-offset-2 text-danger" element="div"></form:errors>
	   <div class="form-group">
	       <label for="title" class="control-label col-sm-2">Beschreibung:</label>
	       <div class="col-sm-6">
	       	<div class="required-field-block">				   	    
	       		<form:input class="form-control" path="description" />
	           	<div class="required-icon">
	           		<div class="text">*</div>
	           	</div>
	           </div>
	       </div>
	   </div>
	   <form:errors path="categorie" class="col-sm-offset-2 text-danger" element="div"></form:errors>
	   <div class="form-group">
	       <label for="title" class="control-label col-sm-2">Kategorie:</label>
	       <div class="col-sm-6">
	       	<div >				   	    
	       		<form:select class="form-control" path="categorie" items="${categorieEnumValues}" itemLabel="label" />
	           </div>
	       </div>
	   </div>
	   <form:errors path="creator" class="col-sm-offset-2 text-danger" element="div"></form:errors>
	   <div class="form-group">
	       <label for="title" class="control-label col-sm-2">Ersteller:</label>
	       <div class="col-sm-6">
	       	<div class="required-field-block">				   	    
	       		<form:input class="form-control" path="creator" />
	           	<div class="required-icon">
	           		<div class="text">*</div>
	           	</div>
	           </div>
	       </div>
	   </div>
	   <form:errors path="expectedResolutionDate" class="col-sm-offset-2 text-danger" element="div"></form:errors>
	   <div class="form-group">
	       <label for="title" class="control-label col-sm-2">Erw. Lösungsdatum:</label>
	       <div class="col-sm-6">
	       	<div class="required-field-block">				   	    
	       		<form:input class="form-control datepicker" path="expectedResolutionDate" />
	           	<div class="required-icon">
	           		<div class="text">*</div>
	           	</div>
	           </div>
	       </div>
	   </div>
	   <form:errors path="expectedEffortInHours" class="col-sm-offset-2 text-danger" element="div"></form:errors>
	   <div class="form-group">
	       <label for="title" class="control-label col-sm-2">Erw. Aufwand in Std.:</label>
	       <div class="col-sm-6">
	       	<div >				   	    
	       		<form:input class="form-control" path="expectedEffortInHours" />
	           </div>
	       </div>
	   </div>
	   <form:errors path="operatingSystem" class="col-sm-offset-2 text-danger" element="div"></form:errors>
	   <div class="form-group">
	       <label for="title" class="control-label col-sm-2">Betriebssystem:</label>
	       <div class="col-sm-6">
	       	<div >				   	    
	       		<form:select class="form-control" path="operatingSystem" items="${operatingSystemEnumValues}" itemLabel="label" />
	           </div>
	       </div>
	   </div>
	   <form:errors path="noOfCalls" class="col-sm-offset-2 text-danger" element="div"></form:errors>
	   <div class="form-group">
	       <label for="title" class="control-label col-sm-2">Anzahl Anrufe:</label>
	       <div class="col-sm-6">
	       	<div >				   	    
	       		<form:input class="form-control" path="noOfCalls" />
	           </div>
	       </div>
	   </div>
	   <form:errors path="phoneNo" class="col-sm-offset-2 text-danger" element="div"></form:errors>
	   <div class="form-group">
	       <label for="title" class="control-label col-sm-2">Telefonnr.:</label>
	       <div class="col-sm-6">
	       	<div >				   	    
	       		<form:input class="form-control" path="phoneNo" />
	           </div>
	       </div>
	   </div>
	   <form:errors path="eMail" class="col-sm-offset-2 text-danger" element="div"></form:errors>
	   <div class="form-group">
	       <label for="title" class="control-label col-sm-2">E-Mail:</label>
	       <div class="col-sm-6">
	       	<div >				   	    
	       		<form:input class="form-control" path="eMail" />
	           </div>
	       </div>
	   </div>
	   <form:errors path="solveDate" class="col-sm-offset-2 text-danger" element="div"></form:errors>
	   <div class="form-group">
	       <label for="title" class="control-label col-sm-2">Abschlusszeitpunkt:</label>
	       <div class="col-sm-6">
	       	<div >				   	    
	       		<form:input class="form-control datetimepicker" path="solveDate" />
	           </div>
	       </div>
	   </div>
	   <div class="form-group"> 
	   	<label for="title" class="control-label col-sm-2">Aktueller Status:</label>
	   	<div class="col-sm-6">
	   	 	<form:select class="form-control" path="currentFlowState" items="${states}" itemLabel="label" />
	   	</div>
	   </div>
	    <div class="form-group"> 
	        <div class="col-sm-offset-2 col-sm-10">
	            <button type="submit" class="btn btn-default">Speichern</button>
	        </div>
	    </div>
    </form:form>
</div>
