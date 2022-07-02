package dao;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.*;


import domain.CauThu;
import uti.knsql;
public class CauThudao {
	public static List<CauThu> timTatCa(){
		try {
			List<CauThu> dsct = new ArrayList<>();
			String sql = "select * from CauThu";
			PreparedStatement pst = knsql.getpst(sql);
			ResultSet rs = pst.executeQuery();
			if(rs.isBeforeFirst()){
				while(rs.next()) {
					CauThu ct= new CauThu(rs.getInt(1),rs.getString(2),rs.getDate(3),rs.getString(4));
					dsct.add(ct);
				}
			}
			return dsct;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
}
