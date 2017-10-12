package grid.pointer.up;

import java.util.Map;

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
	public Map<String, String> list();

	/**
	 * 
	 * @param id
	 * @return
	 */
	String getIp(String id);

}