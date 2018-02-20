package grid.pointer.up;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import model.Contact;

import java.lang.reflect.Type;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class MemoryService implements Holdable {

	private String uriString;
	private static Gson gson = new Gson();
	private static Holdable storageService = new MemoryService();

	private Set<Contact> locations = new HashSet<Contact>();

	public String getUriString(){ return uriString;}

	public void putIp(String id, String ip) {
		locations.add(new Contact(id, ip));
	}
	
	public List<Contact> list(){
		return new LinkedList<Contact>(locations);
	}

	public String getIp(String id) {
		return "TBD!";
	}

	public String getJsonedContactList(){
		return gson.toJson(storageService.list(), typeAsContactList());
	}

	private Type typeAsContactList() {
		return new TypeToken<List<Contact>>() {}.getType();
	}
}
