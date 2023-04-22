package Student;

import java.sql.*;
import java.util.ArrayList;
public class StudentDAO_JDBC implements StudentDAO{
    Connection dbConnection;

    public StudentDAO_JDBC(Connection dbconn){

		dbConnection = dbconn;
	}

    @Override
    public Student getStudentByKey(String rollNo){
        Student s=new Student();
        String sql;
		Statement stmt = null;
        
        try{
            stmt=dbConnection.createStatement();
            sql="select * from student where studentId = '" + rollNo +"'";
            ResultSet rs= stmt.executeQuery(sql);

				//Retrieve by column name
                while(rs.next()){
                    String rollno  = rs.getString("studentId");
                    String fname = rs.getString("fname");
                    String lname = rs.getString("lname");
                    String email= rs.getString("emailId");
                    String gender=rs.getString("gender");
                    String branch=rs.getString("branch");
                    String roomNo=rs.getString("roomNo");
                    String date=rs.getString("dateOfBirth");

                    s=new Student(rollno,fname,lname,date,email,gender,branch,roomNo);
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
    public ArrayList<Student> getStudentsByBatch(String batch){
        ArrayList<Student> list=new ArrayList<Student>(0);
        String sql;
		Statement stmt = null;

        try{
            stmt=dbConnection.createStatement();
            sql="select * from student where studentId like '%" + batch + "%'" ;
            ResultSet rs= stmt.executeQuery(sql);
            
            while(rs.next()){
                String rollno  = rs.getString("studentId");
                String fname = rs.getString("fname");
                String lname = rs.getString("lname");
                String email= rs.getString("emailId");
                String gender=rs.getString("gender");
                String branch=rs.getString("branch");
                String roomNo=rs.getString("roomNo");

                String date=rs.getString("dateOfBirth");

                Student s=new Student(rollno,fname,lname,date,email,gender,branch,roomNo);

                list.add(s);
            }
        }
        catch ( SQLException ex){
            System.out.println("SQLException: " + ex.getMessage());
		    System.out.println("SQLState: " + ex.getSQLState());
		    System.out.println("VendorError: " + ex.getErrorCode());
        }
        return list;
    }
    
    @Override
    public int getStudentCount(){
        String sql;
		Statement stmt = null;
        int count=0;
        try{
            stmt=dbConnection.createStatement();
            sql="select count(*) as count from student" ;
            ResultSet rs= stmt.executeQuery(sql);
            rs.next();
            count=rs.getInt("count");
        }
        catch ( SQLException ex){
            System.out.println("SQLException: " + ex.getMessage());
		    System.out.println("SQLState: " + ex.getSQLState());
		    System.out.println("VendorError: " + ex.getErrorCode());
        }
        return count;
    }
}
