package leaveMgmtSystem.dto;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class LeaveStatusDto {
	
	private int leaveStatusId;
	private String leaveStatusDesc;
	
	LeaveStatusDto(){
		
	}

	/**
	 * @return the leaveStatusId
	 */
	public int getLeaveStatusId() {
		return leaveStatusId;
	}

	/**
	 * @param leaveStatusId the leaveStatusId to set
	 */
	public void setLeaveStatusId(int leaveStatusId) {
		this.leaveStatusId = leaveStatusId;
	}

	/**
	 * @return the leaveStatusDesc
	 */
	public String getLeaveStatusDesc() {
		return leaveStatusDesc;
	}

	/**
	 * @param leaveStatusDesc the leaveStatusDesc to set
	 */
	public void setLeaveStatusDesc(String leaveStatusDesc) {
		this.leaveStatusDesc = leaveStatusDesc;
	}
	
	

}
