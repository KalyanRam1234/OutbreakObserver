package RTPCR;

import java.sql.*;
import java.util.ArrayList;

public class RTPCRDAO_JDBC implements RTPCRDAO{
    Connection dbConnection;

    public RTPCRDAO_JDBC(Connection dbconn){
        dbConnection=dbconn;
    }

    @Override
    public ArrayList<RTPCR> getRTPCRByStudentId(String id){
        
        ArrayList<RTPCR> rtpcr_list = new ArrayList<RTPCR>();
        String sql;
		Statement stmt = null;
        
        try{
            stmt=dbConnection.createStatement();
            sql="select * from rtpcr where studentId = " + id;
            ResultSet rs= stmt.executeQuery(sql);

            while(rs.next()){

                String studentId  = rs.getString("studentId");
                String testDate = rs.getString("testDate");
                String test_result = (rs.getString("test_result").equals("1"))?"Positive":"Negative";
                String certificate= rs.getString("certif");
                String testId=rs.getString("testId");

                RTPCR rtpcr = new RTPCR(testId, studentId, testDate, test_result, certificate);
                rtpcr_list.add(rtpcr);
            }

        }
        catch ( SQLException ex){
            System.out.println("SQLException: " + ex.getMessage());
		    System.out.println("SQLState: " + ex.getSQLState());
		    System.out.println("VendorError: " + ex.getErrorCode());
        }


        return rtpcr_list;
    }
    
    @Override
    public RTPCR getRTPCRByStudentId_Date(String id, String tDate){
        
        RTPCR rtpcr = null; 
        String sql;
		Statement stmt = null;
        
        try{
            stmt=dbConnection.createStatement();
            sql="select * from rtpcr where studentId = " + id + " AND testDate = " + tDate;
            ResultSet rs= stmt.executeQuery(sql);

            while(rs.next()){

                String studentId  = rs.getString("studentId");
                String testDate = rs.getString("testDate");
                String test_result = (rs.getString("test_result").equals("1"))?"Positive":"Negative";
                String certificate= rs.getString("certif");
                String testId=rs.getString("testId");

                rtpcr = new RTPCR(testId, studentId, testDate, test_result, certificate);
                break;
            }

        }
        catch ( SQLException ex){
            System.out.println("SQLException: " + ex.getMessage());
		    System.out.println("SQLState: " + ex.getSQLState());
		    System.out.println("VendorError: " + ex.getErrorCode());
        }


        return rtpcr;
    }
    
    @Override
    public ArrayList<RTPCR> getRTPCR_postive(){
        
        ArrayList<RTPCR> rtpcr_list = new ArrayList<RTPCR>();
        String sql;
		Statement stmt = null;
        
        try{
            stmt=dbConnection.createStatement();
            sql="select * from rtpcr where test_result=1";
            ResultSet rs= stmt.executeQuery(sql);

            while(rs.next()){

                String studentId  = rs.getString("studentId");
                String testDate = rs.getString("testDate");
                String test_result = (rs.getString("test_result").equals("1"))?"Positive":"Negative";
                String certificate= rs.getString("certif");
                String testId=rs.getString("testId");

                RTPCR rtpcr = new RTPCR(testId, studentId, testDate, test_result, certificate);
                rtpcr_list.add(rtpcr);
            }

        }
        catch ( SQLException ex){
            System.out.println("SQLException: " + ex.getMessage());
		    System.out.println("SQLState: " + ex.getSQLState());
		    System.out.println("VendorError: " + ex.getErrorCode());
        }

        return rtpcr_list;
    }

    @Override
    public ArrayList<RTPCR> getRTPCR_negative(){

        ArrayList<RTPCR> rtpcr_list = new ArrayList<RTPCR>();
        String sql;
		Statement stmt = null;
        
        try{
            stmt=dbConnection.createStatement();
            sql="select * from rtpcr where test_result=0";
            ResultSet rs= stmt.executeQuery(sql);

            while(rs.next()){

                String studentId  = rs.getString("studentId");
                String testDate = rs.getString("testDate");
                String test_result = (rs.getString("test_result").equals("1"))?"Positive":"Negative";
                String certificate= rs.getString("certif");
                String testId=rs.getString("testId");

                RTPCR rtpcr = new RTPCR(testId, studentId, testDate, test_result, certificate);
                rtpcr_list.add(rtpcr);
            }

        }
        catch ( SQLException ex){
            System.out.println("SQLException: " + ex.getMessage());
		    System.out.println("SQLState: " + ex.getSQLState());
		    System.out.println("VendorError: " + ex.getErrorCode());
        }

        return rtpcr_list;
    }

    @Override
    public RTPCR getRTPCRByStudentId_LastDate(String id){
        RTPCR rtpcr = null; 
        String sql;
		Statement stmt = null;
        
        try{
            stmt=dbConnection.createStatement();
            sql="select * from rtpcr where studentId = " + id + " AND testDate = (select max(testDate) from rtpcr where studentId= " + id + ")";
            ResultSet rs= stmt.executeQuery(sql);

            while(rs.next()){

                String studentId  = rs.getString("studentId");
                String testDate = rs.getString("testDate");
                String test_result = (rs.getString("test_result").equals("1"))?"Positive":"Negative";
                String certificate= rs.getString("certif");
                String testId=rs.getString("testId");

                rtpcr = new RTPCR(testId, studentId, testDate, test_result, certificate);
                break;
            }

        }
        catch ( SQLException ex){
            System.out.println("SQLException: " + ex.getMessage());
		    System.out.println("SQLState: " + ex.getSQLState());
		    System.out.println("VendorError: " + ex.getErrorCode());
        }

        return rtpcr;
    }

    @Override
    public void enterRTPCR(String testId, String studentId, String testDate,int testResult,String certif)
    {
        PreparedStatement preparedStatement = null;																																																																																																																																													
		String sql;
		sql = "insert into rtpcr(testId, studentId, testDate, testResult, certif) values (?,?,?,?,?)";

		try {
			preparedStatement = dbConnection.prepareStatement(sql);
 
			preparedStatement.setString(1, testId);
			preparedStatement.setString(2, studentId);
            preparedStatement.setString(3, testDate);
            preparedStatement.setInt(4, testResult);
            preparedStatement.setString(5, certif);
 
			// execute insert SQL stetement
			preparedStatement.executeUpdate();

		} catch (SQLException e) {
 			System.out.println(e.getMessage());
 		}

		try{
			if (preparedStatement != null) {
				preparedStatement.close();
			}
		} catch (SQLException e) {
 			System.out.println(e.getMessage());
 		}
    }
}
