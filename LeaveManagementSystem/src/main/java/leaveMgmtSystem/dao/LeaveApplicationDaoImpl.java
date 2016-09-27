/**
 * 
 */
package leaveMgmtSystem.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import leaveMgmtSystem.dbUtil.DBConnection;
import leaveMgmtSystem.dbUtil.SQLQueriesInsert;
import leaveMgmtSystem.dbUtil.SQLQueriesSelect;
import leaveMgmtSystem.exception.EmployeeNotFoundExceptions;
import leaveMgmtSystem.formBeans.ApplyLeaveBean;
import leaveMgmtSystem.utility.DateConversion;
import leaveMgmtSystem.utility.StringConstants;

/**
 * @author ShrutiPC
 *
 */
public class LeaveApplicationDaoImpl implements LeaveApplicationDaoI {

	Connection conObj=null;
	PreparedStatement pst = null;

	
	@Override
	public int applyLeave(ApplyLeaveBean applyLeaveBean,String empCode) throws EmployeeNotFoundExceptions {
		// TODO Auto-generated method stub
		conObj = (Connection) DBConnection.getDBConnection();
		int empId=0,leaveId=0,empLeave=0,insertResult=0;
		
		try {
			conObj.setAutoCommit(false);
			pst=conObj.prepareStatement(SQLQueriesSelect.SELECT_EMPLOYEE_CODE);
			pst.setString(1, empCode);
			ResultSet res=pst.executeQuery();
			res=pst.executeQuery();
			if (res.next()) {
				empId = res.getInt(1);
				System.out.println(empId+"<<<<<<<:");
				
			applyLeaveBean.setEmpId(empId);

				System.out.println(empId);
			}
			
			
			pst = conObj.prepareStatement(SQLQueriesInsert.INSERT_LEAVE_INSTANCE,
					Statement.RETURN_GENERATED_KEYS);
			//leave_type_id,start_dt,end_date,duration,emp_id,project_id,reason,tag
			//pst.setInt(1, applyLeave.getEmpId());
			
			pst.setInt(1, applyLeaveBean.getLeaveTypeId());
			pst.setDate(2, DateConversion.stringToSQLDate(applyLeaveBean.getStartDate()));
			pst.setDate(3, DateConversion.stringToSQLDate(applyLeaveBean.getEndDate()));
			pst.setFloat(4, applyLeaveBean.getDuration());
			pst.setInt(5, applyLeaveBean.getEmpId());
			pst.setInt(6,applyLeaveBean.getEmpId());
			pst.setString(7, applyLeaveBean.getReason());
			pst.setString(8, applyLeaveBean.getTag());
			
			int result=pst.executeUpdate();
			System.out.println(">>>>"+result);
			res = pst.getGeneratedKeys();

			if (res.next()) {
				leaveId = res.getInt(1);
				System.out.println(leaveId+"<<<<<<<:");
				
			applyLeaveBean.setLeaveId(leaveId);

				System.out.println(leaveId);
				applyLeaveBean.setLeaveStatusCode(StringConstants.LEAVE_STATUS_CODE_APPLIED);
				pst = conObj
						.prepareStatement(SQLQueriesInsert.INSERT_EMPLOYEE_LEAVE);
				//leave_id,emp_id,leave_status_code,
				//creation_time,last_modified_time,approver1_id,approver2_id,approver3_id
				pst.setInt(1, leaveId);
				pst.setInt(2, applyLeaveBean.getEmpId());
				pst.setInt(3,applyLeaveBean.getLeaveStatusCode());
				pst.setTimestamp(4, DateConversion.getcurrentTimeStamp());
				pst.setTimestamp(5,	DateConversion.getcurrentTimeStamp());
				pst.setInt(6,applyLeaveBean.getEmpId());
				pst.setInt(7,applyLeaveBean.getEmpId());
				pst.setInt(8,applyLeaveBean.getEmpId());
				empLeave = pst.executeUpdate();
			}
			
			if(empLeave==0||result==0){
				System.out.println("Record not inserted");
				conObj.rollback();
				insertResult = 0;
			}
			else {
				conObj.commit();
				System.out.println("Record inserted");
				insertResult = 1;
			}
		
			

		
		
		}catch(Exception e){
			throw new EmployeeNotFoundExceptions(e.toString());
		}
		return insertResult;
	}

	@Override
	public int updateLeaveDet(int leaveId) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int viewLeave(String empId, int leaveId) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int viewAll(String empId) {
		// TODO Auto-generated method stub
		return 0;
	}

}
