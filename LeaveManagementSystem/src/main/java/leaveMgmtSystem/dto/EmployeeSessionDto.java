package leaveMgmtSystem.dto;

import java.sql.Timestamp;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class EmployeeSessionDto {
	
	private int empId;
	private int empTypeId;
	private int actionTypeId;
	private Timestamp sessionCreationTime;
	private int empSessionId;
	private Timestamp lastModifiedtime;
	
	EmployeeSessionDto(){
		
	}

	/**
	 * @return the empId
	 */
	public int getEmpId() {
		return empId;
	}

	/**
	 * @param empId the empId to set
	 */
	public void setEmpId(int empId) {
		this.empId = empId;
	}

	/**
	 * @return the empTypeId
	 */
	public int getEmpTypeId() {
		return empTypeId;
	}

	/**
	 * @param empTypeId the empTypeId to set
	 */
	public void setEmpTypeId(int empTypeId) {
		this.empTypeId = empTypeId;
	}

	/**
	 * @return the actionTypeId
	 */
	public int getActionTypeId() {
		return actionTypeId;
	}

	/**
	 * @param actionTypeId the actionTypeId to set
	 */
	public void setActionTypeId(int actionTypeId) {
		this.actionTypeId = actionTypeId;
	}

	/**
	 * @return the sessionCreationTime
	 */
	public Timestamp getSessionCreationTime() {
		return sessionCreationTime;
	}

	/**
	 * @param sessionCreationTime the sessionCreationTime to set
	 */
	public void setSessionCreationTime(Timestamp sessionCreationTime) {
		this.sessionCreationTime = sessionCreationTime;
	}

	/**
	 * @return the empSessionId
	 */
	public int getEmpSessionId() {
		return empSessionId;
	}

	/**
	 * @param empSessionId the empSessionId to set
	 */
	public void setEmpSessionId(int empSessionId) {
		this.empSessionId = empSessionId;
	}

	/**
	 * @return the lastModifiedtime
	 */
	public Timestamp getLastModifiedtime() {
		return lastModifiedtime;
	}

	/**
	 * @param lastModifiedtime the lastModifiedtime to set
	 */
	public void setLastModifiedtime(Timestamp lastModifiedtime) {
		this.lastModifiedtime = lastModifiedtime;
	}
	
	

}
