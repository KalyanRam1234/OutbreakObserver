package UseCases.useCase6;

import java.sql.*;
import java.util.ArrayList;

public class useCase6_DAO_JDBC implements useCase6_DAO{
    Connection dbConnection;

    public useCase6_DAO_JDBC(Connection dbconn){

		dbConnection = dbconn;
	}

    public useCase6 getInfo(ResultSet rs){
        useCase6 s=new useCase6();
        try{
            String id  = rs.getString("studentId");
            String name = rs.getString("Full_Name");
            String date = rs.getString("diagnosis_date");
            String testId=rs.getString("testId");
            String qroomNo=rs.getString("qroomNo");
            String healthStatus=rs.getString("healthStatus");
            
            s=new useCase6(id, name, date, testId, qroomNo, healthStatus);
        }
        catch ( SQLException ex){
            System.out.println("SQLException: " + ex.getMessage());
		    System.out.println("SQLState: " + ex.getSQLState());
		    System.out.println("VendorError: " + ex.getErrorCode());
        }
        return s;
    }


    public void enterInfectedDetails(String studentId, String caseId, String name, String date, String testId, String qroomNo, String sdate, String edate, String healthStatus)
    {
        PreparedStatement preparedStatement = null;																																																																																																																																													
		String sql;
		sql = "insert into posCase(caseId, studentId, qroomNo, testId, diagnosisDate) values (?,?,?,?,?)";

		try {
			preparedStatement = dbConnection.prepareStatement(sql);
 
			preparedStatement.setString(1, studentId);
			preparedStatement.setString(2, caseId);
            preparedStatement.setString(3, date);
            preparedStatement.setString(4, testId);
            preparedStatement.setString(5, qroomNo);
 
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

         sql = "insert into quarantine(caseId, startDate, endDate, healthStatus) values (?,?,?,?)";
 
         try {
             preparedStatement = dbConnection.prepareStatement(sql);
  
             preparedStatement.setString(1, caseId);
             preparedStatement.setString(2, sdate);
             preparedStatement.setString(3, edate);
             preparedStatement.setString(4, healthStatus);
  
             // execute insert SQL stetement
             preparedStatement.executeUpdate();
             System.out.println("Data entered successfully.\n");
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

    @Override
    public void updateInfectedDetails(String studentId, String caseId, String name, String date, String testId,
            String qroomNo, String sdate, String edate, String healthStatus) {
                PreparedStatement preparedStatement = null;																																																																																																																																													
                String sql;
                sql = "UPDATE student SET date=?, testId, qroomNo=?, sdate=?, edate=?, healthStatus=? WHERE studentId=?";
        
                try {
                    preparedStatement = dbConnection.prepareStatement(sql);
                    
                    preparedStatement.setInt(2, student.getRollno());
                    preparedStatement.setString(1, student.getName());
                    // execute update SQL stetement
                    preparedStatement.executeUpdate();
         
                    System.out.println("Student: Roll No " + student.getRollno() 
                        + ", name updated in the database");
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

    @Override
    public void removeInfectedDetails(String caseId) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'removeInfectedDetails'");
    }
}