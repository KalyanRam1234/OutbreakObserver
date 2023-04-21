package HostelRoom;
import java.sql.*;

public class HostelDAO_JDBC implements HostelDAO {

    Connection dbConnection;

    public HostelDAO_JDBC(Connection dbconn){

		dbConnection = dbconn;
	}

    //implement functions in interface based on project requirements
}
