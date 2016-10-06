appMod


	.controller("AppCtrl", ['$http', '$routeParams', function($http, $routeParams) {
		var self = this;
		self.id = $routeParams.studentId;

		$http.get('http://localhost:8080/student')
			.then(function(resp){
				self.students = resp.data;
			},function(err) {

			});

		
		$http.get('http://localhost:8080/student/' +self.id)
			.then(function(resp){
				self.student = resp.data;
				console.log(self.student);
			},function(err) {
				console.log(err);
			});


	}]);