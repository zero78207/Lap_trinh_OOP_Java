package Thuchanh9.QLBanHang.Management;

import java.sql.*;

public class DBConnection {
    private static final String url = "jdbc:sqlserver://localhost:1433;"
    	                                + "databaseName=QLBANHANG;"
    	                                + "encrypt=true;"
    	                                + "trustServerCertificate=true;";
    private static final String user = "sa";
    private static final String password = "MatKhauMoi@123";
    public static Connection getConnection() throws SQLException{
        return DriverManager.getConnection(url, user, password);
    }
}
