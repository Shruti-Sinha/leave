package leaveMgmtSystem.exception;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;
import javax.ws.rs.ext.ExceptionMapper;

import leaveMgmtSystem.dto.ErrorMessage;

public class ExceptionNotFoundExceptionMapper implements
		ExceptionMapper<EmployeeNotFoundExceptions> {

	@Override
	public Response toResponse(EmployeeNotFoundExceptions enfe) {
		// TODO Auto-generated method stub
		ErrorMessage errorMessage = new ErrorMessage(enfe.getMessage(), 404);
		return Response.status(Status.NOT_FOUND).entity(errorMessage).build();
	}

}
