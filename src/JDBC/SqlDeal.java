package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.ArrayList;

/**
 * sqlに取ったデータを検索、削除、追加、更新するメソッド
 * @author user
 *
 */
public class SqlDeal {

	public void addData(String url, String addDatas) {
		Connection conn = null;
		Statement stmt = null;
		String user = "postgres";
		String pas = "postgres";
		try {
			Class.forName("org.postgresql.Driver");
			conn = DriverManager.getConnection(url, user, pas);
			stmt = conn.createStatement();
			String sql;
			sql = "insert into  friend (num,name,katakana,sex,tel,post,adress,birthday) values(101,'工藤新一','クドウシンチ','男','08033554488','123-4455','千葉県習志野市','1999/9/9');";
			stmt.executeUpdate(sql);

			System.out.println("追加しました");

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void search(String key) {
		ArrayList<String> ss = SqlContect.searchAll();
		String[] info = null;

		/*Connection conn = null;
		Statement stmt = null;
		String user = "postgres";
		String pas = "postgres";
		Friend f = new Friend();
		try {
			Class.forName("org.postgresql.Driver");
			conn = DriverManager.getConnection(url, user, pas);
			stmt = conn.createStatement();
			String sql;
			sql = "select num,name from friend;";
			ResultSet rs = stmt.executeQuery(sql);
			ArrayList<String> fr = new ArrayList<>();
			while(rs.next()) {

				System.out.println();
			}


		}catch (Exception e1) {
			e1.printStackTrace();
		}*/
	}
}
