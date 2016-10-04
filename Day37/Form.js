
angular.module("AppMod", [])
.controller("AppCtrl",[function() {
	var self=this;
	self.about = "AppMod";

	self.submit=function(){
		console.log("User Clicked submit with user" + self.user);
	};

	// $http.get("http://localhost:8080/student")
	// 		.then(function(resp) {
	// 			self.students = resp.data;
				
	// 			}, function(err) {
	// 		});

}]); //end of controller