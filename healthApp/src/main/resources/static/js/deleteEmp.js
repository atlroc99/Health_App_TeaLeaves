$(document).ready(function(){
    $("#delEmpForm").submit(function(event){
        event.preventDefault();
        ajaxSubmitDelete();
    });
});


function ajaxSubmitDelete(){
    var formData = {
        id: $("#delEmpId").val()
    }

    $.ajax({
        type:"GET",
        contentType: "application/json",
        url:"/delete/"+ $("#delEmpId").val(),
        success:function(result){
            console.log('result', result);
        },
        error: function(er){
            console.log('error', er);
        }
    });
}