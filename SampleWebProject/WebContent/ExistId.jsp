<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<title>Insert title here</title>
</head>
<script type="text/javascript">

$(document).ready(function(){
	alert("hey jquery . . ");
	$('#ID').on("input keyup",function(){
	var id = $('#ID').val();
	$.post("ExistIdServlet",{
		id : id
	},
	
	function(res){
		
		$("#idError").text(res);
		if(res != ""){
			$("#ID").val("");
		}
	});
 });
	
});

</script>
<body>
<%-- <jsp:forward page="Signup.jsp">
<jsp:param value="Enter ID" name="ID"/>

</jsp:forward> --%>


<form action="ExistIdServlet" style="border:1px solid #ccc">
  <div class="container">
    <h1>Sign Up</h1>
    <p>Please fill in this form to create an account.</p>
    <hr>
	
	<label for="Id"><b>ID</b></label>
    <input type="text" placeholder="Enter ID" name="Id" id="ID" required><span id = "idError" style = "color:red;"></span>
    
	<label for="name"><b>Name</b></label>
    <input type="text" placeholder="Enter Name" name="name" id="Name" required>
    
    <label for="email"><b>Email</b></label>
    <input type="text" placeholder="Enter Email" name="email" id="Email" required>

    <label for="psw"><b>Password</b></label>
    <input type="password" placeholder="Enter Password" name="pwd" id="Password"  required>
    
     <label for="mbl"><b>Mobile Number</b></label>
    <input type="text" placeholder="Enter Mobile Number" name="mbl" id="MobileNumber"  required>
	<div class="clearfix">
      <button type="button" class="cancelbtn">Cancel</button>
      <button type="submit" class="signupbtn">Sign Up</button>
    </div>
  </div>
</form>
</body>
</html>