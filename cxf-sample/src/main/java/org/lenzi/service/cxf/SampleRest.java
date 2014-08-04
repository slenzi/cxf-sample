/**
 * 
 */
package org.lenzi.service.cxf;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;


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
	
}
