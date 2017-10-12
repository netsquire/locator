package grid.pointer.up;

import java.util.Map;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

@Path("/")
public class Rest {

	static Holdable storageService = new MemoryStore();
	static Gson gson = new Gson();

	@GET
	//@Path("/")
	@Produces(MediaType.TEXT_PLAIN)
	public String index() {	return "Head request"; }

	@GET
	@Path("/empty")
	@Produces(MediaType.TEXT_PLAIN)
	public String emptyId() { return "Empty request";}

	@GET
	@Path("/info/{id}")
	@Produces(MediaType.TEXT_PLAIN)
	public String getIt(@PathParam("id") String id) {		return "Information about: " + id + storageService.getIp(id); }

	@GET
	@Path("/{id}/ip/{ip}")
	@Produces(MediaType.TEXT_PLAIN)
	public String putIp(@PathParam("id") String id, @PathParam("ip") String ip) {
		storageService.putIp(id, ip);
		return "OK " + id + " + " + ip;
	}
	
	@GET
	@Path("/{id}/ip")
	@Produces(MediaType.TEXT_PLAIN)
	public String getIp(@PathParam("id") String id) {		return storageService.getIp(id);}
	
	@GET
	@Path("/dump")
	@Produces(MediaType.APPLICATION_JSON)
	public String dump() {		
		return gson.toJson(storageService.list(), new TypeToken<Map<String, String>>() {}.getType());
	}
	
}
