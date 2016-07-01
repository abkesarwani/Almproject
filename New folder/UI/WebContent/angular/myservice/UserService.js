 
  angular
    .module('myApp')
    .service('UserService', ['$http','$q', function(http,$q) {
      var baseUrl = 'http://localhost:8065/ClientUserManagement/user';
      
      this.allUsers = function() {
        return http.get(baseUrl+"/"+"getAll");
      };
      
      this.getUser = function(name) {
        return http.get(baseUrl+'/'+name);
      };
      
      this.saveUser = function(id,client) {
        return http.put(baseUrl+'/'+id,client);
      };
      
      this.newUser = function(user) {
          return http.post(baseUrl+'/'+'add',user);
        };
        
        this.newPermission = function(permission) {
            return http.post(baseUrl+'/'+'addpermissions',permission);
          };
          
          this.showPermission = function() {
        	  /*var deferred = $q.defer();

        	  http.get(baseUrl+'/'+'groups').success(
        			  function(data){
        				  deferred.resolve(data);
        			  }).
        			  error(function(error){
        				  deferred.reject(error);
        			  })
        	   
        	  return deferred.promise;
              */
        	  return  http.get(baseUrl+'/'+'getpermissions');
            };
            
            this.showRole = function() {
          	  return  http.get(baseUrl+'/'+'getroles');
              };
              
              this.assignPerm2Role = function(perm2role) {
                  return http.post(baseUrl+'/'+'addrolepermissions',perm2role);
                };
            
            this.addRole = function(role) {
                return http.post(baseUrl+'/'+'addrole',role);
              };
              
              this.addGroup = function(group) {
                  return http.post(baseUrl+'/'+'addgroup',group);
                };  
                
                this.showGroup = function() {
                	  return  http.get(baseUrl+'/'+'getgroup');
                    };
                    this.assignPerm2Group = function(perm2group) {
                        return http.post(baseUrl+'/'+'addgrouppermissions',perm2group);
                      };
    }]);
