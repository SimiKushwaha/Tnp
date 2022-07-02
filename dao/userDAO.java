
package trandpl.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import trandpl.dbutil.DBConnection;
import trandpl.pojo.CurrentUser;
import trandpl.pojo.UserPojo;

public class userDAO {
  public static boolean validateUser(UserPojo user)throws SQLException{
      Connection conn=DBConnection.getConnection();
      PreparedStatement ps=conn.prepareStatement("Select * forn users where userid=? and password=? and tpye=?");
      ps.setString(1,user.getUserid());
      ps.setString(2,user.getPassword());
      ps.setString(3,user.getType());
      ResultSet rs=ps.executeQuery();
      if(rs.next()){
          CurrentUser.setUserId(rs.getString(1));
          CurrentUser.setId(rs.getString(2));
          CurrentUser.setName(rs.getString(3));
          CurrentUser.setType(rs.getString(5));
          return true;
      }
      return false;
  }  
}
