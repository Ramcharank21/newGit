alert('studentjsn called');




$(document).ready(function() {

	                alert("ready fun called");

            $("button").click(function() {
                alert('inside button clicked');



                $.ajax({
         type:'GET',
      	url: "/bin/getjson",

      contentType :'application/json',
      dataType:'json',

	 success: function(result)
    var json=JSON.stringify(result)
    var result=jQuery.parseJSON(json);

                    //alert(json);
                    //$('#result').html(result.id)
                    //document.getElementById(result).innerHTML=json;
                    //alert('data from s servlet'+json);
                    //alert(result. +""+result. +""+result. +""+result. )
                    //result.EmployeId;
                    /*document.getElementById(resul).innerHTML="id"+*/

  				//var a=result.  ;
                    //var b=result. ; 
                    //var c=result. ;
                    //var d=result. ;
                  //  $('#id').html(a);
                   //  $('#id').html(b);
                    // $('#id').html(c);
                   //  $('#id').html(d);

                },
                       error:function(err){
                    alert("unable to retrive data "+err);
         
	 }
	});
            });
        });

