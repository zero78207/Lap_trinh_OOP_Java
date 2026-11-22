package Thuchanh9.QLBanHang.Management;

import Thuchanh9.QLBanHang.Entities.*;
import java.sql.*;
import java.util.ArrayList;

public class DanhSach {

    // 3.1 Lấy danh sách tất cả khách hàng
    public ArrayList<Customer> getAllCustomers() throws SQLException {
        ArrayList<Customer> list = new ArrayList<>();
        String sql = "SELECT customer_id, customer_name FROM customer";
        try (Connection con = DBConnection.getConnection();
             Statement st = con.createStatement();
             ResultSet rs = st.executeQuery(sql)) {
            while (rs.next()) {
                list.add(new Customer(rs.getInt("customer_id"), rs.getString("customer_name")));
            }
        }
        return list;
    }

    // 3.2 Lịch sử đơn hàng của một khách hàng
    public ArrayList<Orders> getOrdersByCustomer(int customerId) throws SQLException {
        ArrayList<Orders> list = new ArrayList<>();
        String sql = "SELECT * FROM orders WHERE customer_id = ?";
        try (Connection con = DBConnection.getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setInt(1, customerId);
            try (ResultSet rs = ps.executeQuery()) {
                while (rs.next()) {
                    list.add(new Orders(rs.getInt("order_id"), rs.getDate("order_date"),
                            rs.getInt("customer_id"), rs.getInt("employee_id"),
                            rs.getDouble("total")));
                }
            }
        }
        return list;
    }

    // 3.3 Chi tiết một đơn hàng
    public ArrayList<LineItem> getLineItems(int orderId) throws SQLException {
        ArrayList<LineItem> list = new ArrayList<>();
        String sql = "SELECT * FROM lineItem WHERE order_id = ?";
        try (Connection con = DBConnection.getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setInt(1, orderId);
            try (ResultSet rs = ps.executeQuery()) {
                while (rs.next()) {
                    list.add(new LineItem(rs.getInt("order_id"), rs.getInt("product_id"),
                            rs.getInt("quantity"), rs.getDouble("price")));
                }
            }
        }
        return list;
    }

    // 3.4 Tính tổng giá trị đơn hàng bằng UDF computeOrderTotal
    public double computeOrderTotal(int orderId) throws SQLException {
        double total = 0;
        String sql = "SELECT dbo.computeOrderTotal(" + orderId + ")";
        try (Connection con = DBConnection.getConnection();
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql)) {
            if (rs.next()) {
                total = rs.getDouble(1);
            }
        }
        return total;
    }

    // 3.5 Thêm khách hàng (Stored Procedure)
    public boolean addCustomer(int id, String name) throws SQLException {
        String sql = "EXEC sp_AddCustomer " + id + ", N'" + name + "'";
        try (Connection con = DBConnection.getConnection();
            Statement st = con.createStatement()) {
            int rows = st.executeUpdate(sql);
            if (rows > 0) {
                return true;
            } else {
                return false;
            }
        }
    }

    // 3.6 Cập nhật khách hàng (Stored Procedure)
    public boolean updateCustomer(int id, String name) throws SQLException {
        String sql = "EXEC sp_UpdateCustomer " + id + ", N'" + name + "'";
        try (Connection con = DBConnection.getConnection();
            Statement st = con.createStatement()) {
            int rows = st.executeUpdate(sql);
            if (rows > 0) {
                return true;
            } else {
                return false;
            }
        }
    }

    // 3.7 Xóa khách hàng (Stored Procedure, tự xóa đơn hàng + chi tiết)
    public void deleteCustomer(int id) throws SQLException {
        String sql = "EXEC sp_DeleteCustomer " + id;
        try (Connection con = DBConnection.getConnection();
            Statement st = con.createStatement()) {
            st.executeUpdate(sql);
        }
    }

    // 3.8 Tạo đơn hàng mới (total ban đầu = 0)
    public boolean createOrder(int orderId, Date date, int customerId, int employeeId) throws SQLException {
        String sql = "INSERT INTO orders(order_id, order_date, customer_id, employee_id, total) "
                   + "VALUES (" + orderId + ", '" + date + "', " + customerId + ", " + employeeId + ", 0)";
        try (Connection con = DBConnection.getConnection();
            Statement st = con.createStatement()) {
            int rows = st.executeUpdate(sql);
            if (rows > 0) {
                return true;
            } else {
                return false;
            }
        }
    }

    // 3.9 Thêm mặt hàng vào đơn hàng
    public boolean addLineItem(int orderId, int productId, int quantity, double price) throws SQLException {
        String sql = "INSERT INTO lineItem(order_id, product_id, quantity, price) "
                   + "VALUES (" + orderId + ", " + productId + ", " + quantity + ", " + price + ")";
        try (Connection con = DBConnection.getConnection();
            Statement st = con.createStatement()) {
            int rows = st.executeUpdate(sql);
            if (rows > 0) {
                return true;
            } else {
                return false;
            }
        }
    }

    // 3.10 Cập nhật lại cột total của đơn hàng (dùng lại UDF)
    public boolean updateOrderTotal(int orderId) throws SQLException {
        String sql = "UPDATE orders SET total = dbo.computeOrderTotal(" + orderId + ") "
                   + "WHERE order_id = " + orderId;
        try (Connection con = DBConnection.getConnection();
            Statement st = con.createStatement()) {
            int rows = st.executeUpdate(sql);
            if (rows > 0) {
                return true;
            } else {
                return false;
            }
        }
    }
}