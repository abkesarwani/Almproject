 
  angular
    .module('myApp')
    .controller('UserCtrl', ['$scope','$rootScope','$window','UserService',UserCtrl]);
  
  function UserCtrl(scope,rootScope,window,UserService) {
	  	scope.user = {};
		
		
		//Function used to add new user 
	  	scope.addUser = function() {
				
				alert(JSON.stringify(scope.user));
		      var response=UserService.newUser(scope.user);
		      
		      response
		      .then(function(resp) {
		    	  alert(resp.data.msg);
					// window.location.href = '#/office';
		       }, function() {
		         
		       });
		    
		    };//End of function
  }
