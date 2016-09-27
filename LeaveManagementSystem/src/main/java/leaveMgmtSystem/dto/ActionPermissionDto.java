package leaveMgmtSystem.dto;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class ActionPermissionDto {
	
	private int actionId;
	private String actionDesc;
	
	public ActionPermissionDto() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @return the actionId
	 */
	public int getActionId() {
		return actionId;
	}

	/**
	 * @param actionId the actionId to set
	 */
	public void setActionId(int actionId) {
		this.actionId = actionId;
	}

	/**
	 * @return the actionDesc
	 */
	public String getActionDesc() {
		return actionDesc;
	}

	/**
	 * @param actionDesc the actionDesc to set
	 */
	public void setActionDesc(String actionDesc) {
		this.actionDesc = actionDesc;
	}
	
	
	
	
}
