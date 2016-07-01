 
  angular
    .module('myApp')
    .controller('OfficeCtrl', ['$scope','$rootScope','$window','ClientService',OfficeCtrl]);
  
  function OfficeCtrl(scope,rootScope,window,ClientService) {
	  	scope.client = {};
		scope.clientlist = [];
		scope.client.c_name=rootScope.clientName;
		
		//Function used to add new location
		scope.addLocation = function() {
				alert(JSON.stringify(scope.client));
		      var response=ClientService.addLocation(scope.client);
		      
		      response
		      .then(function(resp) {
		    	  alert(resp.data.msg);
		       }, function() {
		         
		       });
		    };//End of function
  }
