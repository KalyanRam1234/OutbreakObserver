package Quarantine;

import java.sql.*;
public class QuarantiveDAO_JDBC implements QuarantineDAO {
    Connection dbConnection;

    public QuarantiveDAO_JDBC( Connection dbconn){ dbConnection=dbconn;}
}
