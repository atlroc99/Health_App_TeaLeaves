console.log('inside the add emp js file');

var links = document.querySelectorAll('a');

 document.getElementById("addButton").addEventListener("click", function(event){
	 console.log("button clicked theu add event listener");

	var fields = document.getElementsByClassName("form-control");
	
	var firstName = fields[0].value;
	var lastName = fields[1].value;
	var salary = fields[2].value;
	var dept = fields[3].value;
	
	//console.log('firstname: ' + firstName + "last Name" + lastName + "dept: " + dept);
	
	
	var jsonObject = JSON.stringify(
	{
		// "id": 400,
		"firstName": firstName,
		"lastName": lastName,
		"salary": salary,
		"department":{
			// "id": 1,
			"departmentName": dept
		}
	});
	
	$.ajax({
		type: "POST",
		url: "/processNewEmployee",
		contentType: "application/json",
		data: jsonObject,
		success: function(){
			 window.location= "/allEmployees"
			console.log("employee added" + jsonObject);
		},
		 dataType: "json"
	  });
 });
