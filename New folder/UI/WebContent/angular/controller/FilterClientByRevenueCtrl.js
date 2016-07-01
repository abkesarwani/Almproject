 
  angular
    .module('myApp')
    .controller('FilterClientByRevenueCtrl', ['$scope','$rootScope','$window','ClientService',FilterClientByRevenueCtrl]);
  
  function FilterClientByRevenueCtrl(scope,rootScope,window,ClientService) {
	  
	  
	  scope.refresh= function(){
	    	ClientService.showAllClients().then(function(data){
	    		alert(JSON.stringify(data));
	    		 parseInt(data.data.c_revenue,10);
	    		
	    		scope.clients = data.data;
	    		
	    		
	    	},function(error){
	    		alert(error);
	    	})
	    
	    }
	  
	  scope.sort = function(col) {
	      scope.onCol = col;
	    };
	  
	  	
	  
 
  }