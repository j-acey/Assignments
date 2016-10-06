appMod


	.config(['$routeProvider', function($routeProvider) {

		$routeProvider
		.when('/', {
			templateUrl: 'views/home.html'

		}).when('/student', {
			templateUrl: 'views/student.html',
			controller: 'AppCtrl',
			controllerAs: 'ctrl'

		}).when('/student/:studentId', {
			templateUrl: 'views/detail.html',
			controller: 'AppCtrl',
			controllerAs: 'ctrl'

		}).when('/about', {
			templateUrl: 'views/about.html'

		})
		.otherwise({redirectTo: '/'});

	}]); // end config