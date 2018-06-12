<%@ include file="header.jsp"%>
<%@ include file="menu.jsp"%>

<div class="container">
	<div class="row" style="margin-bottom:30px">
        <div class="col-md-12">
            <h5 >Find employee by Id or last name</h5>
        </div>
	</div>

	<div class="row">
	    <div class="col-md-12">
	        <form id = "findEmpForm" class="form-inline">
	            <div class="form-group">
	                <label for="id" style="margin-right:20px"> Employee Id </label>
	                <input type="text" id="id" class="form-control">
	            </div>
				
				<div style="margin-left:20px; margin-right:20px">
	                <label for="or">OR</label>
	            </div>
				
				<div class="form-group">
	                <label for="id" style="margin-right:20px"> Employee Last Name </label>
	                <input type="text" id="lastName" class="form-control">
				</div>
	            <button type="submit" class="btn btn-primary" style="margin-left:20px">Find</button>
	        </form>
	    </div>
	</div>

<div id="empInfo"></div>
	<div class="row">
		<div class="col-md-12">
		</div>
	</div>
</div>

<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.10.2/jquery.min.js"></script>
<script src="js/findEmp.js"></script>   
