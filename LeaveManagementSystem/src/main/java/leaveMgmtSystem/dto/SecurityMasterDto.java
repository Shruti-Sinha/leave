package leaveMgmtSystem.dto;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class SecurityMasterDto {

	private int quesId;
	private String quesDesc;

	public SecurityMasterDto() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @return the quesId
	 */
	public int getQuesId() {
		return quesId;
	}

	/**
	 * @param quesId
	 *            the quesId to set
	 */
	public void setQuesId(int quesId) {
		this.quesId = quesId;
	}

	/**
	 * @return the quesDesc
	 */
	public String getQuesDesc() {
		return quesDesc;
	}

	/**
	 * @param quesDesc
	 *            the quesDesc to set
	 */
	public void setQuesDesc(String quesDesc) {
		this.quesDesc = quesDesc;
	}

}
