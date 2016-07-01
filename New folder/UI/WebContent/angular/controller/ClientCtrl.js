 
  angular
    .module('myApp')
    .controller('ClientCtrl', ['$scope','$rootScope','$window','ClientService',ClientCtrl]);
  
  function ClientCtrl(scope,rootScope,window,ClientService) {
	  	scope.client = {};
		scope.clientlist = [];
		
		
		//Function used to add new client
		scope.add = function() {
				if(scope.client.domain1===true)
					scope.client.domain1='healthcare';
				if(scope.client.domain2===true)
					scope.client.domain2='Media and Entertainment';
				if(scope.client.domain3===true)
					scope.client.domain3='Technology';
				
				alert(JSON.stringify(scope.client));
		      var response=ClientService.newClient(scope.client);
		      
		      response
		      .then(function(resp) {
		    	  alert(resp.data.msg);
					rootScope.clientName = scope.client.name;
					 window.location.href = '#/office';
		       }, function() {
		         
		       });
		    };//End of function
  }
