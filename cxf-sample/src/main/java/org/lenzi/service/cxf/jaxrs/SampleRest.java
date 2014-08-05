/**
 * 
 */
package org.lenzi.service.cxf.jaxrs;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.lenzi.model.Sample;
import org.lenzi.service.cxf.jaxrs.exception.ServiceException;


/**
 * @author sal
 *
 */
@Path("/testrest")
public interface SampleRest {

	/**
	 * Fetch hello message
	 *  
	 * @return Hello message in plain text format. 
	 */
	@GET
	@Path("/hello")
	@Produces(MediaType.TEXT_PLAIN)		
	public String getHello();
	
	/**
	 * Get number of samples
	 * 
	 * @return
	 */
	@GET
	@Path("/count")
	@Produces(MediaType.TEXT_PLAIN)		
	public String getSampleCount();
	
	/**
	 * Fetch a sample by id.
	 * 
	 * @param id The sample id
	 * @return The sample identified by the specified id.
	 */
	@GET
	@Path("/sample/{sid}")
	@Produces(MediaType.TEXT_PLAIN)		
	public String getSample(@PathParam("sid") String id);
	
	/**
	 * Fetch a sample by id, testing JSON marshalling.
	 * 
	 * @param id The sample id
	 * @return The sample identified by the specified id, in JSON format.
	 */
	@GET
	@Path("/samplejson")
	@Produces({"application/json"})
	@Consumes({"application/json","application/x-www-form-urlencoded"})		
	public Sample getSampleJson();		
	
	/**
	 * Test service exception
	 * 
	 * @param input arbitrary integer value to pass to the service
	 * @return
	 * @throws ServiceException When input value is greater than 10.
	 */
	@GET
	@Path("/error/{input}")
	@Produces(MediaType.TEXT_PLAIN)		
	public String testException(@PathParam("input") int input) throws ServiceException;
	
}
