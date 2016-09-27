package leaveMgmtSystem.resources;

import java.net.URI;
import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;
import javax.ws.rs.core.UriInfo;

import leaveMgmtSystem.dto.GenericResponse;
import leaveMgmtSystem.exception.DatabaseExceptions;
import leaveMgmtSystem.exception.EmployeeNotFoundExceptions;
import leaveMgmtSystem.formBeans.RegistrationFormBean;
import leaveMgmtSystem.service.EmployeeRegistrationServiceI;
import leaveMgmtSystem.service.EmployeeRegistrationServiceImpl;
import leaveMgmtSystem.vo.AwaitingEmoVO;

@Path("/registration")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class EmployeeRegistrationResource {
	EmployeeRegistrationServiceI empRegServ=null;
	
	@GET
	public List<AwaitingEmoVO> getAwaiting() throws DatabaseExceptions, EmployeeNotFoundExceptions {
		empRegServ=new EmployeeRegistrationServiceImpl();
		
		return empRegServ.getAllAwaiting();
		//LeaveManagememntSystem/webapi/registration
	}
	
	@GET
	@Path("/{empCode}")
	public RegistrationFormBean getAwatingDet(@PathParam("empCode") String empCode) throws EmployeeNotFoundExceptions, DatabaseExceptions{
		empRegServ=new EmployeeRegistrationServiceImpl();
		System.out.println("hsavxhgxuiajk"+empRegServ);
		System.out.println("jdcnxdcjsd"+empCode);
		
		return empRegServ.getAwaitingDet(empCode);
		//LeaveManagementSystem/webapi/registration/AL001
		
	}
	
	@POST
	@Path("/newEmployee")
	public Response registerEmployee(RegistrationFormBean regFBean,@Context UriInfo uriInfo) throws DatabaseExceptions{
		System.out.println("hi "+regFBean);
		empRegServ=new EmployeeRegistrationServiceImpl();
		RegistrationFormBean reg=empRegServ.employeeRegistration(regFBean);
		String newId = String.valueOf(reg.getEmpId());
		System.out.println(newId);
		System.out.println(reg);
		URI uri = uriInfo.getAbsolutePathBuilder().path(newId).build();
		return Response.created(uri)
				.entity(reg)
				.build();
	
		///LeaveManagementSystem/webapi/registration/newEmployee
		/*
		 * {
  "dob": "01-12-1990",
  "doj": "01-12-2016",
  "email": "hw@gmail.com",
  "empCode": "AL019",
  "empFName": "Test2",
  "empLName": "User3",
  "empMName": "",
  "gender": "F",
  "mobile": 1112666,
  "projectId": 1,
  "pwd": "User",
  "securityQuesId": 401,
  "secutityAns": "test ans",
  "type_id":209

}*/
	}
	
	@POST
	@Path("/approval")
	public Response approveEmpRegistration(RegistrationFormBean regFBean,@Context UriInfo uriInfo) throws DatabaseExceptions{
		System.out.println("hi "+regFBean);
		GenericResponse response = new GenericResponse();
		empRegServ=new EmployeeRegistrationServiceImpl();
		int res=empRegServ.giveApproval(regFBean);
		if(res!=0){
			System.out.println(res);
			response.setStatus(true);
			response.setMessage("Employee record updated");
			
			return Response.status(Status.OK).entity(response).build();
		
		
		}
		else{
			response.setStatus(false);
			response.setMessage("Employee record can't be updated");
			response.setErrorCode("505");
			return Response.status(422).entity(response).build();
			
		}
	}
	
	/*
	 * http://localhost:8081/LeaveManagementSystem/webapi/registration/approval
	 * {
  "accountStatusId": 501,
  "empCode": "AL031",
  "typeId": 202
  }
	 */
	
	
	
	
	

}
