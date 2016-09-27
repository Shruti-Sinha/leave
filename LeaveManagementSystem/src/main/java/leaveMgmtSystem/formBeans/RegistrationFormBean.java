package leaveMgmtSystem.formBeans;

import java.sql.Timestamp;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class RegistrationFormBean {
	
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
	private int sl;
	private float cl;
	private int pl;
	private int compOff;
	private int matLeave;
	private int patLeave;
	private int year;

	
	
	public RegistrationFormBean() {
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
	 * @return the empCode
	 */
	public String getEmpCode() {
		return empCode;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "RegistrationFormBean [empId=" + empId + ", empCode=" + empCode
				+ ", empFName=" + empFName + ", empMName=" + empMName
				+ ", empLName=" + empLName + ", gender=" + gender + ", email="
				+ email + ", mobile=" + mobile + ", dob=" + dob + ", doj="
				+ doj + ", projectId=" + projectId + ", typeId=" + typeId
				+ ", pwd=" + pwd + ", dtOfCreation=" + dtOfCreation
				+ ", lastModified=" + lastModified + ", securityQuesId="
				+ securityQuesId + ", secutityAns=" + secutityAns
				+ ", accountStatusId=" + accountStatusId + ", approverId1="
				+ approverId1 + ", approverId2=" + approverId2
				+ ", approverId3=" + approverId3 + ", sl=" + sl + ", cl=" + cl
				+ ", pl=" + pl + ", compOff=" + compOff + ", matLeave="
				+ matLeave + ", patLeave=" + patLeave + ", year=" + year + "]";
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


	/**
	 * @return the sl
	 */
	public int getSl() {
		return sl;
	}


	/**
	 * @param sl the sl to set
	 */
	public void setSl(int sl) {
		this.sl = sl;
	}


	/**
	 * @return the cl
	 */
	public float getCl() {
		return cl;
	}


	/**
	 * @param f the cl to set
	 */
	public void setCl(float f) {
		this.cl = f;
	}


	/**
	 * @return the pl
	 */
	public int getPl() {
		return pl;
	}


	/**
	 * @param pl the pl to set
	 */
	public void setPl(int pl) {
		this.pl = pl;
	}


	/**
	 * @return the compOff
	 */
	public int getCompOff() {
		return compOff;
	}


	/**
	 * @param compOff the compOff to set
	 */
	public void setCompOff(int compOff) {
		this.compOff = compOff;
	}


	/**
	 * @return the matLeave
	 */
	public int getMatLeave() {
		return matLeave;
	}


	/**
	 * @param matLeave the matLeave to set
	 */
	public void setMatLeave(int matLeave) {
		this.matLeave = matLeave;
	}


	/**
	 * @return the patLeave
	 */
	public int getPatLeave() {
		return patLeave;
	}


	/**
	 * @param patLeave the patLeave to set
	 */
	public void setPatLeave(int patLeave) {
		this.patLeave = patLeave;
	}


	/**
	 * @return the year
	 */
	public int getYear() {
		return year;
	}


	/**
	 * @param year the year to set
	 */
	public void setYear(int year) {
		this.year = year;
	}
	
	

}
