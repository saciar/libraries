package crm.libraries.abm.entities;

import java.util.Date;

public class UserAccessHistory {
	private String userId;
	private String accessId;
	private String type;
	private Date date;
	
	public UserAccessHistory() {
	}
			
	public UserAccessHistory(String userId, String accessId, String type, Date date) {
		this.userId = userId;
		this.accessId = accessId;
		this.type = type;
		this.date = date;
	}

	public String getAccessId() {
		return accessId;
	}

	public void setAccessId(String accessId) {
		this.accessId = accessId;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}
	
	
	
	
}
