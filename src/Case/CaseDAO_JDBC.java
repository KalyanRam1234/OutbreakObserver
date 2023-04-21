package Case;

import java.sql.*;
public class CaseDAO_JDBC implements CaseDAO{
    Connection dbConnection;

    public CaseDAO_JDBC(Connection dbconn){
        dbConnection=dbconn;
    }
}
