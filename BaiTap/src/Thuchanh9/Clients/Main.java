package Thuchanh9.Clients;
import java.sql.*;
public class Main {
    static Statement stm;
    static Connection conn;
    public static void main(String[] args) throws SQLException {

    	String url = "jdbc:sqlserver://localhost:1433;"
    	           + "databaseName=QLKhachSan;"
    	           + "encrypt=true;"
    	           + "trustServerCertificate=true;";

    	String user = "sa";
    	String password = "MatKhauMoi@123";

        try {
            conn = DriverManager.getConnection(
                url, user, password
            );

            System.out.println("Ket noi SQL Server thanh cong!");

            System.out.println("Database: "
                + conn.getCatalog());

            stm = conn.createStatement();
            String sql1 = "select * from khachhang";
            getInfor(sql1);
            /*String sql2 = "insert into khachhang values('KH04', N'Từ Minh Đức', '2007-08-07', N'Nam')";
            updateInfor(sql2);*/
            /*String sql3 = "update khachhang set tenKH = N'Từ Đức' where makh = 'KH04'";
            updateInfor(sql3);*/
            String sql4 = "delete from khachhang where makh = 'KH04'";
            updateInfor(sql4);
        } catch (Exception e) {
            e.printStackTrace();
        }finally{
            if(conn!=null)
                conn.close();
        }
    }
    public static void getInfor(String sql) throws SQLException{
        ResultSet rs = stm.executeQuery(sql);
        while(rs.next()){
            String makh = rs.getString(1);
            String hoTen = rs.getNString(2);
            Date ns = rs.getDate(3);
            String gt = rs.getNString(4);
            System.out.println(makh + "|" + hoTen + "|" + ns + "|" + gt);
        }
    }
    public static void updateInfor(String sql) throws SQLException {
		stm.executeUpdate(sql);
	}
}
