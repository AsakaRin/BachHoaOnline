package dao;

import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.util.List;

import model.HangNhap;
import model.SanPham;

public class HangNhapDAO extends DAO{
	
	SanPhamDAO spDAO = new SanPhamDAO();
	
	public HangNhapDAO() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public HangNhap getHangNhap(int id) {
		HangNhap hn = null;
		String sql = "{call SanPham(?)}";
		try {
			CallableStatement cs = con.prepareCall(sql);
			cs.setInt(1, id);
			ResultSet rs = cs.executeQuery();
			while(rs.next()) {
				if(hn == null) hn = new HangNhap();
				hn.setId(rs.getInt("id"));
				
				hn.setSanpham(spDAO.getSanPhamById(rs.getInt("idSanPham")));
				
				hn.setGianhap(rs.getFloat("gianhap"));
				hn.setSoluong(rs.getInt("gianhap"));
			}
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			hn = null;
		}
		
		return hn;
	}	
}
