
$(document).ready(function() {

	 var theNbr = 0;
	 $("#nbr").val(theNbr);
	 console.log("the number is " + theNbr);
 
	$("#nbr").val(theNbr);
	console.log("message here")

	$("#nbrPlus").click(function(){
		theNbr++;
		$("#nbr").val(theNbr);
		setClass();
	});

	$("#nbrMinus").click(function(){
		theNbr--;
		$("#nbr").val(theNbr);
		setClass();
	});

	$("#reset").click(function(){
		theNbr = 0;
		$("#nbr").val(theNbr);
	});
	function setClass() {
		if(theNbr >= 8) {
			$("#nbr").addClass("invalid");
		} else {
			$("#nbr").removeClass("invalid");
		}
	}
});

