package com.cybage.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;



import com.cybage.domainObjects.ClientDomain;
import com.cybage.model.Client;
import com.cybage.model.ClientDomains;
import com.cybage.model.ClientOffices;
import com.cybage.services.ClientService;



@RestController
@RequestMapping("/client")
public class ClientController 
{
	@Autowired
	ClientService serviceObj;
	
	/* @RequestMapping(value = "/client/{name}", method = RequestMethod.GET, produces= MediaType.APPLICATION_JSON_VALUE)
	    public  String getClientDetails(@PathVariable("name") String name)
	 	{
		 	serviceObj=new ClientServiceImpl();
		 	System.out.println(name);
		 	Client obj=new Client("abhishek", "sdf", "fjf", "43489", "dfwdgh", "dgsj", "jhd", "inactive","samana");
		 	serviceObj.addNewClient(obj);
			return "success";
	    }
	 */
	
	 @RequestMapping(value = "/add",method = RequestMethod.POST, consumes= MediaType.APPLICATION_JSON_VALUE)
	    public String getClientDetails(@RequestBody ClientDomain clientObj)
	 	{
		 System.out.println(clientObj.toString());
		 String response=serviceObj.addNewClient(clientObj);
		System.out.println(response);	
		 return response;
	    }
	 
	 @RequestMapping(value = "/location",method = RequestMethod.POST, consumes= MediaType.APPLICATION_JSON_VALUE)
	    public String getClientAddress(@RequestBody ClientOffices ClientOfficeObj)
	 	{
		 System.out.println(ClientOfficeObj.toString());
		 String response=serviceObj.addNewClientAddress(ClientOfficeObj);
		System.out.println(response);	
		 return response;
	    }
	 
	//search client
		@RequestMapping(value = "/searchClient/{name}",method = RequestMethod.GET, produces= MediaType.APPLICATION_JSON_VALUE)
	    public ClientDomain sendclient( @PathVariable("name") String name)
	 	{
			ClientDomain cldObj;
		 //System.out.println(ugpObj.toString());
		 cldObj=serviceObj.searchclient(name);
		//System.out.println(response);	
		 return cldObj;
	    }
		//send all client
		@RequestMapping(value = "/getclients",method = RequestMethod.GET, produces= MediaType.APPLICATION_JSON_VALUE)
	    public List<String> sendclients()
	 	{
			List<String> li;
		  li=serviceObj.sendClient();
		 return li;
	    }
		
		//send all clientsDetails
				@RequestMapping(value = "/getclientsdetails",method = RequestMethod.GET, produces= MediaType.APPLICATION_JSON_VALUE)
			    public List<Client> sendCliecntsDetails()
			 	{
					List<Client> li;
				  li=serviceObj.sendClientsDetails();
				 return li;
			    }
				
				//search deleteclient
				@RequestMapping(value = "/deleteclient/{name}",method = RequestMethod.PUT, produces= MediaType.APPLICATION_JSON_VALUE)
			    public String deleteClient( @PathVariable("name") String name)
			 	{
					 String response=serviceObj.deleteClient(name);
					System.out.println(response);	
					 return response;
			    }
				//update client
				@RequestMapping(value = "/update",method = RequestMethod.POST, consumes= MediaType.APPLICATION_JSON_VALUE)
			
				    public String updateClientDetails(@RequestBody Client clientObj)
				 	{
					 System.out.println(clientObj.toString());
					 String response=serviceObj.updateClient(clientObj);
					System.out.println(response);	
					 return response;
				    }		
				//send domainstable
				@RequestMapping(value = "/getdomains",method = RequestMethod.GET, produces= MediaType.APPLICATION_JSON_VALUE)
			    public List<ClientDomains> sendCliecntsDomains()
			 	{
					List<ClientDomains> li;
				  li=serviceObj.sendCliecntsDomains();
				 return li;
			    }
				//send region table
				@RequestMapping(value = "/getregion",method = RequestMethod.GET, produces= MediaType.APPLICATION_JSON_VALUE)
			    public List<ClientOffices> sendCliecntsRegions()
			 	{
					List<ClientOffices> li;
				  li=serviceObj.sendCliecntsRegion();
				 return li;
			    }
				
				
	 
	 
	 
	 
}
