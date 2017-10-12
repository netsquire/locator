package grid.pointer.up;

import java.util.HashMap;
import java.util.Map;

public class MemoryStore implements Holdable {

	private String uriString;
	private Map<String, String> locations = new HashMap<String, String>();

	public String getUriString(){ return uriString;}

	public MemoryStore() {	
		locations = new HashMap<String, String>();
	}

	public void putIp(String id, String ip) {
		locations.put(id, ip);
	}
	
	public Map<String, String> list(){
		return locations;
	}

	public String getIp(String id) {
		return locations.get(id);
	}
}
