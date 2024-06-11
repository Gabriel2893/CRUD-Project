package org.example.DAO.CRUD;

import org.example.DAO.Connection.ConnectionDAO;
import org.example.DTO.UserDTO;

import javax.swing.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UserUpdateDAO {

    public void update(UserDTO user) {

        Connection conn = ConnectionDAO.connectDB();

        PreparedStatement pstm = null;

        try {
            pstm = conn.prepareStatement("UPDATE user SET user_name = ? ,user_password = ? WHERE user_id = ?");

            pstm.setString(1,user.getUser_name());
            pstm.setString(2,user.getUser_password());
            pstm.setInt(3,user.getUser_id());

            pstm.executeUpdate();
        } catch (SQLException error) {
            JOptionPane.showMessageDialog(null, "Erro ao atualizar: " + error);
        } finally {
            ConnectionDAO.closeConnection(conn, pstm);
        }
    }
}
