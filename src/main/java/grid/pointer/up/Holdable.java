package grid.pointer.up;

import java.util.List;

public interface Holdable {

	/**
	 * 
	 * @return
	 */
	String getUriString();

	/**
	 * 
	 * @param id
	 * @param ip
	 */
	void putIp(String id, String ip);

	/**
	 * 
	 * @return
	 */
	public List<Contact> list();

	/**
	 * 
	 * @param id
	 * @return
	 */
	String getIp(String id);

	public String getJsonedContactList();
}