package leaveMgmtSystem.dao;

import leaveMgmtSystem.exception.EmployeeNotFoundExceptions;
import leaveMgmtSystem.formBeans.ApplyLeaveBean;

public interface LeaveApplicationDaoI {
	
	public int applyLeave(ApplyLeaveBean applyLeave,String empCode) throws EmployeeNotFoundExceptions;
	public int updateLeaveDet(int leaveId);
	public int viewLeave(String empId,int leaveId);
	public int viewAll(String empId);

}
