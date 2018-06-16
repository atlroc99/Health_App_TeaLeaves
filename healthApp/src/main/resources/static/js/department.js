console.log("insdie the employee.js file");
var localhost: = window.location;

console.log('location', localhost);

$(document).ready(function(){
	var department = '';
	var deptTable = document.getElementById("dept_table");
	$.ajax({
		url: "/department/departmentList",
	}).then(function (data){
		console.log('data');
		
		$.each(data, function(i, dept){
			employee += '<tr>';
			employee += '<td>' + dept.id + '</td>';
			employee += '<td>'+dept.departmentName+'</td>';
		});
		
		$("#dept_table").append(department);
		console.log(data);
	});
});