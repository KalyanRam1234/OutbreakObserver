package RTPCR;

import java.sql.*;
public class RTPCRDAO_JDBC implements RTPCRDAO{
    Connection dbConnection;

    public RTPCRDAO_JDBC(Connection dbconn){
        dbConnection=dbconn;
    }

    @Override
    public RTPCR getRTPCRByStudentId(String id){
        
        RTPCR rtpcr=new RTPCR();
        String sql;
		Statement stmt = null;
        
        try{
            stmt=dbConnection.createStatement();
            sql="select * from rtpcr where studentId = " + id;
            ResultSet rs= stmt.executeQuery(sql);


        }
        catch ( SQLException ex){
            System.out.println("SQLException: " + ex.getMessage());
		    System.out.println("SQLState: " + ex.getSQLState());
		    System.out.println("VendorError: " + ex.getErrorCode());
        }
        return rtpcr;
    }
    
    @Override
    public RTPCR getRTPCRByStudentId_Date(String id, String testDate){
        return null;
    }
    
    @Override
    public RTPCR getRTPCR_postive(){
        return null;
    }

    @Override
    public RTPCR getRTPCRByStudentId_LastDate(String id){
        return null;
    }

}
