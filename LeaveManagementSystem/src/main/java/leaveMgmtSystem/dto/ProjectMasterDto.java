package leaveMgmtSystem.dto;

import javax.xml.bind.annotation.XmlRootElement;


@XmlRootElement
public class ProjectMasterDto {
	private int projectId;
	private String projectDesc;
	
	ProjectMasterDto(){
		
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
	 * @return the projectDesc
	 */
	public String getProjectDesc() {
		return projectDesc;
	}

	/**
	 * @param projectDesc the projectDesc to set
	 */
	public void setProjectDesc(String projectDesc) {
		this.projectDesc = projectDesc;
	}
	
	
	

}
