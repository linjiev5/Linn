/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import soul.co.jp.cmn.dao.Login;
import soul.co.jp.cmn.dao.PayStatus;
import soul.co.jp.cmn.dao.Userinfo;

/**
 *
 * @author user
 */
public class DBConnection {

    static Connection conn = null;
    static Statement stmt = null;

    public static Statement getDBcon() {
        if (conn == null) {
            // 接続文字列
            String url = "jdbc:postgresql://localhost:5432/soul";
            String user = "postgres";
            String password = "postgres";
            try {
                // PostgreSQLへ接続
                conn = DriverManager.getConnection(url, user, password);
                stmt = conn.createStatement();
            } catch (SQLException e) {
                // TODO
            }
        }
        return stmt;
    }

    public static void closeDBcon() throws SQLException {
        if (conn != null) {
            stmt.close();
            conn.close();
        }
    }

    public static int insertUser(Userinfo user) throws SQLException {
        String sql = "INSERT INTO USERINFO (USER_ID, NAME, SEX, BIRTHDAY, STAR, CITY, HOBBY) ";
        sql += "VALUES ( '" + user.getUSER_ID() + "',";
        sql += "'" + user.getNAME() + "',";
        sql += "'" + user.getSEX() + "',";
        sql += "'" + user.getBIRTHDAY() + "',";
        sql += "'" + user.getSTAR() + "',";
        sql += "'" + user.getCITY() + "',";
        sql += "'" + user.getHOBBY() + "')";
        getDBcon().executeUpdate(sql);
        return 1;
    }



    public static int insertLogin(Login lgoin) throws SQLException {
        String sql = "INSERT INTO LOGIN (USER_ID, MAIL, PASSWORD, ZANTAKA) ";
        sql += "VALUES ( '" + lgoin.getUSER_ID() + "',";
        sql += "'" + lgoin.getMAIL()+ "',";
        sql += "'" + lgoin.getPASSWORD()+ "',";
        sql += "'" + lgoin.getZANTAKA()+ "')";
        getDBcon().executeUpdate(sql);
        return 1;
    }


   public static int insertPaystatus(PayStatus paystatus) throws SQLException {
        String sql = "INSERT INTO PAYSTATUS (USER_ID,TARGET_USER_ID)";
        sql += "VALUES ( '" + paystatus.getUSER_ID() + "',";
        sql += "'" + paystatus.getTARGET_USER_ID()+ "')";
        getDBcon().executeUpdate(sql);
        return 1;
    }


    public static Userinfo getUserInfo(String user_id) throws SQLException {
        String sql = "select * from userinfo where user_id = '" + user_id + "'";
        ResultSet rset = getDBcon().executeQuery(sql);
        Userinfo userinfo = null;
        if (rset != null) {
            rset.next(); // レコード＝１
            //String useridStr = rset.getString(1);
            String name = rset.getString(2);
            String sex = rset.getString(3);
            String brithday = rset.getString(4);
            String star = rset.getString(5);
            String city = rset.getString(6);
            String hobby = rset.getString(7);
            userinfo = new Userinfo(user_id, name, sex, brithday, star, city, hobby);
        }
        return userinfo;
    }

    public static List<Userinfo> findSex(String sex) throws SQLException {
        List<Userinfo> list = new ArrayList();
        String sql = "select * from userinfo where sex != '" + sex + "'";
        ResultSet rset = getDBcon().executeQuery(sql);
        Userinfo userinfo = null;
        if (rset != null) {
            while (rset.next()) {
                String useridStr = rset.getString(1);
                String name = rset.getString(2);
                String sexStr = rset.getString(3);
                String brithday = rset.getString(4);
                String star = rset.getString(5);
                String city = rset.getString(6);
                String hobby = rset.getString(7);
                userinfo = new Userinfo(useridStr, name, sexStr, brithday, star, city, hobby);
                list.add(userinfo);
            }
        }
        return list;
    }

    public static String selectMaxUserID() throws SQLException {
        String sql = "SELECT max(user_id) from login";
        ResultSet rset = getDBcon().executeQuery(sql);
        rset.next();
        String rtn = rset.getString(1);
        return rtn;
    }


    public static  Map<String,String> getPaystatus(String user_id) throws SQLException {
        String sql = "select T1.user_id,T2.target_user_id,T3.mail from userinfo T1";
        sql += " left join paystatus T2 on T1.user_id = T2.user_id";
        sql += " left join login T3 on T2.target_user_id = T3.user_id";
        sql += " where T1.user_id = '" + user_id + "'";
        ResultSet rset = getDBcon().executeQuery(sql);
        Map<String,String> map = new HashMap();
        while(rset.next()){
            map.put(rset.getString(2), rset.getString(3));
        }
        return map;
    }

    public static int insertLogin(Userinfo user) throws SQLException {
        // TODO宿題
        return 1;
    }

}
