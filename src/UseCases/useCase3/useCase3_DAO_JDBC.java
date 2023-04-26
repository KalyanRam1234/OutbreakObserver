package UseCases.useCase3;

import java.sql.*;
import java.util.ArrayList;

public class useCase3_DAO_JDBC implements useCase3_DAO {

    Connection dbConnection;

    public useCase3_DAO_JDBC(Connection dbconn){

		dbConnection = dbconn;
	}

    public useCase3 getInfo(ResultSet rs){
        useCase3 s=new useCase3();
        try{
            String rollno  = rs.getString("s.studentId");
            String fullName = rs.getString("s.fname") + rs.getString("s.lname");
            String email= rs.getString("s.emailId");
            String testId=rs.getString("r.testId");
            String date=rs.getString("r.testDate");
            int result=rs.getInt("r.test_result");
            if(result==0)
            
            s=new useCase3(studentId, roomNo, vstatus, vdoses, rtpcr_id, rtpcr_testDate, rtpcr_testResult, infected);
        }
        catch ( SQLException ex){
            System.out.println("SQLException: " + ex.getMessage());
		    System.out.println("SQLState: " + ex.getSQLState());
		    System.out.println("VendorError: " + ex.getErrorCode());
        }
        return s;
    }


    @Override
    public ArrayList<useCase3> getRoommatesInfo(String studentId) {
        ArrayList<useCase3> slist=new ArrayList<useCase3>();
        String sql;
        Statement stmt = null;
    
        try{
            stmt=dbConnection.createStatement();
            sql="select s.studentId, s.roomNo, v.vaccinationStatus,  r.testId, r.testDate, r.test_result, s.emailId from student s inner join vaccination v where r.studentId = s.studentId and s.studentId = v.studentId and ";
            ResultSet rs= stmt.executeQuery(sql);
        		//Retrieve by column name
            while(rs.next()){
                useCase3 s=getInfo(rs);
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
    
}
