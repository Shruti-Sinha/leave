package leaveMgmtSystem.dto;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class EmployeeManagerDto {

	private int mgrId;
	private int empId;
	private String status;

	public EmployeeManagerDto() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @return the mgrId
	 */
	public int getMgrId() {
		return mgrId;
	}

	/**
	 * @param mgrId
	 *            the mgrId to set
	 */
	public void setMgrId(int mgrId) {
		this.mgrId = mgrId;
	}

	/**
	 * @return the empId
	 */
	public int getEmpId() {
		return empId;
	}

	/**
	 * @param empId
	 *            the empId to set
	 */
	public void setEmpId(int empId) {
		this.empId = empId;
	}

	/**
	 * @return the status
	 */
	public String getStatus() {
		return status;
	}

	/**
	 * @param status
	 *            the status to set
	 */
	public void setStatus(String status) {
		this.status = status;
	}

}
