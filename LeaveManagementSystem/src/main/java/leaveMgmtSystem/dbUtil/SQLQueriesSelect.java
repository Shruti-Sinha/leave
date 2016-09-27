package leaveMgmtSystem.dbUtil;

public class SQLQueriesSelect {
	
	public static final String SELECT_EMPLOYEE_CODE="select emp_id from leave_mgmt_employee_info_master where emp_code=?";
	
	public static final String SELECT_PROJECT_MASTER = "select * from  leave_mgmt_project_master";
	public static final String SELECT_ACCOUNT_STATUS_MASTER = "select * from leave_mgmt_account_status_master";
	public static final String SELECT_SECURITY_MASTER = "select * from leave_mgmt_security_ques_master";
	public static final String SELECT_EMPLOYEE_TYPE = "select * from leave_mgmt_employee_type_master";
	public static final String SELECT_EMPLOYEE_INFO_MASTER = "select * from leave_mgmt_employee_info_master where emp_code=?";
	public static final String SELECT_EMPLOYEE_INFO_MASTER_ID = "select emp_code,emp_f_name,emp_m_name,emp_l_name,gender,email,mobile,dob,doj,project_id from leave_mgmt_employee_info_master where emp_id=?";

	public static final String SELECT_EMPLOYEE_LOGIN_PROFILE_MASTER = "select * from leave_mgmt_employee_login_profile_master";
	public static final String SELECT_LEAVE_TYPE = "SELECT * FROM leave_mgmt_leave_type";
	public static final String SELECT_LEAVE_INSTANCE = "select * from leave_mgmt_leave_instance";
	public static final String SELECT_LEAVE_STATUS_MASTER = "select * from leave_mgmt_leave_status_master";
	public static final String SELECT_EMPLOYEE_LEAVE = "select * from leave_mgmt_employee_leave_table";
	public static final String SELECT_LEAVE_CREDITED = "select * from leave_mgmt_leave_credited";
	public static final String SELECT_ACTION_PERMISSION = "select * from leave_mgmt_action_permission";
	public static final String SELECT_EMPLOYEE_SESSION = "select * from leave_mgmt_emp_session";
	public static final String SELECT_EMPLOYEE_MANAGER = "select * from leave_mgmt_emp_mgr";
	public static final String SELECT_EMPLOYEE_LOGIN_PROFILE_MASTER_HR = "select * from leave_mgmt_employee_login_profile_master where type_id in (select type_id from leave_mgmt_employee_type_master where type_desc='HR')";
	public static final String SELECT_EMPLOYEE_LOGIN_PROFILE_MASTER_AWATING = "select pm.emp_id ,im.emp_f_name from "+
" leave_mgmt_employee_login_profile_master pm "+

			" inner join "+

			" leave_mgmt_employee_info_master im "+
			" on pm.emp_id=im.emp_id "+
			" inner join "+
			" leave_mgmt_account_status_master acc"+ 
			" on"+
			" acc.account_status_id = pm.account_status_id "+
			" where acc.account_status_id=?";
	public static final String SELECT_EMPLOYEE_DETAILS = "select * from"+
" leave_mgmt_employee_info_master info"+
" INNER JOIN "+
" leave_mgmt_employee_login_profile_master pm on info.emp_id=pm.emp_id where info.emp_code=?";

}
