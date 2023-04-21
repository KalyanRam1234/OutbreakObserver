package RTPCR;

import java.sql.*;
public class RTPCRDAO_JDBC implements RTPCRDAO{
    Connection dbConnection;

    public RTPCRDAO_JDBC(Connection dbconn){
        dbConnection=dbconn;
    }
}
