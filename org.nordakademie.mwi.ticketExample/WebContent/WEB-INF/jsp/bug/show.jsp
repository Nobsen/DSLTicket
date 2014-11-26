<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<%@include file="../navigation.jspf"%>

<h1>Bug show</h1>

<c:url var="url" value="/bug/create" />
<form:form action="${url}" commandName="bug">
	<form:hidden path="id" />

	<fieldset>
		<div class="form-row">
			<label for="title">title:</label> <span class="input">${bug.title}</span>
		</div>
		<div class="form-row">
			<label for="description">description:</label> <span class="input">${bug.description}</span>
		</div>
	</fieldset>
</form:form>

