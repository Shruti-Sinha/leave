package leaveMgmtSystem.dto;

import java.sql.Timestamp;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class EmployeeLeaveDto {
	
	private int leaveId;
	private int empId;
	private int leaveStatusCode;
	private Timestamp creationTime;
	private Timestamp lastmodified;
	private int approverId1;
	private int approverId2;
	private int approverId3;
	
	
	EmployeeLeaveDto(){
		
	}


	/**
	 * @return the leaveId
	 */
	public int getLeaveId() {
		return leaveId;
	}


	/**
	 * @param leaveId the leaveId to set
	 */
	public void setLeaveId(int leaveId) {
		this.leaveId = leaveId;
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
	 * @return the leaveStatusCode
	 */
	public int getLeaveStatusCode() {
		return leaveStatusCode;
	}


	/**
	 * @param leaveStatusCode the leaveStatusCode to set
	 */
	public void setLeaveStatusCode(int leaveStatusCode) {
		this.leaveStatusCode = leaveStatusCode;
	}


	/**
	 * @return the creationTime
	 */
	public Timestamp getCreationTime() {
		return creationTime;
	}


	/**
	 * @param creationTime the creationTime to set
	 */
	public void setCreationTime(Timestamp creationTime) {
		this.creationTime = creationTime;
	}


	/**
	 * @return the lastmodified
	 */
	public Timestamp getLastmodified() {
		return lastmodified;
	}


	/**
	 * @param lastmodified the lastmodified to set
	 */
	public void setLastmodified(Timestamp lastmodified) {
		this.lastmodified = lastmodified;
	}


	/**
	 * @return the approverId1
	 */
	public int getApproverId1() {
		return approverId1;
	}


	/**
	 * @param approverId1 the approverId1 to set
	 */
	public void setApproverId1(int approverId1) {
		this.approverId1 = approverId1;
	}


	/**
	 * @return the approverId2
	 */
	public int getApproverId2() {
		return approverId2;
	}


	/**
	 * @param approverId2 the approverId2 to set
	 */
	public void setApproverId2(int approverId2) {
		this.approverId2 = approverId2;
	}


	/**
	 * @return the approverId3
	 */
	public int getApproverId3() {
		return approverId3;
	}


	/**
	 * @param approverId3 the approverId3 to set
	 */
	public void setApproverId3(int approverId3) {
		this.approverId3 = approverId3;
	}
	
	

}
