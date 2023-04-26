import Student.*;
import java.sql.*;

import Login.*;
import UseCases.UseCase1.*;
import UseCases.useCase2.*;
import UseCases.useCase3.useCase3_DAO;
import UseCases.useCase3.useCase3_DAO_JDBC;
import UseCases.useCase4.useCase4_DAO;
import UseCases.useCase4.useCase4_DAO_JDBC;
import UseCases.useCase5.useCase5_DAO;
import UseCases.useCase5.useCase5_DAO_JDBC;
import UseCases.useCase6.useCase6_DAO;
import UseCases.useCase6.useCase6_DAO_JDBC;
import UseCases.useCase7.useCase7_DAO;
import UseCases.useCase7.useCase7_DAO_JDBC;

public class DAO_Factory{

	public enum TXN_STATUS { COMMIT, ROLLBACK };

	static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";  
	static final String DB_URL = "jdbc:mysql://localhost/outbreakObserverDB?characterEncoding=latin1&useConfigs=maxPerformance";
	static final String USER = "root";
	static final String PASS = "Kalyan#1234";
	Connection dbconnection = null;

	// You can add additional DAOs here as needed
	StudentDAO studentDAO = null;
	LoginDAO loginDAO=null;
	useCase1_DAO usecase1=null;
	useCase2_DAO usecase2=null;
	useCase3_DAO usecase3=null;
	useCase4_DAO usecase4=null;
	useCase5_DAO usecase5=null;
	useCase6_DAO usecase6=null;
	useCase7_DAO usecase7=null;
	boolean activeConnection = false;

	public DAO_Factory()
	{
		dbconnection = null;
		activeConnection = false;
	}

	public void activateConnection() throws Exception
	{
		if( activeConnection == true )
			throw new Exception("Connection already active");

		System.out.println("Connecting to database...");
		try{
			Class.forName("com.mysql.jdbc.Driver");
			dbconnection = DriverManager.getConnection(DB_URL,USER,PASS);
			dbconnection.setAutoCommit(false);
			activeConnection = true;
		} catch(ClassNotFoundException ex) {
			System.out.println("Error: unable to load driver class!");
			System.exit(1);
		} catch (SQLException ex) {
		    // handle any errors
		    System.out.println("SQLException: " + ex.getMessage());
		    System.out.println("SQLState: " + ex.getSQLState());
		    System.out.println("VendorError: " + ex.getErrorCode());
		}
	}
	//add other DAO's here

	public StudentDAO getStudentDAO() throws Exception
	{
		if( activeConnection == false )
			throw new Exception("Connection not activated...");

		if( studentDAO == null )
			studentDAO = new StudentDAO_JDBC( dbconnection );

		return studentDAO;
	}

	public LoginDAO getLoginDAO() throws Exception
	{
		if( activeConnection == false )
			throw new Exception("Connection not activated...");

		if( studentDAO == null )
			loginDAO = new LoginDAO_JDBC( dbconnection );

		return loginDAO;
	}
	

	public useCase1_DAO getuseCase1DAO() throws Exception
	{
		if( activeConnection == false )
			throw new Exception("Connection not activated...");

		if( usecase1 == null )
			usecase1 = new useCase1_DAO_JDBC( dbconnection );

		return usecase1;
	}
	
	public useCase2_DAO getuseCase2DAO() throws Exception
	{
		if( activeConnection == false )
			throw new Exception("Connection not activated...");

		if( usecase2 == null )
			usecase2 = new useCase2_DAO_JDBC( dbconnection );

		return usecase2;
	}
	public useCase3_DAO getuseCase3DAO() throws Exception
	{
		if( activeConnection == false )
			throw new Exception("Connection not activated...");

		if( usecase3 == null )
			usecase3 = new useCase3_DAO_JDBC( dbconnection );

		return usecase3;
	}

	public useCase4_DAO getuseCase4DAO() throws Exception
	{
		if( activeConnection == false )
			throw new Exception("Connection not activated...");

		if( usecase4 == null )
			usecase4 = new useCase4_DAO_JDBC( dbconnection );

		return usecase4;
	}

	public useCase5_DAO getuseCase5DAO() throws Exception
	{
		if( activeConnection == false )
			throw new Exception("Connection not activated...");

		if( usecase5 == null )
			usecase5 = new useCase5_DAO_JDBC( dbconnection );

		return usecase5;
	}

	public useCase6_DAO getuseCase6DAO() throws Exception
	{
		if( activeConnection == false )
			throw new Exception("Connection not activated...");

		if( usecase6 == null )
			usecase6 = new useCase6_DAO_JDBC( dbconnection );

		return usecase6;
	}

	public useCase7_DAO getuseCase7DAO() throws Exception
	{
		if( activeConnection == false )
			throw new Exception("Connection not activated...");

		if( usecase7 == null )
			usecase7 = new useCase7_DAO_JDBC( dbconnection );

		return usecase7;
	}

	public void deactivateConnection( TXN_STATUS txn_status )
	{
		// Okay to keep deactivating an already deactivated connection
		activeConnection = false;
		if( dbconnection != null ){
			try{
				if( txn_status == TXN_STATUS.COMMIT )
					dbconnection.commit();
				else
					dbconnection.rollback();

				dbconnection.close();
				dbconnection = null;

				// Nullify all DAO objects
				studentDAO = null;
			}
			catch (SQLException ex) {
			    // handle any errors
			    System.out.println("SQLException: " + ex.getMessage());
			    System.out.println("SQLState: " + ex.getSQLState());
			    System.out.println("VendorError: " + ex.getErrorCode());
			}
		}
	}
};

