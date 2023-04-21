package Doses;

import java.sql.*;
public class DosesDAO_JDBC implements DosesDAO{
    Connection dbConnection;

    public DosesDAO_JDBC(Connection dbconn){
        dbConnection=dbconn;
    }
}
