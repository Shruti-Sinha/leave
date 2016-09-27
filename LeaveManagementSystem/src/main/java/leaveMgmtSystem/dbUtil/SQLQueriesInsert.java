package leaveMgmtSystem.dbUtil;

public class SQLQueriesInsert {
	public static final String INSERT_PROJECT_MASTER = "insert into leave_mgmt_project_master (project_id) values(?)";
	public static final String INSERT_ACCOUNT_MASTER = "insert into leave_mgmt_account_status_master (account_status_desc) values(?)";
	public static final String INSERT_SECURITY_MASTER = "insert into leave_mgmt_security_ques_master(ques_desc) values(?)";
	public static final String INSERT_EMPLOYEE_TYPE = "insert into leave_mgmt_employee_type_master (type_desc) values(?)";
	public static final String INSERT_EMPLYEE_INFO = "insert into leave_mgmt_employee_info_master (emp_code,emp_f_name,emp_m_name,emp_l_name,gender,email,mobile,dob,doj,project_id) values(?,?,?,?,?,?,?,?,?,?)";
	public static final String INSERT_EMPLOYEE_LOGIN_PROFILE = "insert into leave_mgmt_employee_login_profile_master (emp_id,type_id,pwd,dtOfCreation,lastModified,security_que_id,security_ans,account_status_id,approver_id_1,approver_id_2,approver_id_3) values (?,?,?,?,?,?,?,?,?,?,?)";
	public static final String INSERT_LEAVE_TYPE = "insert into leave_mgmt_leave_type (leave_desc) values(?)";
	public static final String INSERT_LEAVE_INSTANCE = "insert into leave_mgmt_leave_instance (leave_type_id,start_dt,end_date,duration,emp_id,project_id,reason,tag) values(?,?,?,?,?,(select project_id from leave_mgmt_employee_info_master where emp_id=?),?,?)";
	public static final String INSERT_LEAVE_STATUS = "insert into leave_mgmt_leave_status_master(leave_status_desc) values(?)";
	public static final String INSERT_EMPLOYEE_LEAVE = "insert into leave_mgmt_employee_leave_table(leave_id,emp_id,leave_status_code,creation_time,last_modified_time,approver1_id,approver2_id,approver3_id) values(?,?,?,?,?,(select approver_id_1 from leave_mgmt_employee_login_profile_master where emp_id=?),(select approver_id_2 from leave_mgmt_employee_login_profile_master where emp_id=?),(select approver_id_1 from leave_mgmt_employee_login_profile_master where emp_id=?))";
	public static final String INSERT_LEAVE_CREDITED = "insert into leave_mgmt_leave_credited(emp_id,sl,cl,pl,comp_off,mat_leave,pet_leave,fin_year) values((select emp_id from leave_mgmt_employee_info_master where emp_code=?),?,?,?,?,?,?,?)";
	public static final String INSERT_ACTION_PERMISSION = "inSert into leave_mgmt_action_permission (action_desc) values(?)";
	public static final String INSERT_EMPLOYEE_SESSION = "insert into leave_mgmt_emp_session (emp_id,emp_type,emp_action_type,session_creation_time,emp_session_id,last_modified_time) values(?,?,?,?,?,?)";
	public static final String INSERT_EMPLOYEE_MANAGER = "insert into leave_mgmt_emp_mgr (mgr_id,emp_id,status) values (?,?,?)";
}
