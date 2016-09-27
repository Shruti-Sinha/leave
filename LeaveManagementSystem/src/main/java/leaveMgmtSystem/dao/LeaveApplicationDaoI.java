package leaveMgmtSystem.dao;

import leaveMgmtSystem.formBeans.ApplyLeaveBean;

public interface LeaveApplicationDaoI {
	
	public int applyLeave(ApplyLeaveBean applyLeave,String empCode);
	public int updateLeaveDet(int leaveId);
	public int viewLeave(String empId,int leaveId);
	public int viewAll(String empId);

}
