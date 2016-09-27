package leaveMgmtSystem.dbUtil;

public class SQLQueriesUpdate {
	
	public static final String UPD_EMP_PROJECT_ID="update leave_mgmt_employee_info_master set project_id=? where emp_code=?";
	public static final String UPD_EMP_INFO="update leave_mgmt_employee_info_master set  emp_code=?,emp_f_name=?,emp_m_name=?,emp_l_name=?,gender=?,email=?,mobile=?,dob=?,doj=?,project_id=? where emp_code=?";
	public static final String UPD_EMPLOYEE_LOGIN_PROFILE_EDIT="update leave_mgmt_employee_login_profile_master set pwd=?,security_que_id=?,security_ans=?,approver_id_1=?,approver_id_2=?,approver_id_3=? where emp_id=?";
	public static final String UPD_EMPLOYEE_LOGIN_PROFILE_ADMIN="update leave_mgmt_employee_login_profile_master set type_id=?,lastModified=?,account_status_id=?,approver_id_1=?,approver_id_2=?,approver_id_3=? where emp_id=(select emp_id from leave_mgmt_employee_info_master where emp_code=?)";
	public static final String UPD_LEAVE_INSTANCE="update leave_mgmt_leave_instance set leave_type_id=?,start_dt=?,end_date=?,duration=?,emp_id=?,project_id=?,reason=?,tag=? where leave_id=? ";
	public static final String UPD_EMPLOYEE_LEAVE="update leave_mgmt_employee_leave_table set leave_status_code=?,last_modified_time=?,approver1_id=?,approver2_id=?,approver3_id=? where leave_id=?";
	public static final String UPD_LEAVE_CREDITED_ADMIN="update leave_mgmt_leave_credited set sl=?,cl=?,pl=?,comp_off=?,mat_leave=?,pet_leave=?,fin_year=? where emp_id=?";
	public static final String UPD_EMPLOYEE_MANAGER="update leave_mgmt_emp_mgr set status=? where emp_id=?";

}
