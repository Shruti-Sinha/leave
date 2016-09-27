package leaveMgmtSystem.dto;

import javax.xml.bind.annotation.XmlRootElement;


@XmlRootElement
public class AccountStatusMasterDto {

	private int accountStatusId;
	private String accountStatusDesc;

	public AccountStatusMasterDto() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @return the accountStatusId
	 */
	public int getAccountStatusId() {
		return accountStatusId;
	}

	/**
	 * @param accountStatusId
	 *            the accountStatusId to set
	 */
	public void setAccountStatusId(int accountStatusId) {
		this.accountStatusId = accountStatusId;
	}

	/**
	 * @return the accountStatusDesc
	 */
	public String getAccountStatusDesc() {
		return accountStatusDesc;
	}

	/**
	 * @param accountStatusDesc
	 *            the accountStatusDesc to set
	 */
	public void setAccountStatusDesc(String accountStatusDesc) {
		this.accountStatusDesc = accountStatusDesc;
	}

}
