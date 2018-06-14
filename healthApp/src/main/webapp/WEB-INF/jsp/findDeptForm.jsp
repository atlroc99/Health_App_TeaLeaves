<%@ include file="header.jsp"%>
<%@ include file="menu.jsp"%>
<%@ include file="deptMainMenu.jsp"%>

<div class="container" style="margin-botton:30px">
	<div class="row">
		<div class="col-md-12">
			<form id="findDeptForm">
				<div class="form-group">
					<label for="deptId"> Id </label>
					<input id="deptId" type="text" class="form-control">
				</div>
				<div class="form-group">
					<label for="deptName"> Department </label>
					<input id="deptName" type="text" class="form-control">
				</div>
				<input type="button" class="btn btn-primary" id="deptFindBtn" value="Search">
			</form>
		</div>
	</div>
</div>
