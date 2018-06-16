console.log("insdie the employee.js file");

$(document).ready(function(){
	var department = '';
	var deptTable = document.getElementById("dept_table");
	$.ajax({
		url: "/department/departmentList"
	}).then(function (data){
		$.each(data, function(i, dept){
			employee += '<tr>';
			employee += '<td>' + dept.id + '</td>';
			employee += '<td>'+dept.departmentName+'</td>';
		});
		
		$("#dept_table").append(department);
		console.log(data);
	});
});