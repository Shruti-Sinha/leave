package leaveMgmtSystem.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.ParseException;
import java.util.ArrayList;

import leaveMgmtSystem.dbUtil.DBConnection;
import leaveMgmtSystem.dbUtil.SQLQueriesInsert;
import leaveMgmtSystem.dbUtil.SQLQueriesSelect;
import leaveMgmtSystem.dbUtil.SQLQueriesUpdate;
import leaveMgmtSystem.exception.DatabaseExceptions;
import leaveMgmtSystem.exception.EmployeeNotFoundExceptions;
import leaveMgmtSystem.formBeans.RegistrationFormBean;
import leaveMgmtSystem.utility.DateConversion;
import leaveMgmtSystem.utility.StringConstants;
import leaveMgmtSystem.vo.AwaitingEmoVO;

public class EmployeeRegistrationDaoImpl implements EmployeeRegistraionDaoI {

	public static PreparedStatement pst = null;
	static ResultSet result = null;
	static int insertResult = 0;
	static int empId = 0;

	@Override
	public RegistrationFormBean employeeRegistration(RegistrationFormBean regFormBean)
			throws DatabaseExceptions {
		// TODO Auto-generated method stub

		Connection conObj = (Connection) DBConnection.getDBConnection();
		try {
			conObj.setAutoCommit(false);
			pst = conObj.prepareStatement(SQLQueriesInsert.INSERT_EMPLYEE_INFO,
					Statement.RETURN_GENERATED_KEYS);
			pst.setString(1, regFormBean.getEmpCode());
			pst.setString(2, regFormBean.getEmpFName());
			pst.setString(3, regFormBean.getEmpMName());
			pst.setString(4, regFormBean.getEmpLName());
			pst.setString(5, regFormBean.getGender());
			pst.setString(6, regFormBean.getEmail());
			pst.setLong(7, regFormBean.getMobile());
			pst.setDate(8, DateConversion.stringToSQLDate(regFormBean.getDob()));
			pst.setDate(9, DateConversion.stringToSQLDate(regFormBean.getDoj()));
			pst.setInt(10, regFormBean.getProjectId());

			int resRegistration = pst.executeUpdate();
			result = pst.getGeneratedKeys();

			if (result.next()) {
				empId = result.getInt(1);
				System.out.println(empId+"<<<<<<<:");
				
			regFormBean.setEmpId(empId);

				System.out.println(empId);
				
				regFormBean.setApproverId3(StringConstants.HR_EMP_ID);
				if(regFormBean.getTypeId()==201||regFormBean.getTypeId()==202){
					regFormBean.setApproverId1(empId);
					regFormBean.setApproverId2(empId);
					System.out.println(">"+empId);
					
				}
				else if(regFormBean.getTypeId()==203){
					regFormBean.setApproverId1(empId);
					System.out.println(empId+"+");
				}
				System.out.println("App"+empId+" "+regFormBean.getApproverId1()+" "+	regFormBean.getApproverId2());
				
				
				

				pst = conObj
						.prepareStatement(SQLQueriesInsert.INSERT_EMPLOYEE_LOGIN_PROFILE);
				pst.setInt(1, empId);
				System.out.println(regFormBean.getTypeId());
				if(regFormBean.getTypeId()!=201 && regFormBean.getTypeId()!=202 && regFormBean.getTypeId()!=203 && regFormBean.getTypeId()!=204){
					System.out.println("Iam here");
					regFormBean.setTypeId(StringConstants.UNASSIGNED_DESIG);
					pst.setInt(2,regFormBean.getTypeId() );
					
				}else{				
				pst.setInt(2, regFormBean.getTypeId());
				}
				pst.setString(3, regFormBean.getPwd());
				pst.setTimestamp(4, DateConversion.getcurrentTimeStamp());
				pst.setTimestamp(5, DateConversion.getcurrentTimeStamp());
				pst.setInt(6, regFormBean.getSecurityQuesId());
				pst.setString(7, regFormBean.getSecutityAns());
				regFormBean.setAccountStatusId(StringConstants.AWAITING_ACCOUNT_ID);
				pst.setInt(8, StringConstants.AWAITING_ACCOUNT_ID);
				pst.setInt(9, regFormBean.getApproverId1());
				pst.setInt(10, regFormBean.getApproverId2());
				pst.setInt(11, regFormBean.getApproverId3());
				

				int resProfile = pst.executeUpdate();

				if (resProfile == 0 || resRegistration == 0) {

					System.out.println("Record not inserted");
					conObj.rollback();
					insertResult = 0;
				} else {
					conObj.commit();
					System.out.println("Record inserted");
					insertResult = 1;
					

				}
			}
			else{
				conObj.rollback();
			}
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new DatabaseExceptions("Please check the date format");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new DatabaseExceptions(e.getMessage());
		}
		if(insertResult==1){
			return regFormBean;
		}
		else{
			return null;
		}
	}
	
	

	@Override
	public int registrationApproval(RegistrationFormBean regFormBean) throws DatabaseExceptions {
		// TODO Auto-generated method stub
		Connection conObj = (Connection) DBConnection.getDBConnection();
		int mgrIns=0;
		try {
			conObj.setAutoCommit(false);

			pst=conObj.prepareStatement(SQLQueriesSelect.SELECT);
			pst.setString(1, regFormBean.getEmpCode());
			result=pst.executeQuery();
			if (result.next()) {
				empId = result.getInt(1);
				System.out.println(empId+"<<<<<<<:");
				
			regFormBean.setEmpId(empId);

				System.out.println(empId);
			}
				
				regFormBean.setApproverId3(StringConstants.HR_EMP_ID);
				if(regFormBean.getTypeId()==201||regFormBean.getTypeId()==202){
					regFormBean.setApproverId1(empId);
					regFormBean.setApproverId2(empId);
					System.out.println(">"+empId);
					
				}
				else if(regFormBean.getTypeId()==203){
					regFormBean.setApproverId1(empId);
					System.out.println(empId+"+");
				}
				System.out.println("App"+empId+" "+regFormBean.getApproverId1()+" "+	regFormBean.getApproverId2());
			
			pst = conObj
					.prepareStatement(SQLQueriesUpdate.UPD_EMPLOYEE_LOGIN_PROFILE_ADMIN);
			pst.setString(7, regFormBean.getEmpCode());
			pst.setInt(1, regFormBean.getTypeId());
			pst.setTimestamp(2, DateConversion.getcurrentTimeStamp());
			pst.setInt(3, regFormBean.getAccountStatusId());
			regFormBean.setApproverId3(StringConstants.HR_EMP_ID);
			
			
				
				
		
			
			if(regFormBean.getTypeId()==201||regFormBean.getTypeId()==202){
				System.out.println("here"+empId);
				regFormBean.setApproverId1(empId);
				regFormBean.setApproverId2(empId);
				if(regFormBean.getTypeId()==201){
					regFormBean.setApproverId3(empId);
					}
				
				System.out.println(regFormBean.getApproverId1()+" "+regFormBean.getApproverId2()+" "+regFormBean.getApproverId3());
				
			}
			
			else if(regFormBean.getTypeId()==203){
				System.out.println("hi");
				regFormBean.setApproverId1(empId);
			}
			

			pst.setInt(4, regFormBean.getApproverId1());
			pst.setInt(5, regFormBean.getApproverId2());
			pst.setInt(6, regFormBean.getApproverId3());
			int updLogin = pst.executeUpdate();

			pst = conObj
					.prepareStatement(SQLQueriesInsert.INSERT_LEAVE_CREDITED);
			/* emp_id,sl,cl,pl,comp_off,mat_leave,pet_leave,fin_year */
			System.out.println(regFormBean.getEmpCode());
			pst.setString(1, regFormBean.getEmpCode());
			pst.setFloat(2, regFormBean.getSl());
			pst.setFloat(3, regFormBean.getCl());
			pst.setFloat(4, regFormBean.getPl());
			pst.setFloat(5, regFormBean.getCompOff());
			pst.setFloat(6, regFormBean.getMatLeave());
			pst.setFloat(7, regFormBean.getPatLeave());
			pst.setInt(8, regFormBean.getYear());
			int insLeaveCredited = pst.executeUpdate();

			pst=conObj.prepareStatement(SQLQueriesInsert.INSERT_EMPLOYEE_MANAGER);
			
			if(regFormBean.getApproverId1()!=empId && empId!=regFormBean.getApproverId2()){
			pst.setInt(1, regFormBean.getApproverId1());
			pst.setInt(2, empId);
			pst.setInt(3, StringConstants.EMP_MGR_STATUS);
			System.out.println("1");
			
			}
		
			else if (regFormBean.getApproverId1()==empId && empId!=regFormBean.getApproverId2()){
				pst.setInt(1, regFormBean.getApproverId2());
				pst.setInt(2, empId);
				pst.setInt(3, StringConstants.EMP_MGR_STATUS);
				System.out.println("3");
				
			}
			
			else if(regFormBean.getApproverId2()==empId && empId!=regFormBean.getApproverId3()){
				pst.setInt(1, regFormBean.getApproverId3());
				pst.setInt(2, empId);
				pst.setInt(3, StringConstants.EMP_MGR_STATUS);
			}
			
			else if(regFormBean.getApproverId2()==empId){
				pst.setInt(1, empId);
				pst.setInt(2, empId);
				pst.setInt(3, StringConstants.EMP_MGR_STATUS);
			}
			mgrIns=pst.executeUpdate();
			
			
			
			if (updLogin == 0 || insLeaveCredited == 0) {

				System.out.println("Record not inserted");
				conObj.rollback();
				insertResult = 0;
			} else {
				conObj.commit();
				System.out.println("Record inserted");
				insertResult = 1;
				
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new DatabaseExceptions(e.getMessage());
		}

		return insertResult;
	}

	@Override
	public ArrayList<AwaitingEmoVO> viewAwaitingApproval() throws DatabaseExceptions, EmployeeNotFoundExceptions {

		Connection conObj = (Connection) DBConnection.getDBConnection();
		PreparedStatement pstmt=null;
		ArrayList<AwaitingEmoVO> awaitingArayList=null;

		try {
			conObj.setAutoCommit(false);
			pstmt=conObj.prepareStatement(SQLQueriesSelect.SELECT_EMPLOYEE_LOGIN_PROFILE_MASTER_AWATING);
			pstmt.setInt(1,StringConstants.AWAITING_ACCOUNT_ID );
			result=pstmt.executeQuery();
			Boolean b = result.next();
			System.out.println(b);
			if(b){
				
				awaitingArayList= new ArrayList<AwaitingEmoVO>();
			
			while(b){
				AwaitingEmoVO aVO= new AwaitingEmoVO();
				aVO.setEmpId(result.getInt(1));
				aVO.setEmpFname(result.getString(2));
				awaitingArayList.add(aVO);
				b=result.next();
				
			}
			conObj.commit();
			}
			else {
				throw new EmployeeNotFoundExceptions("No new approval request");
			}
			System.out.println(awaitingArayList+"<<<<<<");
			return awaitingArayList;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new DatabaseExceptions(e.getMessage());
		}

				

		// TODO Auto-generated method stub
	}

	@Override
	public RegistrationFormBean viewApprovalDet(String empCode) throws EmployeeNotFoundExceptions, DatabaseExceptions {
		// TODO Auto-generated method stub
		Connection conObj = (Connection) DBConnection.getDBConnection();
		System.out.println(empCode);
		PreparedStatement pstmt=null;

		try {
			conObj.setAutoCommit(false);
			System.out.println(SQLQueriesSelect.SELECT_EMPLOYEE_DETAILS);
			pstmt=conObj.prepareStatement(SQLQueriesSelect.SELECT_EMPLOYEE_DETAILS);
			pstmt.setString(1,empCode );
			System.out.println(pstmt);
			result=pstmt.executeQuery();
						Boolean bool = result.next();
			System.out.println(bool);
			if(bool){
				RegistrationFormBean regFbean=new RegistrationFormBean();
				regFbean.setEmpCode(result.getString(2));
				regFbean.setEmpFName(result.getString(3));
				regFbean.setEmpMName(result.getString(4));
				regFbean.setEmpLName(result.getString(5));
				regFbean.setGender(result.getString(6));
				regFbean.setEmail(result.getString(7));
				regFbean.setMobile(result.getInt(8));
				regFbean.setDob(result.getString(9));
				regFbean.setDoj(result.getString(10));
				regFbean.setProjectId(result.getInt(11));
				regFbean.setTypeId(result.getInt(13));
				regFbean.setPwd(result.getString(14));
				regFbean.setSecurityQuesId(result.getInt(17));
				regFbean.setSecutityAns(result.getString(18));
				
				

			
			conObj.commit();
			return regFbean;
			}
			else {
				throw new EmployeeNotFoundExceptions("Invalid Employee ID");
			}
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new DatabaseExceptions(e.getMessage());
		}

				

		// TODO Auto-generated method stub

		
		
	}

}
