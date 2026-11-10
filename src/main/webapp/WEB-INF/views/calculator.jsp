<%@ include file="../common/header.jspf"%>
<%@ include file="../common/navigation.jspf"%>

<div class="container">
	<form method="POST" action="/calculator.do">
		<fieldset class="form-group">
			<label>First number</label> <input name="left" type="text"
				class="form-control" value="${left}" />
		</fieldset>
		<fieldset class="form-group">
			<label>Second number</label> <input name="right" type="text"
				class="form-control" value="${right}" />
		</fieldset>
		<input type="submit" class="btn btn-success" value="Calculate" />
	</form>
	<p><font color="red">${errorMessage}</font></p>
	<c:if test="${sum != null}">
		<p>Sum: ${sum}</p>
		<p>Difference: ${difference}</p>
	</c:if>
</div>

<%@ include file="../common/footer.jspf"%>
