package leaveMgmtSystem.dto;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class EmployeeTypeDto {

	private int empId;
	private String empDesc;

	public EmployeeTypeDto() {
		// TODO Auto-generated constructor stub
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
	 * @return the empDesc
	 */
	public String getEmpDesc() {
		return empDesc;
	}

	/**
	 * @param empDesc
	 *            the empDesc to set
	 */
	public void setEmpDesc(String empDesc) {
		this.empDesc = empDesc;
	}

}
