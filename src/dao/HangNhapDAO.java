package dao;

import java.sql.CallableStatement;
import java.sql.ResultSet;

import model.HangNhap;
import model.SanPham;

public class HangNhapDAO extends DAO{
	public HangNhapDAO() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public HangNhap getHangNhap() {
		SanPham sp = null;
		String sql = "{call SanPham(?)}";
		try {
			CallableStatement cs = con.prepareCall(sql);
			cs.setInt(1, id);
			ResultSet rs = cs.executeQuery();
			while(rs.next()) {
				if(sp == null) sp = new HangNhap();
				sp.setId(rs.getInt("id"));
				sp.setMaSP(rs.getFloat("giaNhap"));
				sp.setTonkho(rs.getInt("soLuong"));
				sp.setSP(getSP(rs.getInt("SanPhamid")));
			}
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			sp = null;
		}
		
		return sp;
	}
	
	public List<SanPham> getDSSPTheoNCC(int id) {
		List<SanPham> list = null;

		try {
			CallableStatement cs = con.prepareCall(sql);
			cs.setInt(1, id);
			ResultSet rs = cs.executeQuery();

			while (rs.next()) {
				if (SanPham == null)
					SanPham = new SanPham();
				SanPham.setId(rs.getInt("id"));
				SanPham.setMaloaiSP(rs.getString("maloaiSP"));
				SanPham.setTenloadSP(rs.getString("tenloaiSP"));
			}

			return loaiSP;
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			list = null;
		}
		
		return list;
	}
}
