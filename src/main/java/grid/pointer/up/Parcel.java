package grid.pointer.up;

public class Parcel {
	
	String to;
	String from;
	String signature;
	String payload;
	String attachment;
	
	public String getTo() {
		return to;
	}
	public void setTo(String to) {
		this.to = to;
	}
	public String getFrom() {
		return from;
	}
	public void setFrom(String from) {
		this.from = from;
	}
	public String getSignature() {
		return signature;
	}
	public void setSignature(String signature) {
		this.signature = signature;
	}
	public String getPayload() {
		return payload;
	}
	public void setPayload(String payload) {
		this.payload = payload;
	}
	public String getAttachment() {
		return attachment;
	}
	public void setAttachment(String attachment) {
		this.attachment = attachment;
	}
	public Parcel(String to, String from, String signature, String payload, String attachment) {
		super();
		this.to = to;
		this.from = from;
		this.signature = signature;
		this.payload = payload;
		this.attachment = attachment;
	}
	
	

}