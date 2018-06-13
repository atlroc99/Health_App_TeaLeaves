console.log('inside the Employee emp js file');

 document.getElementById("updateButton").addEventListener("click", function(event){
	 console.log("button clicked thru add event listener");

	var fields = document.getElementsByClassName("form-control");
	var id = fields[0].value;
	var firstName = fields[1].value;
	var lastName = fields[2].value;
	var salary = fields[3].value;
	var dept = fields[4].value;
	
	console.log('id: ' + id + ' firstname: ' + firstName + " last Name: " + lastName + " dept: " + dept);
	
	var jsonObject = JSON.stringify(
	{
		"id": id,
		"firstName": firstName,
		"lastName": lastName,
		"salary": salary,
		"department":{
			// "id": 1,
			"departmentName": dept
		}
	});
	
	$.ajax({
		type: "PUT",
		url: "/update",
		contentType: "application/json",
        data: jsonObject,
        dataType: "json",
		success: function(result){
			console.log('result', result);
			 window.location= "/allEmployees"
        },
        error: function(error){
            console.log("error: ", error);
        }
	  });
 });

