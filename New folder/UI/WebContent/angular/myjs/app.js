'use strict';

var myApp = angular.module('myApp', [ 'ngRoute' ]);
myApp.config(['$routeProvider', function(rp) {
	rp.when('/home', {
		templateUrl : 'angular/myhtml/home.html',
		controller : 'HomeCtrl'
	})
	.when('/addClient', {
		templateUrl : 'angular/myhtml/cregisteration.html',
		controller : 'ClientCtrl'
	})
	.when('/office', {
		templateUrl : 'angular/myhtml/office.html',
		controller : 'OfficeCtrl'
	})
	.when('/addUser', {
		templateUrl : 'angular/myhtml/uregisteration.html',
		controller : 'UserCtrl'
	})
	.when('/addPermission', {
		templateUrl : 'angular/myhtml/addpremission.html',
		controller : 'PermissionCtrl'
	})
	.when('/addRole', {
		templateUrl : 'angular/myhtml/addrole.html',
		controller : 'RoleCtrl'
	})
	.when('/addGroup', {
		templateUrl : 'angular/myhtml/addgroup.html',
		controller : 'GroupCtrl'
	})
	.when('/assignP2R', {
		templateUrl : 'angular/myhtml/per2role.html',
		controller : 'Per2RoleCtrl'
	})
	.when('/assignP2G', {
		templateUrl : 'angular/myhtml/per2group.html',
		controller : 'Per2GroupCtrl'
	})
	.when('/seeAllClients', {
		templateUrl : 'angular/myhtml/dispalyclients.html',
		controller : 'DisplayClientsCtrl'
	})
	
	.when('/editClient', {
		templateUrl : 'angular/myhtml/editclient.html',
		controller : 'EditClientCtrl'
	})
	.when('/searchClient', {
		templateUrl : 'angular/myhtml/searchclientbyname.html',
		controller : 'SearchClientByNameCtrl'
	})
	
	.when('/filterClient', {
		templateUrl : 'angular/myhtml/filterclients.html',
		controller  : 'FilterClientCtrl'
		
	})
	.when('/filterbydomain', {
		templateUrl : 'angular/myhtml/filterbydomain.html',
		controller  : 'FilterClientByDomainCtrl'
		
	})
	.when('/filterbyregion', {
		templateUrl : 'angular/myhtml/filterbyregion.html',
		controller  : 'FilterClientByRegionCtrl'
		
		
	})
	.when('/filterbyrevenue', {
		templateUrl : 'angular/myhtml/filterbyrevenue.html',
		controller  : 'FilterClientByRevenueCtrl'
		
	})
	.otherwise({
		redirectTo : '/home'
	});
} ]);