<%@ include file="header.jsp"%>
<%@ include file="menu.jsp"%>
<%@ include file="deptMainMenu.jsp"%>

<div class="container">
	<div class="row">
		<div class="col-md-12">
			<h5>Add a new Department</h5	>
		</div>
	</div>
    <div class="row">
        <div class="col-md-12">
            <form id="deptForm">
                <div class="form-group">
                    <label for="deptNamne">Department Name:</label>
                    <input type="text" class="form-control" id="deptName">
                </div>
                <input type="button" id="addButton" class="btn btn-primary" value="Add">
            </form>
        </div>
    </div>
</div>

