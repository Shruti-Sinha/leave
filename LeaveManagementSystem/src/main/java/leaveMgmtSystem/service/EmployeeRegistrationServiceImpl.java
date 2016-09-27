package leaveMgmtSystem.service;

import java.util.List;

import leaveMgmtSystem.dao.EmployeeRegistraionDaoI;
import leaveMgmtSystem.dao.EmployeeRegistrationDaoImpl;
import leaveMgmtSystem.exception.DatabaseExceptions;
import leaveMgmtSystem.exception.EmployeeNotFoundExceptions;
import leaveMgmtSystem.formBeans.RegistrationFormBean;
import leaveMgmtSystem.vo.AwaitingEmoVO;

public class EmployeeRegistrationServiceImpl implements EmployeeRegistrationServiceI{

	EmployeeRegistraionDaoI empRegDao=null;
	
	
	@Override
	public List<AwaitingEmoVO> getAllAwaiting() throws DatabaseExceptions,
			EmployeeNotFoundExceptions {
		// TODO Auto-generated method stub
		empRegDao=new EmployeeRegistrationDaoImpl();
		
		return empRegDao.viewAwaitingApproval();
		
		
	}

	@Override
	public RegistrationFormBean getAwaitingDet(String empCode) throws EmployeeNotFoundExceptions, DatabaseExceptions {
		// TODO Auto-generated method stub
empRegDao=new EmployeeRegistrationDaoImpl();
		
		return empRegDao.viewApprovalDet(empCode);
	}

	@Override
	public RegistrationFormBean employeeRegistration(RegistrationFormBean regFBean)
			throws DatabaseExceptions {
		// TODO Auto-generated method stub
		empRegDao=new EmployeeRegistrationDaoImpl();
		
		return empRegDao.employeeRegistration(regFBean);
		
	}

	@Override
	public int giveApproval(RegistrationFormBean regFormBean) throws DatabaseExceptions {
		// TODO Auto-generated method stub
empRegDao=new EmployeeRegistrationDaoImpl();
		System.out.println(regFormBean.getEmpCode());
		return empRegDao.registrationApproval(regFormBean);
	}

}
