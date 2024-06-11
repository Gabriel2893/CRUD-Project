package org.example.DAO.CRUD;

import org.example.DAO.Connection.ConnectionDAO;
import org.example.DTO.UserDTO;

import javax.swing.*;
import java.sql.Connection;
import java.sql.PreparedStatement;

public class UserRegisterCreateDAO {

    Connection conn;
    PreparedStatement pstm;

    public void userRegister (UserDTO objuserregisterdto) {
        String sql = "INSERT INTO user (user_name, user_password) values (?, ?)";

        conn = new ConnectionDAO().connectDB();

        try {
            pstm = conn.prepareStatement(sql);
            pstm.setString(1,objuserregisterdto.getUser_name());
            pstm.setString(2,objuserregisterdto.getUser_password());

            pstm.execute();
            pstm.close();
        } catch (Exception error) {
            JOptionPane.showMessageDialog(null, "UserRegisterDAO" + error);
        }finally {
            ConnectionDAO.closeConnection(conn, pstm);
        }
    }
}
