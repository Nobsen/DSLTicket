<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<%@include file="../navigation.jspf"%>

<h1>Bug create</h1>

<c:url var="url" value="/bug/create" /> 
<form:form action="${url}" commandName="bug">
    <form:hidden path="id" />

    <fieldset>
        <div class="form-row">
            <label for="title">title:</label>
            <span class="input"><form:input path="title" /></span>
        </div>       
        <div class="form-row">
            <label for="description">description:</label>
            <span class="input"><form:input path="description" /></span>
        </div>
        <div class="form-buttons">
            <div class="button"><input name="submit" type="submit" value="Save" /></div>
        </div>
    </fieldset>
</form:form>