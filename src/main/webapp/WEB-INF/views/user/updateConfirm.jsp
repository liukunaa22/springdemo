<div class="col-sm-12">
	<form:form action="${pageContext.request.contextPath}/user/update"
		modelAttribute="userForm" class="form-horizontal">
		<fieldset>
			<legend>Update User</legend>
			<div class="form-group">
				<form:label path="name" class="col col-sm-2 control-label">Id</form:label>
				<div class="col col-sm-10">
					${f:h(userForm.id)}
					<form:input path="id" type="hidden" />
					<form:errors path="id" cssClass="text-danger" />
				</div>
			</div>
			<div class="form-group">
				<form:label path="sid" class="col col-sm-2 control-label">Student Id</form:label>
				<div class="col col-sm-10">
					${f:h(userForm.sid)}
					<form:hidden path="sid" />
					<form:errors path="sid" cssClass="text-danger" />
				</div>
			</div>
			<div class="form-group">
				<form:label path="name" class="col col-sm-2 control-label">Student Name</form:label>
				<div class="col col-sm-10">
					${f:h(userForm.name)}
					<form:hidden path="name" />
					<form:errors path="name" cssClass="text-danger" />
				</div>
			</div>
			<div class="form-group">
				<form:label path="score" class="col col-sm-2 control-label">Score</form:label>
				<div class="col col-sm-10">
					${f:h(userForm.score)}
					<form:hidden path="score" />
					<form:errors path="score" cssClass="text-danger" />
				</div>
			</div>
			<div class="form-group">
				<div class="col col-sm-10 col-sm-offset-2">
        <form:hidden path="id" />
        <input type="submit" class="btn btn-primary" name="update"
          value="Update" /> <input type="submit" class="btn btn-default"
          name="redo" value="Back to Form" />
				</div>
			</div>
		</fieldset>
	</form:form>
</div>
