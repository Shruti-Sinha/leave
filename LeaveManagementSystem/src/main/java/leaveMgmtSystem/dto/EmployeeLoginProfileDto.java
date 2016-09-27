package leaveMgmtSystem.dto;

import java.sql.Timestamp;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class EmployeeLoginProfileDto {
	
	private int empId;
	private int typeId;
	private String pwd;
	private Timestamp dtOfCreation;
	private Timestamp lastModified;
	private int securityQuesId;
	private String secutityAns;
	private int accountStatusId;
	private int approverId1;
	private int approverId2;
	private int approverId3;
	
	public EmployeeLoginProfileDto() {
		// TODO Auto-generated constructor stub
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
	 * @return the typeId
	 */
	public int getTypeId() {
		return typeId;
	}

	/**
	 * @param typeId the typeId to set
	 */
	public void setTypeId(int typeId) {
		this.typeId = typeId;
	}

	/**
	 * @return the pwd
	 */
	public String getPwd() {
		return pwd;
	}

	/**
	 * @param pwd the pwd to set
	 */
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	/**
	 * @return the dtOfCreation
	 */
	public Timestamp getDtOfCreation() {
		return dtOfCreation;
	}

	/**
	 * @param dtOfCreation the dtOfCreation to set
	 */
	public void setDtOfCreation(Timestamp dtOfCreation) {
		this.dtOfCreation = dtOfCreation;
	}

	/**
	 * @return the lastModified
	 */
	public Timestamp getLastModified() {
		return lastModified;
	}

	/**
	 * @param lastModified the lastModified to set
	 */
	public void setLastModified(Timestamp lastModified) {
		this.lastModified = lastModified;
	}

	/**
	 * @return the securityQuesId
	 */
	public int getSecurityQuesId() {
		return securityQuesId;
	}

	/**
	 * @param securityQuesId the securityQuesId to set
	 */
	public void setSecurityQuesId(int securityQuesId) {
		this.securityQuesId = securityQuesId;
	}

	/**
	 * @return the secutityAns
	 */
	public String getSecutityAns() {
		return secutityAns;
	}

	/**
	 * @param secutityAns the secutityAns to set
	 */
	public void setSecutityAns(String secutityAns) {
		this.secutityAns = secutityAns;
	}

	/**
	 * @return the accountStatusId
	 */
	public int getAccountStatusId() {
		return accountStatusId;
	}

	/**
	 * @param accountStatusId the accountStatusId to set
	 */
	public void setAccountStatusId(int accountStatusId) {
		this.accountStatusId = accountStatusId;
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
