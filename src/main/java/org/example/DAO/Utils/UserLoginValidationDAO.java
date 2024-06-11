package org.example.DAO.Utils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

import org.example.DAO.Connection.ConnectionDAO;
import org.example.DTO.UserDTO;

public class UserLoginValidationDAO {

    Connection conn;

    public ResultSet validateLogin(UserDTO objuserdto) {

        conn = new ConnectionDAO().connectDB();

        try {
            String sql = "SELECT * FROM USER WHERE user_name = ? AND user_password = ?";
            PreparedStatement pstm = conn.prepareStatement(sql);
            pstm.setString(1, objuserdto.getUser_name());
            pstm.setString(2, objuserdto.getUser_password());

            ResultSet rs = pstm.executeQuery();
            return  rs;

        } catch (SQLException error) {
            JOptionPane.showMessageDialog(null, "UserDAO: " + error);
            return null;
        }
    }
}

