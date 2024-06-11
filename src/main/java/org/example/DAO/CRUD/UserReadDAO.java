package org.example.DAO.CRUD;

import org.example.DAO.Connection.ConnectionDAO;
import org.example.DTO.UserDTO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class UserReadDAO {

    public List <UserDTO> read() {
        Connection conn = ConnectionDAO.connectDB();
        PreparedStatement pstm = null;
        List<UserDTO> users = new ArrayList<>();
        try {
            pstm = conn.prepareStatement("SELECT * FROM user");
            ResultSet rs = pstm.executeQuery();
            while (rs.next()) {
                UserDTO objuser = new UserDTO();

                objuser.setUser_Id(rs.getInt("user_id"));
                objuser.setUser_name(rs.getString("user_name"));
                objuser.setUser_password(rs.getString("user_password"));
                users.add(objuser);
            }
        } catch (SQLException error) {
            Logger.getLogger(UserReadDAO.class.getName()).log(Level.SEVERE, null, error);
        } finally {
            ConnectionDAO.closeConnection(conn, pstm);
        }
        return users;
    }
}
