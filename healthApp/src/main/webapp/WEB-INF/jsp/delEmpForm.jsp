<%@ include file="header.jsp"%>
<%@ include file="menu.jsp"%>


<div class="container">
	<div class="row">
		<div class="col-md-12">
			<form id="delEmpForm">
				<div class="form-group">
					<label for="id">Id: </label>
					<input id="delEmpId" type="text" class="form-control">
				</div>
				<button type="submit" id="delBtn" class="btn btn-warning">Delete</button>
			</form>
		</div>
	</div>
</div>

<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.10.2/jquery.min.js"></script>
<script src="js/deleteEmp.js"></script>