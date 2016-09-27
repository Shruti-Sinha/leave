package leaveMgmtSystem.dto;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class LeaveTypeDto {
	
	private int typeId;
	private String typeDesc;
	
	public LeaveTypeDto() {
		// TODO Auto-generated constructor stub
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
	 * @return the typeDesc
	 */
	public String getTypeDesc() {
		return typeDesc;
	}

	/**
	 * @param typeDesc the typeDesc to set
	 */
	public void setTypeDesc(String typeDesc) {
		this.typeDesc = typeDesc;
	}

	
	
	
	

}
