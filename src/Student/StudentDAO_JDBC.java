package Student;

import java.sql.*;

public class StudentDAO_JDBC implements StudentDAO{
    Connection dbConnection;

    public StudentDAO_JDBC(Connection dbconn){

		dbConnection = dbconn;
	}

    @Override
    public Student getStudentByKey(int rollNo){
        Student s=new Student();
        String sql;
		Statement stmt = null;
        
        try{
            stmt=dbConnection.createStatement();
            sql="select * from student where rollno = " + rollNo;
            ResultSet rs= stmt.executeQuery(sql);

				//Retrieve by column name
            String rollno  = rs.getString("studentId");
            String fname = rs.getString("fname");
            String lname = rs.getString("lname");
            String email= rs.getString("emailId");
            String gender=rs.getString("gender");
            String branch=rs.getString("branch");
            String roomNo=rs.getString("roomNo");
            String batch=rs.getString("batch");

            String date=rs.getString("dateOfBirth");

            s=new Student(rollno,fname,lname,date,email,gender,batch,branch,roomNo);

        }
        catch ( SQLException ex){
            System.out.println("SQLException: " + ex.getMessage());
		    System.out.println("SQLState: " + ex.getSQLState());
		    System.out.println("VendorError: " + ex.getErrorCode());
        }
        return s;
        
    }
    //implement functions in interface based on project requirements
}
