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
			
			<h1>«category.description» create</h1>
			
			<c:url var="url" value="/«category.name.toLowerCase»/create" /> 
			<form:form action="${url}" commandName="«category.name.toLowerCase»">
			    <form:hidden path="id" />
			
			    <fieldset>
			    «FOR field : category.ticketFields»
				<div class="form-row">
				          <label for="title">«field.field.label»:</label>
				          <span class="input"><form:input path="«field.field.name»" /></span>
				</div>   
				«ENDFOR»
				    <div class="form-buttons">
				<div class="button"><input name="submit" type="submit" value="Save" /></div>
				    </div>
				   </fieldset>
			</form:form>
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
