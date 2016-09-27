package leaveMgmtSystem.test;

import leaveMgmtSystem.dao.EmployeeRegistraionDaoI;
import leaveMgmtSystem.dao.EmployeeRegistrationDaoImpl;
import leaveMgmtSystem.exception.DatabaseExceptions;
import leaveMgmtSystem.exception.EmployeeNotFoundExceptions;
import leaveMgmtSystem.formBeans.RegistrationFormBean;
import leaveMgmtSystem.service.EmployeeRegistrationServiceI;
import leaveMgmtSystem.service.EmployeeRegistrationServiceImpl;

public class TestApp {
	
	public static void main(String[] args) throws DatabaseExceptions, EmployeeNotFoundExceptions {
		
		RegistrationFormBean regFBean=new RegistrationFormBean();
		EmployeeRegistraionDaoI empReg=new EmployeeRegistrationDaoImpl();
		/*
		
		
		*/
		/*
		try {
			System.out.println("fghjn"+empReg.viewApprovalDet("AL001"));
		} catch (DatabaseExceptions e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (EmployeeNotFoundExceptions e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		*/
		
		
		//EmployeeRegistrationServiceI serv=new EmployeeRegistrationServiceImpl();
		//System.out.println("vvvvvvvvvvvvv"+serv.getAllAwaiting());
		
		
		

		regFBean.setAccountStatusId(501);
		regFBean.setCl(6.0f);
		regFBean.setEmpCode("AL023");
		regFBean.setPl(10);
		regFBean.setSl(6);
		regFBean.setTypeId(201);
		regFBean.setYear(2009);
		empReg.registrationApproval(regFBean);
		
		
		
		
		
		
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

}
