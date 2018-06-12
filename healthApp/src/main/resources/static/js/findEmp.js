var result;

$(document).ready(function(){
    console.log("window location: " + window.location);

    $("#findEmpForm").submit(function(event){
        event.preventDefault();
        ajaxSubmit();
    });
});

function ajaxSubmit(){
	
   var formData = {
       id: $("#id").val(),
       lastName:$("#lastName").val()
   } 
	var id = $('#id').val();
    var lastname = $('#lastName').val();
   
   console.log("print form data", formData);

    $.ajax({
        type:"GET",
        contentType:"application/json",
        url:"/findEmployee",
        dataType: "json",
        data:formData,
        success: function(result){
            console.log("Inside success result: " + result.id + " " + result.lastName);
            if(result !=null){
            	console.log("result status", result);
            	
            	$("#empInfo").html('<hr><div class = "row" style="margin-top:30px;">'
            						+'Id: ' + result.id + '<br>' 
            						+'First name: ' + result.firstName + '<br>'
            						+'Last name: ' + result.lastName+ '<br>'
            						+'Salary: ' + result.salary + '<br>'
            						+'Department: ' + result.department.departmentName + '<br>'
            						+'</div>');
            }
        },
        error:function(error){
            console.log("error occured", error);
        }
    });
}


