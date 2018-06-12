<%@ include file="header.jsp" %>
<%@ include file="menu.jsp"%>

<div class="container">

	<div class="row" style="margin-bottom: 10px">
		<div class="col-md-2">
			<a href="newEmployeeForm">add new employee</a>
		</div>

		<div class="col-md-2">
			<a href="findEmpForm"> Find employee </a>
			<div id="searchById"></div>
		</div>

		<div class="col-md-2">
			<a href="updateForm">Update employee</a>
		</div>

		<div class="col-md-2">
			<a href="/deleteForm">Delete employee</a>
		</div>
	</div>

	<div class="row">
		<div class="col-md-12">
			<table class="table table-inverse" id="info_table">
				<tr class="bg-warning">
					<th>ID</th>
					<th>First name</th>
					<th>Last name</th>
					<th>Salary</th>
					<th>Dept</th>
				</tr>
			</table>
		</div>
	</div>
</div>

<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.10.2/jquery.min.js"></script>
<script src="js/employee.js"></script>
