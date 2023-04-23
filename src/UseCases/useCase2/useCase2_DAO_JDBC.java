package UseCases.useCase2;

import java.sql.*;
import java.util.ArrayList;

import RTPCR.RTPCR;

public class useCase2_DAO_JDBC implements useCase2_DAO{
    Connection dbConnection;

    public useCase2_DAO_JDBC(Connection dbconn){

		dbConnection = dbconn;
	}

    public useCase2 getInfo(ResultSet rs){
        useCase2 s=new useCase2();
        try{
            String rollno  = rs.getString("s.studentId");
            String fullName = rs.getString("s.fname") + rs.getString("s.lname");
            String email= rs.getString("s.emailId");
            String testId=rs.getString("r.testId");
            String date=rs.getString("r.testDate");
            int result=rs.getInt("r.test_result");
            if(result==0)
            
            s=new useCase2(rollno,fullName,date,testId,"Negative" ,email);

            else s=new useCase2(rollno,fullName,date,testId,"Positive" ,email);
        }
        catch ( SQLException ex){
            System.out.println("SQLException: " + ex.getMessage());
		    System.out.println("SQLState: " + ex.getSQLState());
		    System.out.println("VendorError: " + ex.getErrorCode());
        }
        return s;
    }

    // @Override
    // public useCase2 getStudentRTPCR_Status(String rollNo, String Date){
    //     useCase2 s=new useCase2();
    //     String sql;
	// 	Statement stmt = null;

    //     try{
    //         stmt=dbConnection.createStatement();
    //         sql="select s.studentId, concat(fname,' ',lname) as " + "Full_Name" + ", s.gender, s.roomNo, s.emailId, r.testId,r.testDate, r.test_result from student as s join rtpcr as r where s.studentId='" + rollNo+ "' and s.studentId=r.studentId and r.testDate='"+ Date +"'";
    //         ResultSet rs= stmt.executeQuery(sql);
	// 			//Retrieve by column name
    //         while(rs.next()){
    //             s=getInfo(rs);
    //             break;
    //         }
    //     }
    //     catch ( SQLException ex){
    //         System.out.println("SQLException: " + ex.getMessage());
	// 	    System.out.println("SQLState: " + ex.getSQLState());
	// 	    System.out.println("VendorError: " + ex.getErrorCode());
    //     }
    //     return s;
    // }

    // @Override
    // public ArrayList<useCase2> getBatchRTPCR_Status(String batch, String Date){
    //     ArrayList<useCase2> list=new ArrayList<useCase2>(0);
    //     String sql;
	// 	Statement stmt = null;

    //     try{
    //         stmt=dbConnection.createStatement();
    //         sql="select s.studentId, concat(fname,' ',lname) as " + "Full_Name" + ", s.gender, s.roomNo, s.emailId, r.testId,r.testDate, r.test_result from student as s join rtpcr as r where s.studentId like '%" + batch+ "%' and s.studentId=r.studentId and r.testDate='"+ Date +"'" ;

    //         ResultSet rs= stmt.executeQuery(sql);
            
    //         while(rs.next()){
    //             useCase2 s=getInfo(rs);
    //             list.add(s);
    //         }

    //     }
    //     catch ( SQLException ex){
    //         System.out.println("SQLException: " + ex.getMessage());
	// 	    System.out.println("SQLState: " + ex.getSQLState());
	// 	    System.out.println("VendorError: " + ex.getErrorCode());
    //     }
    //     return list;
    // }

    // @Override
    // public ArrayList<useCase2> getCollegeRTPCR_Status(String Date){
    //     ArrayList<useCase2> list=new ArrayList<useCase2>(0);
    //     String sql;
	// 	Statement stmt = null;

    //     try{
    //         stmt=dbConnection.createStatement();
    //         sql="select s.studentId, concat(fname,' ',lname) as " + "Full_Name" + ", s.gender, s.roomNo, s.emailId, r.testId,r.testDate, r.test_result from student as s join rtpcr as r where s.studentId=r.studentId and r.testDate='"+ Date +"'" ;

    //         ResultSet rs= stmt.executeQuery(sql);
            
    //         while(rs.next()){
    //             useCase2 s=getInfo(rs);
    //             list.add(s);
    //         }

    //     }
    //     catch ( SQLException ex){
    //         System.out.println("SQLException: " + ex.getMessage());
	// 	    System.out.println("SQLState: " + ex.getSQLState());
	// 	    System.out.println("VendorError: " + ex.getErrorCode());
    //     }
    //     return list;
    // }
 
    @Override
    public useCase2 getMyRTPCR_Status(String rollNo, String Date) {
        useCase2 s=new useCase2();
        String sql;
        Statement stmt = null;
    
        try{
            stmt=dbConnection.createStatement();
            sql="select s.studentId, s.fname, s.lname, r.testDate, r.testId, r.test_result, s.emailId from student s inner join rtcpr r where r.studentId = s.studentId and s.studentId = " + rollNo + "and r.testDate = " + Date;
            ResultSet rs= stmt.executeQuery(sql);
        		//Retrieve by column name
            while(rs.next()){
                s=getInfo(rs);
                break;
            }
        }
        catch ( SQLException ex){
            System.out.println("SQLException: " + ex.getMessage());
            System.out.println("SQLState: " + ex.getSQLState());
            System.out.println("VendorError: " + ex.getErrorCode());
        }
        return s;
    }

    @Override
    public ArrayList<useCase2> getAllMyRTPCR_Status(String rollNo) {
        ArrayList<useCase2> slist=new ArrayList<useCase2>();
        String sql;
        Statement stmt = null;
    
        try{
            stmt=dbConnection.createStatement();
            sql="select s.studentId, s.fname, s.lname, r.testDate, r.testId, r.test_result, s.emailId from student s inner join rtcpr r where r.studentId = s.studentId and s.studentId = " + rollNo;
            ResultSet rs= stmt.executeQuery(sql);
        		//Retrieve by column name
            while(rs.next()){
                useCase2 s=getInfo(rs);
                slist.add(s);
            }
        }
        catch ( SQLException ex){
            System.out.println("SQLException: " + ex.getMessage());
            System.out.println("SQLState: " + ex.getSQLState());
            System.out.println("VendorError: " + ex.getErrorCode());
        }
        return slist;
    }

    @Override
    public void addMyRTPCR_Status(RTPCR rtpcr) {
        PreparedStatement preparedStatement = null;																																																																																																																																													
		String sql;
		sql = "insert into rtpcr(testId, studentId, testDate, test_result, certif) values (?,?,?,?,?)";

		try {
			preparedStatement = dbConnection.prepareStatement(sql);
 
			preparedStatement.setString(1, rtpcr.gettestId());
			preparedStatement.setString(2, rtpcr.getstudentId());
            preparedStatement.setString(3, rtpcr.gettestDate());
            preparedStatement.setString(4, rtpcr.gettest_Result());
            preparedStatement.setString(5, rtpcr.getCertificate());
 
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