package org.nordakademie.mwi.tickets.generator

import org.nordakademie.mwi.tickets.tickets.TicketCategory
import java.util.Collection

class JspGenerator {

	def static toCreateJsp(TicketCategory category) {
		'''
			<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
			<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
			<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
			
			<%@include file="../navigation.jspf"%>
			<div class="container">
				<h1>«category.description» create</h1>
				
				<c:url var="url" value="/«category.name.toLowerCase»/create" /> 
				<form:form action="${url}" commandName="«category.name.toLowerCase»" class="form-horizontal" role="form">
				   «FOR field : category.ticketFields»
				   	<div class="form-group">
				   	    <label for="title" class="control-label col-sm-2">«field.field.label»:</label>
				   	    <div class="col-sm-6">
				   	        <form:input class="form-control" path="«field.field.name»" />
				   	    </div>
				   	</div>
				   «ENDFOR»
				   «IF category.flow != null»
				    	<div class="form-group"> 
				    		<label for="title" class="control-label col-sm-2">Aktueller Status:</label>
				    		   <div class="col-sm-6">
				    		 	<form:select class="form-control" path="currentFlowState" items="${states}" itemLabel="label" />
				    		 </div
				    	</div>
				   «ENDIF»
				   <div class="form-group"> 
				       <div class="col-sm-offset-2 col-sm-10">
				           <button type="submit" class="btn btn-default">Submit</button>
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
				<h1>«category.description» show</h1>
				
				<div class="form-horizontal">
				   «FOR field : category.ticketFields»
				   	<div class="form-group">
				   	    <label for="title" class="control-label col-sm-2">«field.field.label»:</label>
				   	    <div class="col-sm-6">
				   	        <span class="form-control" disabled="true">${«category.name».«field.field.name»}</span>
				   	    </div>
				   	</div>
				   «ENDFOR»
				   «IF category.flow != null»
				    	<div class="form-group"> 
				    		<label for="title" class="control-label col-sm-2">Aktueller Status:</label>
				    		   <div class="col-sm-6">
				    		 	<form:select class="form-control" path="currentFlowState" items="${states}" itemLabel="label" disabled="true"/>
				    		 </div
				    	</div>
				   «ENDIF»
				   <div class="form-group"> 
				       <div class="col-sm-offset-2 col-sm-10">
				           <button type="submit" class="btn btn-default">Edit</button>
				       </div>
				       <c:url var="deleteUrl" value="/«category.name»/delete">
				           <c:param name="id" value="${«category.name».id}" />
				       </c:url>
				       <form:form action="${deleteUrl}" class="col-sm-offset-2 col-sm-10">
				           <button type="submit" class="btn btn-default">Delete</button>
				       </form:form>
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
				<c:forEach var="«category.name.toLowerCase»" items="${«category.name.toLowerCase»s}" varStatus="status">
				    <tr>
				        <c:url var="showUrl" value="/«category.name.toLowerCase»/show">
				            <c:param name="id" value="${«category.name.toLowerCase».id}" />
				        </c:url>
						<td>${«category.name.toLowerCase».id}</td>
						«IF category.flow != null»
							<td>${«category.name.toLowerCase».currentFlowState}</td>
						«ENDIF»
						«FOR field : category.ticketFields»
							«IF !field.notOnList»
								<td>${«category.name.toLowerCase».«field.field.name»}</td>
							«ENDIF»
						«ENDFOR»
						<td>
						    <a href='<c:out value="${showUrl}"/>'>Show</a>
						   </td>
						  </tr>
				</c:forEach>
				</table>
				
				<c:url var="createUrl" value="/«category.name.toLowerCase»/create" />
				<div>
				    <a href='<c:out value="${createUrl}"/>'>Create</a>
				</div>
			</div>
		'''
	}

	def static toNavigation(Collection<TicketCategory> categories) {
		'''
			<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
			
			<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.1/jquery.min.js"></script>
			<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.1/css/bootstrap.min.css">
			<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.1/css/bootstrap-theme.min.css">
			<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.1/js/bootstrap.min.js"></script>
			
			
			
			<nav class="navbar navbar-default">
			    <div class="container-fluid">
			     <div class="navbar-header">
			     	 <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#myNavbar">
			     	   <span class="icon-bar"></span>
			     	   <span class="icon-bar"></span>
			     	   <span class="icon-bar"></span>                        
			     	 </button>
			     	 <a class="navbar-brand" href="#">TicketSystem</a>
			     </div>
			     <div class="collapse navbar-collapse" id="myNavbar">
			         <ul class="nav navbar-nav">
			      «FOR category : categories»
			      	<c:url var="«category.name.toLowerCase»Url" value="/«category.name.toLowerCase»/list" />
			      	    <li><a href='<c:out value="${«category.name.toLowerCase»Url}"/>'>«category.description»</a></li>
			      «ENDFOR»	
			      </ul>
			     </div>
				</div>
			</nav>
		'''
	}
}
