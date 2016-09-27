package leaveMgmtSystem.formBeans;

import java.sql.Timestamp;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class ApplyLeaveBean {
	
	private int leaveId;
	private int empId;
	private int leaveStatusCode;
	private Timestamp creationTime;
	private Timestamp lastmodified;
	private int approverId1;
	private int approverId2;
	private int approverId3;
	private int leaveTypeId;
	private String startDate;
	private String endDate;
	private float duration;
	private int projectId;
	private String reason;
	private String tag;
	
	public ApplyLeaveBean() {
		// TODO Auto-generated constructor stub
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

	/**
	 * @return the leaveTypeId
	 */
	public int getLeaveTypeId() {
		return leaveTypeId;
	}

	/**
	 * @param leaveTypeId the leaveTypeId to set
	 */
	public void setLeaveTypeId(int leaveTypeId) {
		this.leaveTypeId = leaveTypeId;
	}

	/**
	 * @return the startDate
	 */
	public String getStartDate() {
		return startDate;
	}

	/**
	 * @param startDate the startDate to set
	 */
	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}

	/**
	 * @return the endDate
	 */
	public String getEndDate() {
		return endDate;
	}

	/**
	 * @param endDate the endDate to set
	 */
	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}

	/**
	 * @return the duration
	 */
	public float getDuration() {
		return duration;
	}

	/**
	 * @param duration the duration to set
	 */
	public void setDuration(float duration) {
		this.duration = duration;
	}

	/**
	 * @return the projectId
	 */
	public int getProjectId() {
		return projectId;
	}

	/**
	 * @param projectId the projectId to set
	 */
	public void setProjectId(int projectId) {
		this.projectId = projectId;
	}

	/**
	 * @return the reason
	 */
	public String getReason() {
		return reason;
	}

	/**
	 * @param reason the reason to set
	 */
	public void setReason(String reason) {
		this.reason = reason;
	}

	/**
	 * @return the tag
	 */
	public String getTag() {
		return tag;
	}

	/**
	 * @param tag the tag to set
	 */
	public void setTag(String tag) {
		this.tag = tag;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "ApplyLeaveBean [leaveId=" + leaveId + ", empId=" + empId
				+ ", leaveStatusCode=" + leaveStatusCode + ", creationTime="
				+ creationTime + ", lastmodified=" + lastmodified
				+ ", approverId1=" + approverId1 + ", approverId2="
				+ approverId2 + ", approverId3=" + approverId3
				+ ", leaveTypeId=" + leaveTypeId + ", startDate=" + startDate
				+ ", endDate=" + endDate + ", duration=" + duration
				+ ", projectId=" + projectId + ", reason=" + reason + ", tag="
				+ tag + "]";
	}
	
	


	

}
