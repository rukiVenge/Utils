package SMSMessageGenerator;

public class SMS {
	private String msg;
	private String headerFooter;
	private String schedule;
	private String recipient;
	private String headerFooterFlag;
	private String delimeter;
	
	
	public SMS() {
		super();
	}


	public SMS(String msg, String headerFooter, String schedule,
			String recipient, String headerFooterFlag, String delimeter) {
		super();
		this.msg = msg;
		this.headerFooter = headerFooter;
		this.schedule = schedule;
		this.recipient = recipient;
		this.headerFooterFlag = headerFooterFlag;
		this.delimeter = delimeter;
	}


	public String getMsg() {
		return msg;
	}


	public void setMsg(String msg) {
		this.msg = msg;
	}


	public String getHeaderFooter() {
		return headerFooter;
	}


	public void setHeaderFooter(String headerFooter) {
		this.headerFooter = headerFooter;
	}


	public String getSchedule() {
		return schedule;
	}


	public void setSchedule(String schedule) {
		this.schedule = schedule;
	}


	public String getRecipient() {
		return recipient;
	}


	public void setRecipient(String recipient) {
		this.recipient = recipient;
	}


	public String getHeaderFooterFlag() {
		return headerFooterFlag;
	}


	public void setHeaderFooterFlag(String headerFooterFlag) {
		this.headerFooterFlag = headerFooterFlag;
	}


	public String getDelimeter() {
		return delimeter;
	}


	public void setDelimeter(String delimeter) {
		this.delimeter = delimeter;
	}
	
	
	
	
}
