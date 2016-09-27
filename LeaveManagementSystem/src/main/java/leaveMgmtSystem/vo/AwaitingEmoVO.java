package leaveMgmtSystem.vo;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class AwaitingEmoVO implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -1013112229780053199L;
	private Integer empId;
	private String empFname;
	/**
	 * @return the empId
	 */
	public Integer getEmpId() {
		return empId;
	}
	/**
	 * @param empId the empId to set
	 */
	public void setEmpId(Integer empId) {
		this.empId = empId;
	}
	/**
	 * @return the empFname
	 */
	public String getEmpFname() {
		return empFname;
	}
	/**
	 * @param empFname the empFname to set
	 */
	public void setEmpFname(String empFname) {
		this.empFname = empFname;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "AwaitingEmoVO [empId=" + empId + ", empFname=" + empFname + "]";
	}
	
	

}
