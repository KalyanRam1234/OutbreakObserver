package Vaccination;

import java.sql.*;

public class VaccinationDAO_JDBC {
    Connection dbConnection;

    public VaccinationDAO_JDBC(Connection dbconn){

		dbConnection = dbconn;
	}
}
