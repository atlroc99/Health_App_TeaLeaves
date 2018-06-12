console.log("insdie the employee.js file");

$(document).ready(function(){
	var employee = '';
	var empTable = document.getElementById("info_table");
	$.ajax({
		url: "/employeeList"
	}).then(function (data){
		$.each(data, function(i, emp){
			employee += '<tr>';
			employee += '<td>' + emp.id + '</td>';
			employee += '<td>'+emp.firstName+'</td>';
			employee += '<td>'+emp.lastName+'</td>';
			employee += '<td>'+emp.salary+'</td>';
			employee += '<td>'+emp.department.departmentName+'</td>';
		});
		
		$("#info_table").append(employee);
		console.log(data);
	});
});