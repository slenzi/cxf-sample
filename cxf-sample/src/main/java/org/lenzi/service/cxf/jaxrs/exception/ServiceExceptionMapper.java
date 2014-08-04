package org.lenzi.service.cxf.jaxrs.exception;

import javax.ws.rs.core.Response;
import javax.ws.rs.ext.ExceptionMapper;

/**
 * @author sal
 *
 * Maps a ServiceException to a javax.ws.rs.core.Response which can then be uses to send a valid HTTP
 * error code back to the calling client.
 */
public class ServiceExceptionMapper implements ExceptionMapper<ServiceException> {

	/**
	 * 
	 */
	public ServiceExceptionMapper() {
		super();
	}

	/**
	 * Converts the ServiceException and maps it to an HTTP response (with proper error code.)
	 */
	public Response toResponse(ServiceException exception) {
		Response.Status status;
		status = Response.Status.INTERNAL_SERVER_ERROR; // error code 500
		return Response.status(status).header("exception", exception.getMessage()).build();
	}

}
