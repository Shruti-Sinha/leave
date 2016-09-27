package leaveMgmtSystem.dao;

import java.util.ArrayList;

import leaveMgmtSystem.exception.DatabaseExceptions;
import leaveMgmtSystem.exception.EmployeeNotFoundExceptions;
import leaveMgmtSystem.formBeans.RegistrationFormBean;
import leaveMgmtSystem.vo.AwaitingEmoVO;

public interface EmployeeRegistraionDaoI {
	
	/**
	 * @author Shruti
	 * @param regFormBean
	 * @return
	 * @throws DatabaseExceptions
	 */
	public RegistrationFormBean employeeRegistration(RegistrationFormBean regFormBean) throws DatabaseExceptions;
	public int registrationApproval(RegistrationFormBean regFormBean) throws DatabaseExceptions;
	/**
	 * @author Shruti
	 * @return
	 * @throws DatabaseExceptions
	 * @throws EmployeeNotFoundExceptions
	 */
	public ArrayList<AwaitingEmoVO> viewAwaitingApproval() throws DatabaseExceptions, EmployeeNotFoundExceptions;
	public RegistrationFormBean viewApprovalDet(String EmpCode) throws EmployeeNotFoundExceptions, DatabaseExceptions;
	

}
