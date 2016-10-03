angular.module("AppMod", [])
	.controller("AppCtrl", [function() {
		var self = this;
	//	self.about = "About AngularJS";

		self.changeAbout = function(parm1) {
			var tbody = $("#stuData");
			// //self.about = "AngularJS-" + parm1;
			 for(var std of self.students) { 
			 	var student = studentList[idx];
          var item = $("<tr><td>"+student.firstname+"</td><td>"+student.lastname+"</td><td>"+student.sat+"</td><td>"+student.gpa+"</td><td>"+student.majorid+"</td></tr>");
            
          tbody.append(item);
			}
		};

		self.students = [


			{id:100, firstname:'Eric', lastname:'Ephram', gpa:3.0, sat:1200, majorid:1, vis: true},
			{id:110, firstname:"Greg", lastname:"Gould", gpa:2.5, sat:1100, majorid:null, vis: true},
			{id:120, firstname:"Adam", lastname:"Ant", gpa:3.2, sat:1300, majorid:null, vis: true},
			{id:130, firstname:"Howard", lastname:"Hess", gpa:3.7, sat:1600, majorid:4, vis: true},
			{id:140, firstname:"Charles", lastname:"Caldwell", gpa:2.1, sat:900, majorid:null, vis: true},
			{id:150, firstname:"James", lastname:"Joyce", gpa:2.5 ,sat:1100, majorid:null, vis: true},
			{id:160, firstname:"Doug", lastname:"Dumas", gpa:3.1, sat:1350, majorid:2, vis: true},
			{id:170, firstname:"Kevin", lastname:"Kraft", gpa:2.7, sat:1000, majorid:null, vis: true},
			{id:180, firstname:"Frank", lastname:"Fountain", gpa:2.5, sat:1000, majorid:null, vis: true},
			{id:190, firstname:"Brian", lastname:"Biggs", gpa:2.3, sat:950, majorid:null, vis: true}

			// {id: 100, name: 'Greg Doud', sat: 1200, gpa: 1.5, vis: true},
			// {id: 2, name: 'Cindy Doud', sat: 1600, gpa: 3.5, vis: true},
			// {id: 3, name: 'Nick Doud', sat: 1400, gpa: 4.5, vis: true},
			// {id: 4, name: 'Ken Doud', sat: 1400, gpa: 3.5, vis: false},
			// {id: 5, name: 'Jarrett Acey', sat: 1550, gpa: 3.8, vis: true},
			// {id: 6, name: 'Penny Hardaway', sat: 1375, gpa: 2.5, vis: false},
			// {id: 7, name: 'Grant Hill', sat: 1225, gpa: 2.9, vis: true},
			// {id: 8, name: 'Rod Strickland', sat: 1180, gpa: 3.2, vis: false},
			// {id: 9, name: 'Mark Jackson', sat: 1430, gpa: 3.4, vis: true},
			// {id: 10, name: 'Gerald Wilkens', sat: 1600, gpa: 3.6, vis: false},
			// {id: 11, name: 'Larry Johnson', sat: 1475, gpa: 2.0, vis: true},
			// {id: 12, name: 'Trent Tucker', sat: 1200, gpa: 2.8, vis: false}
		];

	}]); //end controller