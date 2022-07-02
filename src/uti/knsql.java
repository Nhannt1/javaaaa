package uti;
	import java.sql.*;
	public class knsql {
		private static Connection conn= null;
		public static Connection getConnection() {
			if(conn==null) {
				try {
					Class.forName("com.mysql.jdbc,Driver");
					conn =DriverManager.getConnection("jdbc:mysql://localhost/nhannt","root","");
				} catch (ClassNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} 
			}
			return conn;
		}
		
	public static PreparedStatement getpst(String sql) {
		PreparedStatement pst=null;
		try {
			pst= getConnection().prepareStatement(sql);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return pst;
	}
}