<%@ include file="header.jsp"%>
<%@ include file="menu.jsp" %>
<%@ include file="empCurdMenu.jsp" %>


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
				<input id="updateButton" type="button" class="btn btn-primary" value="Update">
			</form>
		</div>
	</div>
</div>

<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.10.2/jquery.min.js"></script>
<script src="js/updateEmp.js"></script>