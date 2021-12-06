alert('loginjs called');



// Get the modal
var modal = document.getElementById('id01');

// When the user clicks anywhere outside of the modal, close it
window.onclick = function(event) {
    if (event.target == modal) {
        modal.style.display = "none";
    }
}

$(document).ready(function() {

	                alert("ready fun called");

            $("button").click(function() {
                alert('login click fun called');
                	var uname=$("#uname").val();
                alert('username called'+uname);
 $.ajax({
      url: '/bin/login?username=uname',
      type: 'POST',
      success: function(data){
      }
});
            });
        });

