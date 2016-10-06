angular.module("AppMod", ["ngRoute"])
	.controller("AppCtrl", ['$http', function($http) {
		var self = this;

		$http.get('http://localhost:8080/student')
			.then(function(resp){
				self.students = resp.data;
			},function(err) {

			});

	}])


	.config(['$routeProvider', function($routeProvider) {

		$routeProvider
		.when('/', {
			templateUrl: 'views/home.html'

		}).when('/student', {
			templateUrl: 'views/student.html',
			controller: 'AppCtrl',
			controllerAs: 'ctrl'

		}).when('/student/:studentId', {
			templateUrl: 'views/detail.view.html',
			controller: 'AppCtrl',
			controllerAs: 'ctrl'

		})
		.otherwise({redirectTo: '/'});

	}]); // end config
