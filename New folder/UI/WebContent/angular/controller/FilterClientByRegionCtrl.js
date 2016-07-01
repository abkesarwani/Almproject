 
  angular
    .module('myApp')
    .controller('FilterClientByRegionCtrl', ['$scope','$rootScope','$window','ClientService',FilterClientByRegionCtrl]);
  
  function FilterClientByRegionCtrl(scope,rootScope,window,ClientService) {
	  	/*scope.client ={};
	  	alert("hi");
	  	alert(JSON.stringify(rootScope.cl));
	  	scope.client=rootScope.cl;*/
	  scope.list=[];

	    scope.refresh= function(){
	    	ClientService.showOffices().then(function(data){
	    		scope.offices = data.data;
	    	},function(error){
	    		alert(error);
	    	})
	    
	    }
	    scope.refresh1= function(){
	    	ClientService.showLocations().then(function(data){
	    		scope.list = data.data;
	    	},function(error){
	    		alert(error);
	    	})
	    
	    }
	  
 
  }