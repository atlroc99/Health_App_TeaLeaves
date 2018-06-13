<%@ include file="header.jsp"%>
<%@ include file="menu.jsp" %>


<div class="container">
	<div class="row">
		<div class="col-md-12">
			<h5>Update Employee</h5>
		</div>
	</div>
	<div class="row">
		<div class="col-md-12">
			<form id="updateForm">
				<div class="form-group">
					<label for="id">ID</label>
					<input type="text" id="id" class="form-control">
				</div>
				<div class="form-group">
					<label for="fname">First Name</label>
					<input type="text" class="form-control" id="fname">
				</div>
				<div class="form-group">
					<label for="lname">Last name</label>
					<input type="text" id="lname" class="form-control">
				</div>
				<div class="form-group">
					<label for="salary">Salary</label>
					<input type="text" class="form-control" id="salary">
				</div>
				<div class="form-group">
					<label for="dept">Department</label>
					<input type="text" class="form-control" id="dept">
				</div>
				<button class="btn btn-success" type="submit">Update</button>
			</form>
		</div>
	</div>
</div>