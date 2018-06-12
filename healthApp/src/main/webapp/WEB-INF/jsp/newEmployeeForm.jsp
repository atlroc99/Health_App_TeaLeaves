<%@ include file="header.jsp" %>
<%@ include file="menu.jsp" %>

<div class="container">
    <div class="col-md-12">
        <div class="row">

         <form>
            <div class="form-group">
                <label for="fname">First Name</label>
                <input type="text" name="fname" class="form-control">
            </div>

            <div class="form-group">
                <label for="lname">Last Name</label>
                <input type="text" name="lname" class="form-control">
            </div>

            <div class="form-group">
                <label for="salary">Salary</label>
                <input type="text" name="salary" class="form-control">
            </div>

            <div class="form-group" style="margin-right: 10px">
                <label for="dept">Department</label>
                <input type="text" name="dept" class="form-control">
            </div>
            <input id="addButton" type="button" class="btn btn-primary" value="Add">
    </form> 
    </div>
</div>

<!-- <script src="js/addEmp.js"></script> -->
<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.10.2/jquery.min.js"></script>
<script src="js/addEmp.js"></script>