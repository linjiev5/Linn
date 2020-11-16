package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 * Sqlと連結する
 * @author user
 *
 */
public class SqlContect {

	public static void main(String[] args) {
		ArrayList<String> aa = searchAll();
		aa.forEach((e) -> {
			System.out.print(e);
			System.out.println();
		});

	}

	public static ArrayList<String> searchAll() {
		Connection conn = null;
		Statement stmt = null;
		String url = "jdbc:postgresql://localHost:5432/Lin";
		String user = "postgres";
		String pas = "postgres";
		ArrayList<String> fr = new ArrayList<>();
		try {
			//ドライバーを登録する
			Class.forName("org.postgresql.Driver");
			//Ｓｑｌに連結する
			conn = DriverManager.getConnection(url, user, pas);

			//search
			stmt = conn.createStatement();
			String sql;
			sql = "SELECT * FROM friend;";
			ResultSet rs = stmt.executeQuery(sql);

			//展開結果Ｓｑｌ
			Friend f = new Friend();
			while (rs.next()) {
				//字段で検索

				f.setNum(rs.getInt("num"));
				f.setName(rs.getString("name"));
				f.setKatakana(rs.getString("katakana"));
				f.setSex(rs.getString("sex"));
				f.setTel(rs.getString("tel"));
				f.setPost(rs.getString("post"));
				f.setAdress(rs.getString("adress"));
				f.setBirthday(rs.getString("birthday"));
				fr.add(f.getNum() + "," + f.getName() + "," + f.getKatakana() + "," + f.getSex() + "," + f.getTel()
						+ "," + f.getPost() + "," + f.getAdress() + "," + f.getBirthday());
			}
			rs.close();
			stmt.close();
			conn.close();

		} catch (SQLException se) {
			se.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			//閉じる
			try {
				if (stmt != null) {
					stmt.close();
				}
			} catch (SQLException se2) {

			}
			try {
				if (conn != null) {
					conn.close();
				}
			} catch (SQLException se) {
				se.printStackTrace();
			}
		}
		return fr;
	}
}
