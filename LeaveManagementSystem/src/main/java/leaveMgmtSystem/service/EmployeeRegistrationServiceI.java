package leaveMgmtSystem.service;

import java.util.List;

import leaveMgmtSystem.exception.DatabaseExceptions;
import leaveMgmtSystem.exception.EmployeeNotFoundExceptions;
import leaveMgmtSystem.formBeans.RegistrationFormBean;
import leaveMgmtSystem.vo.AwaitingEmoVO;

public interface EmployeeRegistrationServiceI {
	
	public RegistrationFormBean employeeRegistration(RegistrationFormBean regFBean) throws DatabaseExceptions;
	
	public List<AwaitingEmoVO> getAllAwaiting() throws DatabaseExceptions,
			EmployeeNotFoundExceptions;
	
	public RegistrationFormBean getAwaitingDet(String empCode) throws EmployeeNotFoundExceptions, DatabaseExceptions;
	
	public int giveApproval(RegistrationFormBean regFormBean) throws DatabaseExceptions;

}
