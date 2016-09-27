package leaveMgmtSystem.test;

import leaveMgmtSystem.dao.EmployeeRegistraionDaoI;
import leaveMgmtSystem.dao.EmployeeRegistrationDaoImpl;
import leaveMgmtSystem.dao.LeaveApplicationDaoI;
import leaveMgmtSystem.dao.LeaveApplicationDaoImpl;
import leaveMgmtSystem.exception.DatabaseExceptions;
import leaveMgmtSystem.exception.EmployeeNotFoundExceptions;
import leaveMgmtSystem.formBeans.ApplyLeaveBean;
import leaveMgmtSystem.formBeans.RegistrationFormBean;
import leaveMgmtSystem.service.EmployeeRegistrationServiceI;
import leaveMgmtSystem.service.EmployeeRegistrationServiceImpl;

public class TestApp {
	
	public static void main(String[] args) throws DatabaseExceptions, EmployeeNotFoundExceptions {
		TestApp test=new TestApp();
		RegistrationFormBean regFBean=new RegistrationFormBean();
		EmployeeRegistraionDaoI empReg=new EmployeeRegistrationDaoImpl();
		LeaveApplicationDaoI applyLeave=new LeaveApplicationDaoImpl();
		test.applyLeave("AL003", applyLeave);
		
		
		
		

		
		
		
		
		
		
	}
	
	public static void insert(RegistrationFormBean regFBean,EmployeeRegistrationDaoImpl empReg){
		regFBean.setAccountStatusId(500);
		regFBean.setDob("18-01-90");
		regFBean.setDoj("10-02-16");
		regFBean.setEmail("DaoTest4@gmail.com");
		regFBean.setEmpCode("AL004");
		regFBean.setEmpFName("DAO");
		regFBean.setEmpLName("Test");
		regFBean.setGender("F");
		regFBean.setMobile(1234567894);
		regFBean.setProjectId(1);
		regFBean.setPwd("DAOTEST");
		regFBean.setSecurityQuesId(401);
		regFBean.setSecutityAns("");
		regFBean.setTypeId(200);
		
		
		try {
			empReg.employeeRegistration(regFBean);
		} catch (DatabaseExceptions e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	public void approvalDet(EmployeeRegistrationDaoImpl empReg){
		
		try {
			System.out.println("fghjn"+empReg.viewApprovalDet("AL001"));
		} catch (DatabaseExceptions e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (EmployeeNotFoundExceptions e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

	
	public void approvalList() throws DatabaseExceptions, EmployeeNotFoundExceptions{
		EmployeeRegistrationServiceI serv=new EmployeeRegistrationServiceImpl();
		System.out.println("vvvvvvvvvvvvv"+serv.getAllAwaiting());
	}
	
	
	
	public void approveEmp(RegistrationFormBean regFBean,EmployeeRegistrationDaoImpl empReg) throws DatabaseExceptions{
		regFBean.setAccountStatusId(501);
		regFBean.setCl(6.0f);
		regFBean.setEmpCode("AL023");
		regFBean.setPl(10);
		regFBean.setSl(6);
		regFBean.setTypeId(201);
		regFBean.setYear(2009);
		empReg.registrationApproval(regFBean);
		
	}
	
	
	public void applyLeave(String empCode,LeaveApplicationDaoI applyLeave) throws EmployeeNotFoundExceptions{
		//leave_type_id,start_dt,end_date,duration,emp_id,project_id,reason,tag
		//leave_id,emp_id,leave_status_code,
		//creation_time,last_modified_time,approver1_id,approver2_id,approver3_id
		System.out.println("Hello");
		ApplyLeaveBean applyLeaveBean=new ApplyLeaveBean();
		applyLeaveBean.setLeaveTypeId(601);
		applyLeaveBean.setStartDate("29-09-16");
		applyLeaveBean.setEndDate("30-09-16");
		applyLeaveBean.setDuration(1.5f);
		applyLeaveBean.setReason("Typhoid");
		applyLeaveBean.setTag("#SICK");
		System.out.println(empCode+"nnnnnnnnnnn");
		applyLeave=new LeaveApplicationDaoImpl();
		System.out.println("ydghxj"+applyLeaveBean);
		System.out.println(applyLeave.applyLeave(applyLeaveBean, empCode));
//		System.out.println("Completed");
//		
//		
	
	}
	
}
