package grid.pointer.up;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 * 
 * TODO: move to JSON as defaults
 * TODO: add version for updating
 * 
 * @author netsquire
 *
 */
@Path("/")
public class Rest {

	private static Holdable memoryService = new MemoryService();

	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String index() {	return "Head request"; }

	@GET
	@Path("/version")
	@Produces(MediaType.TEXT_PLAIN)
	/*
	  TODO: to get version from POM
	 */
	public String emptyId() { return "Version: 0.0.1";}

	@GET
	@Path("/info/{id}")
	@Produces(MediaType.TEXT_PLAIN)
	public String getIt(@PathParam("id") String id) {
		return "Information about: " + id + memoryService.getIp(id);
	}
	
	@GET
	@Path("/{id}/ip/{ip}")
	@Produces(MediaType.APPLICATION_JSON)
	public String announceIp(@PathParam("id") String id, @PathParam("ip") String ip) {
		// TODO: add timestamp to output
		return memoryService.putIp(id, ip);
	}
	
	@GET
	@Path("/dump")
	@Produces(MediaType.APPLICATION_JSON)
	public String dump() {		
		return memoryService.getJsonedContactList();
	}
}
