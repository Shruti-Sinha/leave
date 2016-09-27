package leaveMgmtSystem.exception;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;
import javax.ws.rs.ext.ExceptionMapper;

import leaveMgmtSystem.dto.ErrorMessage;

public class DatabaseExceptionMapper implements ExceptionMapper<DatabaseExceptions>{

	@Override
	public Response toResponse(DatabaseExceptions dbe) {
		// TODO Auto-generated method stub
		ErrorMessage errorMessage = new ErrorMessage(dbe.getMessage(), 405);
		return Response.status(Status.INTERNAL_SERVER_ERROR).entity(errorMessage).build();
	}

}
