package org.nordakademie.mwi.tickets.generator

import org.nordakademie.mwi.tickets.tickets.TicketCategory
import java.util.Collection
import org.nordakademie.mwi.tickets.tickets.FieldType

class JspGenerator {

	def static toCreateJsp(TicketCategory category, boolean isCreate) {
		'''
			<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
			<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
			<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
			
			<%@include file="../navigation.jspf"%>
			
			<div class="container">
				<h1>«category.description» «IF isCreate»anlegen«ELSE»bearbeiten«ENDIF»</h1>
				
				<c:url var="url" value="/«category.name.toLowerCase»/«IF isCreate»create«ELSE»edit«ENDIF»" /> 
				<form:form action="${url}" commandName="«category.name.toFirstLower»" class="form-horizontal" role="form">
				   <form:hidden path="id"/>
				   «FOR field : category.ticketFields»
				   	<form:errors path="«field.field.name.toFirstLower»" class="col-sm-offset-2 text-danger" element="div"></form:errors>
				   	<div class="form-group">
				   	    <label for="title" class="control-label col-sm-2">«field.field.label»:</label>
				   	    <div class="col-sm-6">
				   	    	<div «IF field.mandatory»class="required-field-block"«ENDIF»>				   	    
				   	    		«IF field.field.fieldType == FieldType.DATE»
				   	    			<form:input class="form-control datepicker" path="«field.field.name.toFirstLower»" />
				   	    		«ELSEIF field.field.fieldType == FieldType.DATE_TIME»
				   	    			<form:input class="form-control datetimepicker" path="«field.field.name.toFirstLower»" />
				   	    		«ELSEIF field.field.fieldType == FieldType.BOOLEAN»
				   	    			<form:checkbox path="«field.field.name.toFirstLower»" />
				   	    		«ELSEIF field.field.fieldEnum != null»
				   	    			<form:select class="form-control" path="«field.field.name.toFirstLower»" items="${«field.field.name.toFirstLower»EnumValues}" itemLabel="label" />
				   	    		«ELSE»
				   	    			<form:input class="form-control" path="«field.field.name.toFirstLower»" />
				   	        	«ENDIF»
				   	        	«IF field.mandatory && (field.field.fieldType != FieldType.BOOLEAN && field.field.fieldEnum == null) »
				   	        		<div class="required-icon">
				   	        			<div class="text">*</div>
				   	        		</div>
				   	        	«ENDIF»
				   	        </div>
				   	    </div>
				   	</div>
				   «ENDFOR»
				   «IF category.flow != null»
				   	<div class="form-group"> 
				   		<label for="title" class="control-label col-sm-2">Aktueller Status:</label>
				   		<div class="col-sm-6">
				   		 	<form:select class="form-control" path="currentFlowState" items="${states}" itemLabel="label" />
				   		</div>
				   	</div>
				   «ENDIF»
				    <div class="form-group"> 
				        <div class="col-sm-offset-2 col-sm-10">
				            <button type="submit" class="btn btn-default">Speichern</button>
				        </div>
				    </div>
			    </form:form>
			</div>
		'''
	}

	def static toShowJsp(TicketCategory category) {
		'''
			<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
			<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
			<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
			
			<%@include file="../navigation.jspf"%>
			<div class="container">
				<h1>«category.description» anzeigen</h1>
				
				<div class="form-horizontal">
					<div class="form-group">
				   	    <label for="title" class="control-label col-sm-2">Erstellt:</label>
				   	    <div class="col-sm-6">
			   	    		<span class="form-control" disabled="true"><fmt:formatDate pattern="dd.MM.yyyy HH:mm" value="${«category.name.toFirstLower».getCreated().time}"/></span>
				   	    </div>
				   	</div>
				   «FOR field : category.ticketFields»
				   	<div class="form-group">
				   	    <label for="title" class="control-label col-sm-2">«field.field.label»:</label>
				   	    <div class="col-sm-6">
				   	    	«IF field.field.fieldEnum != null»
				   	    		<span class="form-control" disabled="true">${«category.name.toFirstLower».get«field.field.name.toFirstUpper»().getLabel()}</span>
				   	    	«ELSEIF field.field.fieldType == FieldType.DATE»
				   	    		<span class="form-control" disabled="true"><fmt:formatDate pattern="dd.MM.yyyy" value="${«category.name.toFirstLower».get«field.field.name.toFirstUpper»().time}"/></span>
				   	    	«ELSEIF field.field.fieldType == FieldType.DATE_TIME»
				   	    		<span class="form-control" disabled="true"><fmt:formatDate pattern="dd.MM.yyyy HH:mm" value="${«category.name.toFirstLower».get«field.field.name.toFirstUpper»().time}"/></span>
				   	    	«ELSEIF field.field.fieldType == FieldType.BOOLEAN»
				   	    		<input type="checkbox" <c:if test="${«category.name.toFirstLower».«field.field.name.toFirstLower»}">checked="checked"</c:if> disabled="true"/>
					   	    «ELSE»
				   	    		<span class="form-control" disabled="true">${«category.name.toFirstLower».get«field.field.name.toFirstUpper»()}</span>
				   	    	«ENDIF»	
				   	    </div>
				   	</div>
				   «ENDFOR»
				   «IF category.flow != null»
				   	<div class="form-group"> 
				   		<label for="title" class="control-label col-sm-2">Aktueller Status:</label>
				   		<div class="col-sm-6">
				   			<span class="form-control" disabled="true">${«category.name.toFirstLower».currentFlowState.label}</span>
				   		</div>
				   	</div>
				   «ENDIF»
				   <div class="btn-group col-sm-offset-2"> 
				        <c:url var="editUrl" value="/«category.name.toLowerCase»/edit">
					        <c:param name="id" value="${«category.name.toFirstLower».id}" />
					    </c:url>
				        <div class="btn">
					        <a class="btn btn-default" href='<c:out value="${editUrl}"/>'>Bearbeiten</a>
					    </div>
				        <c:url var="deleteUrl" value="/«category.name.toLowerCase»/delete">
				            <c:param name="id" value="${«category.name.toFirstLower».id}" />
				        </c:url>
				        <form:form action="${deleteUrl}" class="btn">
				           <button type="submit" class="btn btn-default">Löschen</button>
				        </form:form>
				        «IF category.flow != null»
				            <c:url var="prevStateUrl" value="/«category.name.toLowerCase»/prevState" >
				                <c:param name="id" value="${«category.name.toFirstLower».id}" />
				            </c:url>
				            <form:form action="${prevStateUrl}" class="btn">
				                <button type="submit" class="btn btn-default"<c:if test="${«category.name.toFirstLower».currentFlowState.isFirst()}" >disabled="true"</c:if>>Vorheriger Status</button>
				            </form:form>
				            <c:url var="nextStateUrl" value="/«category.name.toLowerCase»/nextState" >
				                <c:param name="id" value="${«category.name.toFirstLower».id}" />
				            </c:url>
				            <form:form action="${nextStateUrl}" class="btn">
				                <button type="submit" class="btn btn-default" <c:if test="${«category.name.toFirstLower».currentFlowState.isLast()}" >disabled="true"</c:if>>Nächster Status</button>
				            </form:form>
				        «ENDIF»
				    </div>
			    </div>
			</div>
		'''
	}

	def static toListJsp(TicketCategory category) {
		'''
			<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
			<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
			<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
			
			<%@include file="../navigation.jspf"%>
			<div class="container">
				<h1>«category.description»</h1>
				<table class="table table-striped">
					<thead>
						<tr>
							<th>ID</th>
							«IF category.flow != null»
								<th>Status</th>
							«ENDIF»
							«FOR field : category.ticketFields»
								«IF !field.notOnList»
									<th>«field.field.label»</th>
								«ENDIF»
							«ENDFOR»
							<th />
						</tr>
					</thead>
					<tbody>
						<c:forEach var="«category.name.toFirstLower»" items="${«category.name.toFirstLower»s}" varStatus="status">
						    <tr>
						        <c:url var="showUrl" value="/«category.name.toLowerCase»/show">
						            <c:param name="id" value="${«category.name.toFirstLower».id}" />
						        </c:url>
								<td>${«category.name.toFirstLower».id}</td>
								«IF category.flow != null»
									<td>${«category.name.toLowerCase».currentFlowState.label}</td>
								«ENDIF»
								«FOR field : category.ticketFields»
									«IF !field.notOnList»
										«IF field.field.fieldEnum != null»
											<td>${«category.name.toFirstLower».get«field.field.name.toFirstUpper»().getLabel()}</td>
										«ELSEIF field.field.fieldType == FieldType.DATE»
											<td><fmt:formatDate pattern="dd.MM.yyyy" value="${«category.name.toFirstLower».get«field.field.name.toFirstUpper»().time}"/></td>
										«ELSEIF field.field.fieldType == FieldType.DATE_TIME»
											<td><fmt:formatDate pattern="dd.MM.yyyy HH:mm" value="${«category.name.toFirstLower».get«field.field.name.toFirstUpper»().time}"/></td>
										«ELSEIF field.field.fieldType == FieldType.BOOLEAN»
											<td><input type="checkbox" <c:if test="${«category.name.toFirstLower».«field.field.name.toFirstLower»}">checked="checked"</c:if> disabled="true"/></td>
										«ELSE»
											<td>${«category.name.toFirstLower».get«field.field.name.toFirstUpper»()}</td>
										«ENDIF»
									«ENDIF»
								«ENDFOR»
								<td>
								    <a class="btn btn-default btn-xs" href='<c:out value="${showUrl}"/>'>Anzeigen</a>
								</td>
						    </tr>
						</c:forEach>
					</tbody>
				</table>
				
				<c:url var="createUrl" value="/«category.name.toLowerCase»/create" />
				<div>
				    <a class="btn btn-default" href='<c:out value="${createUrl}"/>'>Anlegen</a>
				</div>
			</div>
		'''
	}

	def static toNavigation(Collection<TicketCategory> categories) {
		'''
			<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
			
			<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.1/jquery.min.js"></script>
			<script src="https://ajax.googleapis.com/ajax/libs/jqueryui/1.11.2/jquery-ui.min.js"></script>
			<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.1/js/bootstrap.min.js"></script>
			<script src="<c:url value="/js/jquery.datetimepicker.js"/>"></script>
			<link rel="stylesheet" href="//code.jquery.com/ui/1.11.2/themes/smoothness/jquery-ui.css">
			<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.1/css/bootstrap.min.css">
			<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.1/css/bootstrap-theme.min.css">
			<link rel="stylesheet" type="text/css" href="<c:url value="/js/jquery.datetimepicker.css"/>">
			<link rel="stylesheet" type="text/css" href="<c:url value="/js/footer.css"/>">
			<link rel="stylesheet" type="text/css" href="<c:url value="/js/requiredFields.css"/>">
			
			<script>
				$(function() {
					$( ".datepicker" ).datetimepicker({
						timepicker:false,
						format:'d.m.Y'
					});
					$( ".datetimepicker" ).datetimepicker({
						format:'d.m.Y H:i'
					});
				});
			</script>
			
			<nav class="navbar navbar-default">
			    <div class="container-fluid">
			        <div class="navbar-header">
			     	    <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#myNavbar">
			     	        <span class="icon-bar"></span>
			     	        <span class="icon-bar"></span>
			     	        <span class="icon-bar"></span>                        
			     	    </button>
			     	    <c:url var="index" value="/index" />
					    <a class="navbar-brand" href="<c:out value="${index}"/>">TicketSystem</a>
			        </div>
			        <div class="collapse navbar-collapse" id="myNavbar">
			            <ul class="nav navbar-nav">
				            «FOR category : categories»
				            <c:url var="«category.name.toFirstLower»Url" value="/«category.name.toLowerCase»/list" />
				            <li><a href='<c:out value="${«category.name.toFirstLower»Url}"/>'>«category.description»</a></li>
				            «ENDFOR»	
			            </ul>
			        </div>
				</div>
			</nav>


			<footer class="footer">
				<div class="container">
					<p class="text-muted">© Nordakademie MWI 13o Norbert Kleinekarhoff, Patrick Zimmermann</p>
				</div>
			</footer>
			
		'''
	}
	
	def static toIndex(Collection<TicketCategory> categories) {
		'''
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
						«FOR category : categories»
							<tr>
								<c:url var="«category.name.toFirstLower»Url" value="/«category.name.toLowerCase»/list" />
								<td><a href='<c:out value="${«category.name.toFirstLower»Url}"/>'>«category.description»</a></td>
								<td>${«category.name.toFirstLower»Count}</td>
							</tr>
			      		«ENDFOR»
					</tbody>
				</table>
			</div>
		'''
	}
}
