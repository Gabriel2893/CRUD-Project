package org.example.DAO.CRUD;

import org.example.DAO.Connection.ConnectionDAO;
import org.example.DTO.UserDTO;

import javax.swing.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UserDeleteDAO {
    public void delete(UserDTO user) {

        Connection conn = ConnectionDAO.connectDB();

        PreparedStatement pstm = null;

        try {
            pstm = conn.prepareStatement("DELETE FROM user WHERE user_id = ?");
            pstm.setInt(1,user.getUser_id());
            pstm.executeUpdate();
        } catch (SQLException error) {
            JOptionPane.showMessageDialog(null, "Delete Error: " + error);
        } finally {
            ConnectionDAO.closeConnection(conn, pstm);
        }
    }
}
