package Student;

import java.sql.*;

public class StudentDAO_JDBC implements StudentDAO{
    Connection dbConnection;

    public StudentDAO_JDBC(Connection dbconn){

		dbConnection = dbconn;
	}

    //implement functions in interface based on project requirements
}
