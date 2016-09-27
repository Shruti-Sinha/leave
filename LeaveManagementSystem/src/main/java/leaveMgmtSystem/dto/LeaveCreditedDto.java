package leaveMgmtSystem.dto;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class LeaveCreditedDto {

	private int empId;
	private int sl;
	private int cl;
	private int pl;
	private int compOff;
	private int matLeave;
	private int patLeave;
	private int year;

	LeaveCreditedDto() {

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
	 * @return the sl
	 */
	public int getSl() {
		return sl;
	}

	/**
	 * @param sl
	 *            the sl to set
	 */
	public void setSl(int sl) {
		this.sl = sl;
	}

	/**
	 * @return the cl
	 */
	public int getCl() {
		return cl;
	}

	/**
	 * @param cl
	 *            the cl to set
	 */
	public void setCl(int cl) {
		this.cl = cl;
	}

	/**
	 * @return the pl
	 */
	public int getPl() {
		return pl;
	}

	/**
	 * @param pl
	 *            the pl to set
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
	 * @param compOff
	 *            the compOff to set
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
	 * @param matLeave
	 *            the matLeave to set
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
	 * @param patLeave
	 *            the patLeave to set
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
	 * @param year
	 *            the year to set
	 */
	public void setYear(int year) {
		this.year = year;
	}

}
