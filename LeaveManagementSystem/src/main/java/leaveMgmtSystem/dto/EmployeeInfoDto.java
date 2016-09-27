package leaveMgmtSystem.dto;

import javax.xml.bind.annotation.XmlRootElement;


@XmlRootElement
public class EmployeeInfoDto {
	
	private int empId;
	private String empCode;
	private String empFName;
	private String empMName;
	private String empLName;
	private String gender;
	private String email;
	private int mobile;
	private String dob;
	private String doj;
	private int projectId;
	
	EmployeeInfoDto(){
		
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
	 * @return the empCode
	 */
	public String getEmpCode() {
		return empCode;
	}

	/**
	 * @param empCode the empCode to set
	 */
	public void setEmpCode(String empCode) {
		this.empCode = empCode;
	}

	/**
	 * @return the empFName
	 */
	public String getEmpFName() {
		return empFName;
	}

	/**
	 * @param empFName the empFName to set
	 */
	public void setEmpFName(String empFName) {
		this.empFName = empFName;
	}

	/**
	 * @return the empMName
	 */
	public String getEmpMName() {
		return empMName;
	}

	/**
	 * @param empMName the empMName to set
	 */
	public void setEmpMName(String empMName) {
		this.empMName = empMName;
	}

	/**
	 * @return the empLName
	 */
	public String getEmpLName() {
		return empLName;
	}

	/**
	 * @param empLName the empLName to set
	 */
	public void setEmpLName(String empLName) {
		this.empLName = empLName;
	}

	/**
	 * @return the gender
	 */
	public String getGender() {
		return gender;
	}

	/**
	 * @param gender the gender to set
	 */
	public void setGender(String gender) {
		this.gender = gender;
	}

	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * @return the mobile
	 */
	public int getMobile() {
		return mobile;
	}

	/**
	 * @param mobile the mobile to set
	 */
	public void setMobile(int mobile) {
		this.mobile = mobile;
	}

	/**
	 * @return the dob
	 */
	public String getDob() {
		return dob;
	}

	/**
	 * @param dob the dob to set
	 */
	public void setDob(String dob) {
		this.dob = dob;
	}

	/**
	 * @return the doj
	 */
	public String getDoj() {
		return doj;
	}

	/**
	 * @param doj the doj to set
	 */
	public void setDoj(String doj) {
		this.doj = doj;
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
	
	
	

}
