package org.example.DAO.Connection;

import javax.swing.JOptionPane;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ConnectionDAO {

    public static Connection connectDB(){
        Connection conn = null;

        try {
            String url = "jdbc:mysql://localhost:3306/bankaccount?user=root";
            conn = DriverManager.getConnection(url);

        }   catch (SQLException error){
            JOptionPane.showMessageDialog(null, "ConexãoDAO" + error.getMessage());
        }
        return conn;
    }

    public static void closeConnection(Connection conn) {
        try {
            if (conn != null) {
                conn.close();
            }
        } catch (SQLException ex) {
            Logger.getLogger(ConnectionDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static void closeConnection(Connection conn, PreparedStatement pstm) {

        closeConnection(conn);

        try {

            if (pstm != null) {
                pstm.close();
            }

        } catch (SQLException ex) {
            Logger.getLogger(ConnectionDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static void closeConnection(Connection con, PreparedStatement stmt, ResultSet rs) {

        closeConnection(con, stmt);

        try {

            if (rs != null) {
                rs.close();
            }

        } catch (SQLException ex) {
            Logger.getLogger(ConnectionDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
